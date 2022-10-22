package typingsJapgolly.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLabelGroupRequest extends StObject {
  
  /**
    *  The name of the label group that you want to delete. Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var LabelGroupName: typingsJapgolly.awsSdk.clientsLookoutequipmentMod.LabelGroupName
}
object DeleteLabelGroupRequest {
  
  inline def apply(LabelGroupName: LabelGroupName): DeleteLabelGroupRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelGroupRequest]
  }
  
  extension [Self <: DeleteLabelGroupRequest](x: Self) {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
  }
}
