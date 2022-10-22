package typingsJapgolly.knuddelsUserappBackendApi.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnStart extends StObject {
  
  var maximumCount: js.UndefOr[Double] = js.undefined
  
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var online: js.UndefOr[Boolean] = js.undefined
}
object OnStart {
  
  inline def apply(): OnStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnStart]
  }
  
  extension [Self <: OnStart](x: Self) {
    
    inline def setMaximumCount(value: Double): Self = StObject.set(x, "maximumCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumCountUndefined: Self = StObject.set(x, "maximumCount", js.undefined)
    
    inline def setOnEnd(value: (/* totalCount */ Double, /* key */ String) => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction2((t0: /* totalCount */ Double, t1: /* key */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: (/* totalCount */ Double, /* key */ String) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* totalCount */ Double, t1: /* key */ String) => (value(t0, t1)).runNow()))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
