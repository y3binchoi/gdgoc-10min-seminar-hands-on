#!/bin/bash

# 사용할 엔드포인트 목록
ENDPOINTS=(
  "http://localhost:8080/users"
  "http://localhost:8080/users/slow"
  "http://localhost:8080/users/error"
)

# 인자로 받은 반복 횟수, 없으면 기본값 50
ITERATIONS=${1:-50}

echo "🚀 가짜 트래픽 보내는 중... (Total: $ITERATIONS requests)"

for ((i = 1; i <= ITERATIONS; i++)); do
  INDEX=$((RANDOM % ${#ENDPOINTS[@]}))
  URL="${ENDPOINTS[$INDEX]}"
  
  echo "[$i/$ITERATIONS] Requesting: $URL"
  curl -s -o /dev/null -w "%{http_code}\n" "$URL"

  sleep 1
done

echo "✅ 가짜 트래픽 생성 완."
