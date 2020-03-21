package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "ResourceModels")
@js.native
object ResourceModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typingsJapgolly.msRestAzure.mod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typingsJapgolly.azureArmResource.resourceModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

