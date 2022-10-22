package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppInts.`0`
import typingsJapgolly.aliApp.aliAppInts.`1`
import typingsJapgolly.aliApp.aliAppInts.`2`
import typingsJapgolly.aliApp.aliAppInts.`3`
import typingsJapgolly.aliApp.my.LocationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.GetLocationOptions> */
trait PartialGetLocationOptions extends StObject {
  
  var cacheTimeout: js.UndefOr[Double] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.undefined
  
  var `type`: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}
object PartialGetLocationOptions {
  
  inline def apply(): PartialGetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGetLocationOptions]
  }
  
  extension [Self <: PartialGetLocationOptions](x: Self) {
    
    inline def setCacheTimeout(value: Double): Self = StObject.set(x, "cacheTimeout", value.asInstanceOf[js.Any])
    
    inline def setCacheTimeoutUndefined: Self = StObject.set(x, "cacheTimeout", js.undefined)
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ LocationData => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ LocationData) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
