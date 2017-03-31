# BerlinClock
A two-hour coding exercise to recreate the Berlin Clock.
This program allows the user to enter a time in the format HH:MM:SS and be shown what this time would look like on the Berlin Clock.
The first row of the Berlin Clock shows seconds, and it blinks every two seconds.
The second row is a series of four red lamps, each representing 5 hours of time.
The third row is another series of four red lamps; each of these represent 1 hour of time.
The fourth row has 11 lamps, each representing 5 minutes of time.  All lamps in this row are yellow, except the lamps that represent :15, :30, and :45 minutes; those are red.
The final row is a series of four red lamps, which each represent 1 minute of time.
[R] indicates that a red lamp is lit; [Y] indicates that a yellow lamp is lit; and [O] indicates that a lamp is turned off.

I had enough time to complete my Berlin Clock project, but not to validate the user's entries.  I was creating another class called BerlinClockValidation when my two hours started winding down, so that part is incomplete.
For the validation, I would've checked to make sure that the user's entry was formatted as ##:##:##.  I also wanted to check that the first series of numbers, representing hours, fell between 00-23; that the second series of numbers, representing minutes, fell between 00-59; and that the final series of numbers, representing seconds, fell between 00-59.
I also would've liked to have been able to go through my code again to clean up some of my methods.  In some cases, I was using brute force to get the OFF lamps to appear, when I would've preferred to spend more time working on the project and used loops to show where lamps were OFF.
