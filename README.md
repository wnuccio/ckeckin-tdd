# TDD demonstration

You have to write a CheckIn service that provides the opportunity to do an online check-in.

The rules are the following:

- the service accept the airline and the number of passengers
- the check-in is available for all spanish airline
- the ckeck-in is available for italian airline only if the number of passengers is not greater than 3
- if the number of passenger or the airline is not specified, the service return a "Parameter xxx not specified" message
- if the check-in is available the service returns a "Ok" message
- if the check-in is not available the service returns a "Not available" message

