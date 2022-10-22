package typingsJapgolly.jestCucumber

import typingsJapgolly.jestCucumber.distSrcFeatureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typingsJapgolly.jestCucumber.distSrcModelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAutomaticStepBindingMod {
  
  @JSImport("jest-cucumber/dist/src/automatic-step-binding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoBindSteps")(features.asInstanceOf[js.Any], stepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
