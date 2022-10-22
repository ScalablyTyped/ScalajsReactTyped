package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DeliveryAddressValueSpec extends StObject {
  
  /**
    * Configuration for delivery address dialog.
    */
  var addressOptions: js.UndefOr[GoogleActionsV2DeliveryAddressValueSpecAddressOptions] = js.undefined
}
object GoogleActionsV2DeliveryAddressValueSpec {
  
  inline def apply(): GoogleActionsV2DeliveryAddressValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpec]
  }
  
  extension [Self <: GoogleActionsV2DeliveryAddressValueSpec](x: Self) {
    
    inline def setAddressOptions(value: GoogleActionsV2DeliveryAddressValueSpecAddressOptions): Self = StObject.set(x, "addressOptions", value.asInstanceOf[js.Any])
    
    inline def setAddressOptionsUndefined: Self = StObject.set(x, "addressOptions", js.undefined)
  }
}
