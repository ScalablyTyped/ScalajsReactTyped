package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcModelsMod.Options
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedScenario
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedScenarioOutline
import typingsJapgolly.jestCucumber.distSrcModelsMod.ScenarioFromStepDefinitions
import typingsJapgolly.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcValidationStepDefinitionValidationMod {
  
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenarioOutline,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")(options.asInstanceOf[js.Any], parsedScenario.asInstanceOf[js.Any], scenarioFromStepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenario,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")(options.asInstanceOf[js.Any], parsedScenario.asInstanceOf[js.Any], scenarioFromStepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def matchSteps(stepFromFeatureFile: String, stepMatcher: String): Boolean | RegExpMatchArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSteps")(stepFromFeatureFile.asInstanceOf[js.Any], stepMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean | RegExpMatchArray | Null]
  inline def matchSteps(stepFromFeatureFile: String, stepMatcher: js.RegExp): Boolean | RegExpMatchArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSteps")(stepFromFeatureFile.asInstanceOf[js.Any], stepMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean | RegExpMatchArray | Null]
}
