package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.ahooks.anon.X
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseLongPressMod {
  
  @JSImport("ahooks/lib/useLongPress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(onLongPress: js.Function1[/* event */ EventType, Unit], target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onLongPress.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    onLongPress: js.Function1[/* event */ EventType, Unit],
    target: BasicTarget[Element],
    hasDelayMoveThresholdOnClickOnLongPressEnd: Options
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onLongPress.asInstanceOf[js.Any], target.asInstanceOf[js.Any], hasDelayMoveThresholdOnClickOnLongPressEnd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EventType = MouseEvent | TouchEvent
  
  trait Options extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var moveThreshold: js.UndefOr[X] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ EventType, Unit]] = js.undefined
    
    var onLongPressEnd: js.UndefOr[js.Function1[/* event */ EventType, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setMoveThreshold(value: X): Self = StObject.set(x, "moveThreshold", value.asInstanceOf[js.Any])
      
      inline def setMoveThresholdUndefined: Self = StObject.set(x, "moveThreshold", js.undefined)
      
      inline def setOnClick(value: /* event */ EventType => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ EventType) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnLongPressEnd(value: /* event */ EventType => Callback): Self = StObject.set(x, "onLongPressEnd", js.Any.fromFunction1((t0: /* event */ EventType) => value(t0).runNow()))
      
      inline def setOnLongPressEndUndefined: Self = StObject.set(x, "onLongPressEnd", js.undefined)
    }
  }
}
