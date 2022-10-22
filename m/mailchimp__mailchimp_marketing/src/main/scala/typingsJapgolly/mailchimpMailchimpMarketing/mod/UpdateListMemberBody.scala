package typingsJapgolly.mailchimpMailchimpMarketing.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateListMemberBody
  extends StObject
     with Body {
  
  var email_address: js.UndefOr[String] = js.undefined
}
object UpdateListMemberBody {
  
  inline def apply(): UpdateListMemberBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateListMemberBody]
  }
  
  extension [Self <: UpdateListMemberBody](x: Self) {
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
  }
}
