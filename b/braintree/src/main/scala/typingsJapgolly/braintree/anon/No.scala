package typingsJapgolly.braintree.anon

import typingsJapgolly.braintree.braintreeStrings.Unknown
import typingsJapgolly.braintree.braintreeStrings.Yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait No extends StObject {
  
  var No: typingsJapgolly.braintree.braintreeStrings.No
  
  var Unknown: typingsJapgolly.braintree.braintreeStrings.Unknown
  
  var Yes: typingsJapgolly.braintree.braintreeStrings.Yes
}
object No {
  
  inline def apply(): No = {
    val __obj = js.Dynamic.literal(No = "No", Unknown = "Unknown", Yes = "Yes")
    __obj.asInstanceOf[No]
  }
  
  extension [Self <: No](x: Self) {
    
    inline def setNo(value: typingsJapgolly.braintree.braintreeStrings.No): Self = StObject.set(x, "No", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
    
    inline def setYes(value: Yes): Self = StObject.set(x, "Yes", value.asInstanceOf[js.Any])
  }
}
