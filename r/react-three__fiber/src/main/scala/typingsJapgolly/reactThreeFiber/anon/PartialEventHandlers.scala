package typingsJapgolly.reactThreeFiber.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreEventsMod.ThreeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/events.EventHandlers> */
trait PartialEventHandlers extends StObject {
  
  var onClick: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
  
  var onContextMenu: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
  
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ ThreeEvent[MouseEvent], Unit]] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerMissed: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerOut: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerOver: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ ThreeEvent[PointerEvent], Unit]] = js.undefined
  
  var onWheel: js.UndefOr[js.Function1[/* event */ ThreeEvent[WheelEvent], Unit]] = js.undefined
}
object PartialEventHandlers {
  
  inline def apply(): PartialEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventHandlers]
  }
  
  extension [Self <: PartialEventHandlers](x: Self) {
    
    inline def setOnClick(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContextMenu(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDoubleClick(value: /* event */ ThreeEvent[MouseEvent] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* event */ ThreeEvent[MouseEvent]) => value(t0).runNow()))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMissed(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onPointerMissed", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
    
    inline def setOnPointerMissedUndefined: Self = StObject.set(x, "onPointerMissed", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ ThreeEvent[PointerEvent] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ ThreeEvent[PointerEvent]) => value(t0).runNow()))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnWheel(value: /* event */ ThreeEvent[WheelEvent] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: /* event */ ThreeEvent[WheelEvent]) => value(t0).runNow()))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
  }
}
