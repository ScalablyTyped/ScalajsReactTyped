package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResourceModels {
  
  @JSImport("azure-arm-resource", "ResourceModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libResourceModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ResourceModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libResourceModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
