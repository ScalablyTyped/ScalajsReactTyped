package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockedCookieWithReason extends StObject {
  
  /**
    * The reason(s) the cookie was blocked.
    */
  var blockedReasons: js.Array[CookieBlockedReason]
  
  /**
    * The cookie object representing the cookie which was not sent.
    */
  var cookie: Cookie
}
object BlockedCookieWithReason {
  
  inline def apply(blockedReasons: js.Array[CookieBlockedReason], cookie: Cookie): BlockedCookieWithReason = {
    val __obj = js.Dynamic.literal(blockedReasons = blockedReasons.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedCookieWithReason]
  }
  
  extension [Self <: BlockedCookieWithReason](x: Self) {
    
    inline def setBlockedReasons(value: js.Array[CookieBlockedReason]): Self = StObject.set(x, "blockedReasons", value.asInstanceOf[js.Any])
    
    inline def setBlockedReasonsVarargs(value: CookieBlockedReason*): Self = StObject.set(x, "blockedReasons", js.Array(value*))
    
    inline def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
