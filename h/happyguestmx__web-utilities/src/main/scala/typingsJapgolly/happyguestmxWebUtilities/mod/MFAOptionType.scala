package typingsJapgolly.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFAOptionType extends StObject {
  
  var AttributeName: js.UndefOr[String] = js.undefined
  
  var DeliveryMedium: js.UndefOr[String] = js.undefined
}
object MFAOptionType {
  
  inline def apply(): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFAOptionType]
  }
  
  extension [Self <: MFAOptionType](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setDeliveryMedium(value: String): Self = StObject.set(x, "DeliveryMedium", value.asInstanceOf[js.Any])
    
    inline def setDeliveryMediumUndefined: Self = StObject.set(x, "DeliveryMedium", js.undefined)
  }
}
