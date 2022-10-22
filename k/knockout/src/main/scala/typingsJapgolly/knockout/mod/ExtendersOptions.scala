package typingsJapgolly.knockout.mod

import typingsJapgolly.knockout.knockoutBooleans.`true`
import typingsJapgolly.knockout.knockoutStrings.always
import typingsJapgolly.knockout.mod.utils.CompareArraysOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendersOptions[T] extends StObject {
  
  var deferred: `true`
  
  @JSName("notify")
  var notify_FExtendersOptions: always | Any
  
  var rateLimit: Double | RateLimitOptions
  
  var throttle: Double
  
  var trackArrayChanges: `true` | CompareArraysOptions
}
object ExtendersOptions {
  
  inline def apply[T](
    notify_ : always | Any,
    rateLimit: Double | RateLimitOptions,
    throttle: Double,
    trackArrayChanges: `true` | CompareArraysOptions
  ): ExtendersOptions[T] = {
    val __obj = js.Dynamic.literal(deferred = true, rateLimit = rateLimit.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], trackArrayChanges = trackArrayChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendersOptions[T]]
  }
  
  extension [Self <: ExtendersOptions[?], T](x: Self & ExtendersOptions[T]) {
    
    inline def setDeferred(value: `true`): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: always | Any): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setRateLimit(value: Double | RateLimitOptions): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setTrackArrayChanges(value: `true` | CompareArraysOptions): Self = StObject.set(x, "trackArrayChanges", value.asInstanceOf[js.Any])
  }
}
