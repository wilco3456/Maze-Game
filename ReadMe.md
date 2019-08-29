# Simple Maze Game

## Platform Recommendation
* This program has been run on Windows 10.0.15063 build 15063 and Mac OS X, developed using Java version 12.0.2, Intellij version 2018.3.5
Other systems have not been tested, and it is advised to have caution with untested OS.

## Note
* This work was compiled in Intellij. To compile it for use on the same service, copy and paste all java files into an Intelij src folder, then add to the Java Library all files except Maze_Game.jar, that is the executable file.

## To Start
* Open a command line window and navigate to the folder holding the program's *.jar* file.
* Then type: java -jar Maze_Game.jar, which should run the program.

## How to use the Program
* Firstly, you will be prompted to enter ther filename of the maze or quit.  
**NOTE: type *quit* if you wish terminate the program or type *maze61.txt*, if you wish to proceed with the game's execution. A different maze file can also be selected, if the contents of the file are of a similar format to the file *maze61.txt*.**

* Once the program has oficially launched, you may use the arrow keys to control the blue marker:
  * **UP** Key, to move the blue marker upwards.
  * **DOWN** Key, to move the blue marker downwards.
  * **LEFT** Key, to move the blue marker to the left.
  * **RIGHT** Key, to move the blue marker to the right.

* Once you have traversed the blue marker to the location of the red marker, you'll be informed that you have won the game.

## Example Gameplay
<pre>
C\...\Maze_Game_jar>java -jar Maze_Game.jar

Please input the filename of the maze you wish to find, else input quit (to exit)
maze61.txt

#############################################################
#1    #             #         #   #           #             #
# ### # ######### # # ##### ### # # ####### ### # ######### #
#   #     #       # #     #   # # #   #   # #   #   # #   # #
######### # ##### ##### ##### # # ### ### # # ##### # # # # #
#   #   # # #   # #     #   # # #   #     #     # # #   # # #
# # # # # # # # ### ##### # # # # ####### ##### # # ##### # #
# #   # # #   # #   #   # #   # #         #   #   #     #   #
# ##### ##### # # ##### # ##### ########### # ### ##### # ###
# #   #     # # # #     #       # #       # #   # #     #   #
# ### ##### ### # ### ########### # ### # # ### ### ####### #
#   #     #     #   #       #       #   # #   #     #     # #
# # # # ### ####### ##### # # ####### ### ### ####### ### # #
# # # # #   #       #   # # # # #     #     # #     #   # # #
# # ### # ### ####### # # ### # # ########### # ### # # # # #
# #   #   # #   #     # #   #   # #           # #   # # # # #
# ### # ### ### # ##### ### ### # # ########### ### # # # # #
# #   #     # # # # #   #   #   # # #   #         # # # # # #
# # ####### # # # # # ### ### ### # # ### ####### ### # ### #
# # #     # # # # #   # #     #   # #     #     #     #     #
# # ##### # # # # # ### # ##### ### # ##### ### # ###########
# #     #   # #   #   # #     # #   # #     #   #         # #
# ##### # ### ####### # ### ### # # ### ##### ########### # #
# #   # #   #       # #     #   # # #   #   #       #   # # #
### # # ### # ####### ##### # # # # # ### ######### # # # # #
#   #   # # #     #   #   # # # # # # #           #   # #   #
# ####### # ##### # ### # ### ### # # ##### ##### ##### ### #
#   #     #     # #     #     #   # # #     #     #   #   # #
### # # ####### # ########### # ##### # ##### ####### ### # #
#   # #               #     # #     # # #   # #     #   # # #
# # ################### # ### ##### # # # ### # # # # ### # #
# # #                 # #   #   #   #   #     # # #   #   # #
# ### ########### ### # ### ### # ####### ####### ##### ### #
# #   #         #   # # #   #   #       # #       #     # # #
# # ### ####### ##### # # ### ######### # # ####### ##### # #
#     # #     #     #   #   # #     # #     #     # # #     #
# ##### # ######### # ##### # # # # # ####### ### # # # #####
# #     #       #   #   #   # # # #       #   # # # # # #   #
# # ##### ### # # ##### # ### # # ####### # ### # # # # # ###
# # #   # # # # # #     #     # # #       # #   #   # # #   #
# # # # # # # # # ####### ####### # ####### # ####### # ### #
# # # # #   # # #       #   #   # #   #     #         #     #
### # # # ### # ####### ### # # # # ### ##### ####### ##### #
#   # # # #   #   #     #   # #   # #   #     # #   #     # #
# ### # # # ####### ##### ### ##### # ### ##### # # # ### # #
# #   # # # #       #   #   # # #   # #         # #   # # # #
# # ### # # # ######### ### # # # ### # ######### ##### # # #
#   #   # #   #           #   # # #   #   #   #   # #   # # #
# ### ### ######### # ######### # # ####### # # ### # # # # #
#   #   #   #     # #   #     #   # #     # #   #     #   # #
### ### ### # ### ##### # ### # ### # ### # # ############# #
# #   # #     #       # # # # #   #   #   # # #   #       # #
# ### # ### ######### # # # # # ####### ### ### # # ##### # #
#   # #   # #   #     #     #   #     # #     # #   #     # #
# # # ### ### # # ##### ######### ### # ##### # ##### ##### #
# #     #     # # #     #       #   # #     #       # #   # #
# ######### ### # ##### # ##### # # # ##### ####### # # # # #
# #   #   #   # #     # # #   # # # #     #   #     #   #   #
### # # # ##### ##### ### # # # ### ##### ### # #############
#   #   #       #         # #       #         #            2#
#############################################################

</pre>

## Visual Demo

![Maze_Demo](/Images/Maze_Demo.png)
