package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LockModels {
  
  @JSImport("azure-arm-resource", "LockModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libLockModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LockModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libLockModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
