package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor extends StObject {
  
  var name: String
  
  var phone: String
  
  var url: String
}
object Descriptor {
  
  inline def apply(name: String, phone: String, url: String): Descriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor]
  }
  
  extension [Self <: Descriptor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
