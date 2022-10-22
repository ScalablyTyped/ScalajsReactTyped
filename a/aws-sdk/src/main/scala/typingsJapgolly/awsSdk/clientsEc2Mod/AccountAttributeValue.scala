package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttributeValue extends StObject {
  
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.undefined
}
object AccountAttributeValue {
  
  inline def apply(): AccountAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributeValue]
  }
  
  extension [Self <: AccountAttributeValue](x: Self) {
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
  }
}
