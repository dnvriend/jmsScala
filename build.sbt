name := "jms-scala"

organization := "com.github.dnvriend"

version := "0.82-SNAPSHOT"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

fullResolvers := {
  ("JBoss" at "https://repository.jboss.org/nexus/content/groups/public") +: fullResolvers.value
}

libraryDependencies += "javax.jms" % "jms" % "1.1"

scalaSource in Compile := baseDirectory.value / "src"

excludeFilter in unmanagedSources := "example"

// enable scala code formatting //
import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform

// Scalariform settings
SbtScalariform.autoImport.scalariformPreferences := SbtScalariform.autoImport.scalariformPreferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(RewriteArrowSymbols, true)