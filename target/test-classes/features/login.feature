Feature: Search Movie

Scenario: Able to search movie
Given Page has opened and working
When User enters the text in the serach field
And The user clicks on the search button
Then The movie list should be displayed


Scenario: Able to search list Of movies
Given Page has opened and working
When User enters details in the serach field
|Spiderman	|2026	|
|Revenant	|2018	|
And The user searches more movies
|Movie	|Actor	|Director	|
|movie1	|Actor1	|Director1	|
|movie2	|Actor2	|Director2	|
|movie3	|Actor3	|Director3	|
|movie4	|Actor4	|Director4	|
Then The movie list should be displayed
