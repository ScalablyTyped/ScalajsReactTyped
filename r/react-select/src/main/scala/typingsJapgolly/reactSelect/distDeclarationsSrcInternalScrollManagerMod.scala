package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInternalScrollManagerMod {
  
  @JSImport("react-select/dist/declarations/src/internal/ScrollManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenLockEnabledCaptureEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenLockEnabledCaptureEnabledOnBottomArriveOnBottomLeaveOnTopArriveOnTopLeave.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    val captureEnabled: Boolean
    
    def children(ref: RefFn[HTMLElement]): japgolly.scalajs.react.facade.React.Element
    
    val lockEnabled: Boolean
    
    val onBottomArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onBottomLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopArrive: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
    
    val onTopLeave: js.UndefOr[js.Function1[/* event */ WheelEvent | TouchEvent, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(
      captureEnabled: Boolean,
      children: RefFn[HTMLElement] => japgolly.scalajs.react.facade.React.Element,
      lockEnabled: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(captureEnabled = captureEnabled.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), lockEnabled = lockEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCaptureEnabled(value: Boolean): Self = StObject.set(x, "captureEnabled", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: RefFn[HTMLElement] => japgolly.scalajs.react.facade.React.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setLockEnabled(value: Boolean): Self = StObject.set(x, "lockEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnBottomArrive(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onBottomArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnBottomArriveUndefined: Self = StObject.set(x, "onBottomArrive", js.undefined)
      
      inline def setOnBottomLeave(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onBottomLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnBottomLeaveUndefined: Self = StObject.set(x, "onBottomLeave", js.undefined)
      
      inline def setOnTopArrive(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onTopArrive", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnTopArriveUndefined: Self = StObject.set(x, "onTopArrive", js.undefined)
      
      inline def setOnTopLeave(value: /* event */ WheelEvent | TouchEvent => Callback): Self = StObject.set(x, "onTopLeave", js.Any.fromFunction1((t0: /* event */ WheelEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnTopLeaveUndefined: Self = StObject.set(x, "onTopLeave", js.undefined)
    }
  }
}
