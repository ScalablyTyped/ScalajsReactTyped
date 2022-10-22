package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toast
  extends StObject
     with ComponentBase[ToastOptions] {
  
  /**
    * remove a specific toast
    */
  def dismiss(): Unit
  
  /**
    * Describes the current pan state of the Toast.
    */
  var panning: Boolean
  
  /**
    * The remaining amount of time in ms that the toast will stay before dismissal.
    */
  var timeRemaining: Double
}
object Toast {
  
  inline def apply(dismiss: Callback, el: Element, options: ToastOptions, panning: Boolean, timeRemaining: Double): Toast = {
    val __obj = js.Dynamic.literal(dismiss = dismiss.toJsFn, el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  
  extension [Self <: Toast](x: Self) {
    
    inline def setDismiss(value: Callback): Self = StObject.set(x, "dismiss", value.toJsFn)
    
    inline def setPanning(value: Boolean): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: Double): Self = StObject.set(x, "timeRemaining", value.asInstanceOf[js.Any])
  }
}
