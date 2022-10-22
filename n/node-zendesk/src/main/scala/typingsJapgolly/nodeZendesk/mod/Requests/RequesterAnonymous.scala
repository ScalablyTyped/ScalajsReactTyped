package typingsJapgolly.nodeZendesk.mod.Requests

import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequesterAnonymous extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var locale_id: js.UndefOr[ZendeskID] = js.undefined
  
  var name: String
}
object RequesterAnonymous {
  
  inline def apply(name: String): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAnonymous]
  }
  
  extension [Self <: RequesterAnonymous](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLocale_id(value: ZendeskID): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    inline def setLocale_idUndefined: Self = StObject.set(x, "locale_id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
