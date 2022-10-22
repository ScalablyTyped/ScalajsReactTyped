package typingsJapgolly.sdpTransform.anon

import typingsJapgolly.sdpTransform.sdpTransformStrings.excl
import typingsJapgolly.sdpTransform.sdpTransformStrings.incl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressTypes extends StObject {
  
  var addressTypes: String
  
  var destAddress: String
  
  var filterMode: excl | incl
  
  var netType: String
  
  var srcList: String
}
object AddressTypes {
  
  inline def apply(
    addressTypes: String,
    destAddress: String,
    filterMode: excl | incl,
    netType: String,
    srcList: String
  ): AddressTypes = {
    val __obj = js.Dynamic.literal(addressTypes = addressTypes.asInstanceOf[js.Any], destAddress = destAddress.asInstanceOf[js.Any], filterMode = filterMode.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], srcList = srcList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressTypes]
  }
  
  extension [Self <: AddressTypes](x: Self) {
    
    inline def setAddressTypes(value: String): Self = StObject.set(x, "addressTypes", value.asInstanceOf[js.Any])
    
    inline def setDestAddress(value: String): Self = StObject.set(x, "destAddress", value.asInstanceOf[js.Any])
    
    inline def setFilterMode(value: excl | incl): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    inline def setSrcList(value: String): Self = StObject.set(x, "srcList", value.asInstanceOf[js.Any])
  }
}
