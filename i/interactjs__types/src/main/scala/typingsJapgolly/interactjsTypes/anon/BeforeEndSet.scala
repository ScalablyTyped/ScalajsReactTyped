package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEndSet[State /* <: ModifierState[Any, Any, Any] */, Result] extends StObject {
  
  def beforeEnd(arg: ModifierArg[State]): Unit | Point
  
  def set(arg: ModifierArg[State]): Result
  
  def start(arg: ModifierArg[State]): Unit
  
  def stop(arg: ModifierArg[State]): Unit
}
object BeforeEndSet {
  
  inline def apply[State /* <: ModifierState[Any, Any, Any] */, Result](
    beforeEnd: ModifierArg[State] => Unit | Point,
    set: ModifierArg[State] => Result,
    start: ModifierArg[State] => Callback,
    stop: ModifierArg[State] => Callback
  ): BeforeEndSet[State, Result] = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1((t0: ModifierArg[State]) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: ModifierArg[State]) => stop(t0).runNow()))
    __obj.asInstanceOf[BeforeEndSet[State, Result]]
  }
  
  extension [Self <: BeforeEndSet[?, ?], State /* <: ModifierState[Any, Any, Any] */, Result](x: Self & (BeforeEndSet[State, Result])) {
    
    inline def setBeforeEnd(value: ModifierArg[State] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[State] => Result): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[State] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: ModifierArg[State]) => value(t0).runNow()))
    
    inline def setStop(value: ModifierArg[State] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: ModifierArg[State]) => value(t0).runNow()))
  }
}
