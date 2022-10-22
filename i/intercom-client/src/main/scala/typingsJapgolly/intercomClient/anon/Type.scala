package typingsJapgolly.intercomClient.anon

import typingsJapgolly.intercomClient.intercomClientStrings.user
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import typingsJapgolly.intercomClient.visitorMod.VisitorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var identifier: VisitorIdentifier
  
  var `type`: user
  
  var user: UserIdentifier
}
object Type {
  
  inline def apply(identifier: VisitorIdentifier, user: UserIdentifier): Type = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setIdentifier(value: VisitorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: UserIdentifier): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
