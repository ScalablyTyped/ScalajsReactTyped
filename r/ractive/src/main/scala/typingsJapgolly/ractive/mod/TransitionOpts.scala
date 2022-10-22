package typingsJapgolly.ractive.mod

import typingsJapgolly.ractive.ractiveStrings.fast
import typingsJapgolly.ractive.ractiveStrings.slow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionOpts extends StObject {
  
  /** The delay in milliseconds to wait before triggering the transition. */
  var delay: js.UndefOr[Double] = js.undefined
  
  /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
  var duration: js.UndefOr[Double | slow | fast | String] = js.undefined
  
  /** The easing to use for the transition. */
  var easing: js.UndefOr[String] = js.undefined
}
object TransitionOpts {
  
  inline def apply(): TransitionOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOpts]
  }
  
  extension [Self <: TransitionOpts](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double | slow | fast | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
