# Spring Cloud Function example

## Exposed Functions as Endpoints
- *Supplier* - `/supply` - returns an output

```
curl -H 'Content-Type: text/plain' http://localhost:8080/supply
Hello Youtube⏎                                                                                                      

```

- *Consumer* - `/consume` - expects an input

```
curl -H 'Content-Type: text/plain' http://localhost:8080/consume -d 'Hello TechPrimer'
```

- *Function* - `/function` - expects an input and output
```
curl -H 'Content-Type: text/plain' http://localhost:8080/function -d 'Hello TechPrimer'
Hello TechPrimer⏎    
```

- *Function* - `/hello` - expects an input and output
```                                                                                        
curl -H 'Content-Type: text/plain' http://localhost:8080/hello -d 'TechPrimers'
Hello TechPrimers⏎  
```