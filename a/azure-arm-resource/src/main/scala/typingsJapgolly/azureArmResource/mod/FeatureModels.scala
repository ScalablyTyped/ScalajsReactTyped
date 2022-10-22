package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureModels {
  
  @JSImport("azure-arm-resource", "FeatureModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libFeatureModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "FeatureModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libFeatureModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
