package typingsJapgolly.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationRequest extends StObject {
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ResourceGroupName
}
object DeleteApplicationRequest {
  
  inline def apply(ResourceGroupName: ResourceGroupName): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
  
  extension [Self <: DeleteApplicationRequest](x: Self) {
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
