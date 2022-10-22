package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStartStop extends StObject {
  
  def beforeEnd(arg: ModifierArg[RestrictEdgesState]): Unit | Point
  
  def set(arg: ModifierArg[RestrictEdgesState]): Unit
  
  def start(arg: ModifierArg[RestrictEdgesState]): Unit
  
  def stop(arg: ModifierArg[RestrictEdgesState]): Unit
}
object SetStartStop {
  
  inline def apply(
    beforeEnd: ModifierArg[RestrictEdgesState] => Unit | Point,
    set: ModifierArg[RestrictEdgesState] => Callback,
    start: ModifierArg[RestrictEdgesState] => Callback,
    stop: ModifierArg[RestrictEdgesState] => Callback
  ): SetStartStop = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => set(t0).runNow()), start = js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => stop(t0).runNow()))
    __obj.asInstanceOf[SetStartStop]
  }
  
  extension [Self <: SetStartStop](x: Self) {
    
    inline def setBeforeEnd(value: ModifierArg[RestrictEdgesState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[RestrictEdgesState] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => value(t0).runNow()))
    
    inline def setStart(value: ModifierArg[RestrictEdgesState] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => value(t0).runNow()))
    
    inline def setStop(value: ModifierArg[RestrictEdgesState] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: ModifierArg[RestrictEdgesState]) => value(t0).runNow()))
  }
}
