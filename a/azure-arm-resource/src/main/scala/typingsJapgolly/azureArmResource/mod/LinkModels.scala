package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkModels {
  
  @JSImport("azure-arm-resource", "LinkModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libLinkModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LinkModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libLinkModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
