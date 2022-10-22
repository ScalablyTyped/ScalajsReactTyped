package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedScenario
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedScenarioOutline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodeGenerationScenarioGenerationMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateScenarioCode(scenario: ParsedScenario): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateScenarioCode")(scenario.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateScenarioCode(scenario: ParsedScenarioOutline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateScenarioCode")(scenario.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenario): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateScenarioCodeWithSeparateStepFunctions")(scenario.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenarioOutline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateScenarioCodeWithSeparateStepFunctions")(scenario.asInstanceOf[js.Any]).asInstanceOf[String]
}
