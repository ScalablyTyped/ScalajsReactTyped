package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITooltipService extends StObject {
  
  def enabled(): Boolean
  
  def hide(options: TooltipHideOptions): Unit
  
  def move(options: TooltipMoveOptions): Unit
  
  def show(options: TooltipShowOptions): Unit
}
object ITooltipService {
  
  inline def apply(
    enabled: CallbackTo[Boolean],
    hide: TooltipHideOptions => Callback,
    move: TooltipMoveOptions => Callback,
    show: TooltipShowOptions => Callback
  ): ITooltipService = {
    val __obj = js.Dynamic.literal(enabled = enabled.toJsFn, hide = js.Any.fromFunction1((t0: TooltipHideOptions) => hide(t0).runNow()), move = js.Any.fromFunction1((t0: TooltipMoveOptions) => move(t0).runNow()), show = js.Any.fromFunction1((t0: TooltipShowOptions) => show(t0).runNow()))
    __obj.asInstanceOf[ITooltipService]
  }
  
  extension [Self <: ITooltipService](x: Self) {
    
    inline def setEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "enabled", value.toJsFn)
    
    inline def setHide(value: TooltipHideOptions => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: TooltipHideOptions) => value(t0).runNow()))
    
    inline def setMove(value: TooltipMoveOptions => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: TooltipMoveOptions) => value(t0).runNow()))
    
    inline def setShow(value: TooltipShowOptions => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: TooltipShowOptions) => value(t0).runNow()))
  }
}
