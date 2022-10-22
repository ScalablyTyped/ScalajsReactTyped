package typingsJapgolly.rcTrigger

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-trigger/es/context", JSImport.Default)
  @js.native
  val default: Context[TriggerContextProps] = js.native
  
  trait TriggerContextProps extends StObject {
    
    var onPopupMouseDown: MouseEventHandler[HTMLElement]
  }
  object TriggerContextProps {
    
    inline def apply(onPopupMouseDown: ReactMouseEventFrom[HTMLElement & Element] => Callback): TriggerContextProps = {
      val __obj = js.Dynamic.literal(onPopupMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => onPopupMouseDown(t0).runNow()))
      __obj.asInstanceOf[TriggerContextProps]
    }
    
    extension [Self <: TriggerContextProps](x: Self) {
      
      inline def setOnPopupMouseDown(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onPopupMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    }
  }
  
  type _To = Context[TriggerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[TriggerContextProps] = default
}
