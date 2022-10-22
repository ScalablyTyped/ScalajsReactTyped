package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnackbarProps
  extends StObject
     with HTMLProps[Any] {
  
  var active: Boolean
  
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.undefined
  
  def onTimeout(): Any
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object SnackbarProps {
  
  inline def apply(active: Boolean, onTimeout: CallbackTo[Any]): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = onTimeout.toJsFn)
    __obj.asInstanceOf[SnackbarProps]
  }
  
  extension [Self <: SnackbarProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnActionClick(value: ReactMouseEventFrom[Snackbar & Element] => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Snackbar & Element]) => value(t0).runNow()))
    
    inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    
    inline def setOnTimeout(value: CallbackTo[Any]): Self = StObject.set(x, "onTimeout", value.toJsFn)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
