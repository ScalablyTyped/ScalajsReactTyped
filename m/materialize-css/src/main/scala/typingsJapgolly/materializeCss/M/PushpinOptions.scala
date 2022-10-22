package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import typingsJapgolly.materializeCss.materializeCssStrings.`pin-bottom`
import typingsJapgolly.materializeCss.materializeCssStrings.`pin-top`
import typingsJapgolly.materializeCss.materializeCssStrings.pinned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushpinOptions extends StObject {
  
  /**
    * The distance in pixels from the top of the page where the elements stops being fixed
    * @default Infinity
    */
  var bottom: Double
  
  /**
    * The offset from the top the element will be fixed at
    * @default 0
    */
  var offset: Double
  
  /**
    * Callback function called when pushpin position changes. You are provided with a position string
    * @default null
    */
  def onPositionChange(position: pinned | `pin-top` | `pin-bottom`): Unit
  
  /**
    * The distance in pixels from the top of the page where the element becomes fixed
    * @default 0
    */
  var top: Double
}
object PushpinOptions {
  
  inline def apply(
    bottom: Double,
    offset: Double,
    onPositionChange: pinned | `pin-top` | `pin-bottom` => Callback,
    top: Double
  ): PushpinOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onPositionChange = js.Any.fromFunction1((t0: pinned | `pin-top` | `pin-bottom`) => onPositionChange(t0).runNow()), top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushpinOptions]
  }
  
  extension [Self <: PushpinOptions](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOnPositionChange(value: pinned | `pin-top` | `pin-bottom` => Callback): Self = StObject.set(x, "onPositionChange", js.Any.fromFunction1((t0: pinned | `pin-top` | `pin-bottom`) => value(t0).runNow()))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
