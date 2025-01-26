#!/bin/bash

while true; do
    echo "Custom Health Check:"
    curl -s http://localhost:8080/custom-health | jq '.'
    echo -e "\nActuator Health Check:"
    curl -s http://localhost:8080/actuator/health | jq '.'
    echo -e "\n-----------------------------------\n"
    sleep 1
done
