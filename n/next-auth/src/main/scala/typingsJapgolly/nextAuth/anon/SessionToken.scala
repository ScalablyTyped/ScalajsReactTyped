package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.adaptersMod.AdapterUser
import typingsJapgolly.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionToken extends StObject {
  
  var session: typingsJapgolly.nextAuth.coreTypesMod.Session
  
  var token: JWT
  
  var user: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser
}
object SessionToken {
  
  inline def apply(
    session: typingsJapgolly.nextAuth.coreTypesMod.Session,
    token: JWT,
    user: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser
  ): SessionToken = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionToken]
  }
  
  extension [Self <: SessionToken](x: Self) {
    
    inline def setSession(value: typingsJapgolly.nextAuth.coreTypesMod.Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUser(value: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
