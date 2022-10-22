package typingsJapgolly.azureArmResource.mod

import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ManagementGroupsModels {
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typingsJapgolly.azureArmResource.libManagementModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typingsJapgolly.azureArmResource.libManagementModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
