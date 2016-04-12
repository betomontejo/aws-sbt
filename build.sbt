name := "AWS SBT REPL"

version := "0.1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.10.67"

initialCommands in console := """
import com.amazonaws.regions._
import com.amazonaws.services.ec2._

val region = Region.getRegion(Regions.EU_WEST_1) 

val ec2 = region.createClient(classOf[AmazonEC2Client], null, null)
"""
