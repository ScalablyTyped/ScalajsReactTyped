package typingsJapgolly.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
  
  var QueryString: js.UndefOr[typingsJapgolly.awsSdk.clientsIotwirelessMod.QueryString] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId): StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest]
  }
  
  extension [Self <: StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "QueryString", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
