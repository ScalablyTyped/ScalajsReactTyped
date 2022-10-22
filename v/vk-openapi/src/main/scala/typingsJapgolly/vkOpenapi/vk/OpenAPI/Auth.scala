package typingsJapgolly.vkOpenapi.vk.OpenAPI

import japgolly.scalajs.react.Callback
import typingsJapgolly.vkOpenapi.anon.Domain
import typingsJapgolly.vkOpenapi.vkOpenapiStrings.connected
import typingsJapgolly.vkOpenapi.vkOpenapiStrings.not_authorized
import typingsJapgolly.vkOpenapi.vkOpenapiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Auth {
  
  trait API extends StObject {
    
    def getLoginStatus(cb: js.Function1[/* status */ LoginStatus, Unit]): Unit
    
    def getSession(cb: js.Function1[/* session */ Session, Unit]): Unit
    
    def login(cb: js.Function1[/* status */ LoginStatus, Unit], settings: Double): Unit
    
    def logout(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit
    
    def revokeGrants(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit
  }
  object API {
    
    inline def apply(
      getLoginStatus: js.Function1[/* status */ LoginStatus, Unit] => Callback,
      getSession: js.Function1[/* session */ Session, Unit] => Callback,
      login: (js.Function1[/* status */ LoginStatus, Unit], Double) => Callback,
      logout: js.Function1[/* status */ EmptyLoginStatus, Unit] => Callback,
      revokeGrants: js.Function1[/* status */ EmptyLoginStatus, Unit] => Callback
    ): API = {
      val __obj = js.Dynamic.literal(getLoginStatus = js.Any.fromFunction1((t0: js.Function1[/* status */ LoginStatus, Unit]) => getLoginStatus(t0).runNow()), getSession = js.Any.fromFunction1((t0: js.Function1[/* session */ Session, Unit]) => getSession(t0).runNow()), login = js.Any.fromFunction2((t0: js.Function1[/* status */ LoginStatus, Unit], t1: Double) => (login(t0, t1)).runNow()), logout = js.Any.fromFunction1((t0: js.Function1[/* status */ EmptyLoginStatus, Unit]) => logout(t0).runNow()), revokeGrants = js.Any.fromFunction1((t0: js.Function1[/* status */ EmptyLoginStatus, Unit]) => revokeGrants(t0).runNow()))
      __obj.asInstanceOf[API]
    }
    
    extension [Self <: API](x: Self) {
      
      inline def setGetLoginStatus(value: js.Function1[/* status */ LoginStatus, Unit] => Callback): Self = StObject.set(x, "getLoginStatus", js.Any.fromFunction1((t0: js.Function1[/* status */ LoginStatus, Unit]) => value(t0).runNow()))
      
      inline def setGetSession(value: js.Function1[/* session */ Session, Unit] => Callback): Self = StObject.set(x, "getSession", js.Any.fromFunction1((t0: js.Function1[/* session */ Session, Unit]) => value(t0).runNow()))
      
      inline def setLogin(value: (js.Function1[/* status */ LoginStatus, Unit], Double) => Callback): Self = StObject.set(x, "login", js.Any.fromFunction2((t0: js.Function1[/* status */ LoginStatus, Unit], t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setLogout(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Callback): Self = StObject.set(x, "logout", js.Any.fromFunction1((t0: js.Function1[/* status */ EmptyLoginStatus, Unit]) => value(t0).runNow()))
      
      inline def setRevokeGrants(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Callback): Self = StObject.set(x, "revokeGrants", js.Any.fromFunction1((t0: js.Function1[/* status */ EmptyLoginStatus, Unit]) => value(t0).runNow()))
    }
  }
  
  trait EmptyLoginStatus extends StObject {
    
    var session: Null
    
    var settings: Unit
    
    var status: unknown
  }
  object EmptyLoginStatus {
    
    inline def apply(session: Null, settings: Unit): EmptyLoginStatus = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], status = "unknown")
      __obj.asInstanceOf[EmptyLoginStatus]
    }
    
    extension [Self <: EmptyLoginStatus](x: Self) {
      
      inline def setSession(value: Null): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Unit): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginStatus extends StObject {
    
    var session: Session
    
    var status: connected | not_authorized | unknown
  }
  object LoginStatus {
    
    inline def apply(session: Session, status: connected | not_authorized | unknown): LoginStatus = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginStatus]
    }
    
    extension [Self <: LoginStatus](x: Self) {
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: connected | not_authorized | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Session extends StObject {
    
    var expire: Double
    
    var mid: Double
    
    var secret: String
    
    var sid: String
    
    var sig: String
    
    var user: Domain
  }
  object Session {
    
    inline def apply(expire: Double, mid: Double, secret: String, sid: String, sig: String, user: Domain): Session = {
      val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setMid(value: Double): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Domain): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
