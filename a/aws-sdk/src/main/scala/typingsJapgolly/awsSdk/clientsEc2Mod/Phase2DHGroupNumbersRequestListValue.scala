package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2DHGroupNumbersRequestListValue extends StObject {
  
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}
object Phase2DHGroupNumbersRequestListValue {
  
  inline def apply(): Phase2DHGroupNumbersRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2DHGroupNumbersRequestListValue]
  }
  
  extension [Self <: Phase2DHGroupNumbersRequestListValue](x: Self) {
    
    inline def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
