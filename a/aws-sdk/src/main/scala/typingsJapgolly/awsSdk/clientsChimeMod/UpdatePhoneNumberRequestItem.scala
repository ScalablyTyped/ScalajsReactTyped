package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberRequestItem extends StObject {
  
  /**
    * The outbound calling name to update.
    */
  var CallingName: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.CallingName] = js.undefined
  
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString
  
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
}
object UpdatePhoneNumberRequestItem {
  
  inline def apply(PhoneNumberId: NonEmptyString): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
  
  extension [Self <: UpdatePhoneNumberRequestItem](x: Self) {
    
    inline def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    inline def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    inline def setPhoneNumberId(value: NonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
  }
}
