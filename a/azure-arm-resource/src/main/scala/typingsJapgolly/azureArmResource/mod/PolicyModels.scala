package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolicyModels {
  
  @JSImport("azure-arm-resource", "PolicyModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libPolicyModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "PolicyModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libPolicyModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
