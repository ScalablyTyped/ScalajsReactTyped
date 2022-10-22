package typingsJapgolly.knuddelsUserappsApi.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnd extends StObject {
  
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  var online: js.UndefOr[Boolean] = js.undefined
}
object OnEnd {
  
  inline def apply(): OnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnd]
  }
  
  extension [Self <: OnEnd](x: Self) {
    
    inline def setOnEnd(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction2((t0: /* accessibleUserCount */ Double, t1: /* key */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* accessibleUserCount */ Double, t1: /* key */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
