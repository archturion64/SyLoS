# SyLoS
### System Load in Spring

This Application exposes the system's hardware utilisation as a REST API.
Currently CPU load is supported.

Calling "http://localhost:8080/cpuload" results in the following responce (depending on CPU and utilisation):

```JSON
{"cpuTotalLoad":11,"cpuCoresLoad":[13,11,8,10]}
