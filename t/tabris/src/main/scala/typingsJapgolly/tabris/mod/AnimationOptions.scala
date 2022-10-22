package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.tabrisStrings.`ease-in-out`
import typingsJapgolly.tabris.tabrisStrings.`ease-in`
import typingsJapgolly.tabris.tabrisStrings.`ease-out`
import typingsJapgolly.tabris.tabrisStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /**
    * Time until the animation starts in ms, defaults to 0.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of the animation in ms.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    *  Easing function applied to the animation.
    */
  var easing: js.UndefOr[linear | `ease-in` | `ease-out` | `ease-in-out`] = js.undefined
  
  /**
    * no effect, but will be given in animation events.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  Number of times to repeat the animation, defaults to 0.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    *  If true, alternates the direction of the animation on every repeat.
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: linear | `ease-in` | `ease-out` | `ease-in-out`): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
