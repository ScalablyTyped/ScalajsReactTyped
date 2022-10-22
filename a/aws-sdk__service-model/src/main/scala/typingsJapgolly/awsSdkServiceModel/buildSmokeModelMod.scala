package typingsJapgolly.awsSdkServiceModel

import typingsJapgolly.awsSdkBuildTypes.buildSmokeTestModelMod.SmokeTestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSmokeModelMod {
  
  @JSImport("@aws-sdk/service-model/build/SmokeModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSmokeTestModelJson(modelJson: String): SmokeTestModel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSmokeTestModelJson")(modelJson.asInstanceOf[js.Any]).asInstanceOf[SmokeTestModel]
  
  inline def isSmokeTestModel(model: Any): /* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmokeTestModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/build-types.@aws-sdk/build-types/build/SmokeTestModel.SmokeTestModel */ Boolean]
}
