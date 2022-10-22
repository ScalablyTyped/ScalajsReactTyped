package typingsJapgolly.winrtUwp.Windows.UI.Core.AnimationMetrics

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
trait TranslationAnimation extends StObject {
  
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the translation should animate over time. */
  var control1: Point
  
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the translation should animate over time. */
  var control2: Point
  
  /** Gets the amount of time between when the translation animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double
  
  /** Gets the amount of time over which the translation animation should be performed. This does not include the delay. */
  var duration: Double
  
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType
}
object TranslationAnimation {
  
  inline def apply(control1: Point, control2: Point, delay: Double, duration: Double, `type`: PropertyAnimationType): TranslationAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationAnimation]
  }
  
  extension [Self <: TranslationAnimation](x: Self) {
    
    inline def setControl1(value: Point): Self = StObject.set(x, "control1", value.asInstanceOf[js.Any])
    
    inline def setControl2(value: Point): Self = StObject.set(x, "control2", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyAnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
