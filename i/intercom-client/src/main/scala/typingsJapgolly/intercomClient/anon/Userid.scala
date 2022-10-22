package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.leadMod.LeadIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdIdentifier
import typingsJapgolly.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Userid
  extends StObject
     with LeadIdentifier
     with UserIdIdentifier
     with VisitorIdentifier {
  
  var user_id: String
}
object Userid {
  
  inline def apply(user_id: String): Userid = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Userid]
  }
  
  extension [Self <: Userid](x: Self) {
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
