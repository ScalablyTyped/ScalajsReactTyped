package typingsJapgolly.paypalPaypalJs.typesApisOrdersMod

import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.PICKUP_IN_PERSON
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.SHIPPING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingInfoWithType
  extends StObject
     with ShippingInfoBase
     with ShippingInfo {
  
  var options: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: SHIPPING | PICKUP_IN_PERSON
}
object ShippingInfoWithType {
  
  inline def apply(`type`: SHIPPING | PICKUP_IN_PERSON): ShippingInfoWithType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingInfoWithType]
  }
  
  extension [Self <: ShippingInfoWithType](x: Self) {
    
    inline def setType(value: SHIPPING | PICKUP_IN_PERSON): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
