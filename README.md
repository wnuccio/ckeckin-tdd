# TDD demonstration

You have to write a CheckIn service that provides the opportunity to do an online check-in.

The rules are the following:

- the service accepts the airline and the number of passengers
- the check-in is available for all **spanish** airline
- the ckeck-in is available for **italian** airline only if the **number of passengers is not greater than 3**
- the ckeck-in is not available for  other airlines

The service return a string as a response:
- if any of the two parameters is not specified, the response is "**xxx not specified**" message
- if the check-in is available the service returns a "**Ok**" message
- if the check-in is not available the service returns a "**Not available**" message


The following are all airlines:
- Iberia (spanish)
- Vueling (spanish)
- Alitalia (italian)
- Neos (italian)
- Airfrance (franch)
