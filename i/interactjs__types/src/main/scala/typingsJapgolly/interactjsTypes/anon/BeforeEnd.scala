package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEnd[State /* <: ModifierState[Any, Any, Any] */, Result] extends StObject {
  
  var beforeEnd: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Point | Unit]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Result]] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* arg */ ModifierArg[State], Unit]] = js.undefined
}
object BeforeEnd {
  
  inline def apply[State /* <: ModifierState[Any, Any, Any] */, Result](): BeforeEnd[State, Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeEnd[State, Result]]
  }
  
  extension [Self <: BeforeEnd[?, ?], State /* <: ModifierState[Any, Any, Any] */, Result](x: Self & (BeforeEnd[State, Result])) {
    
    inline def setBeforeEnd(value: /* arg */ ModifierArg[State] => Point | Unit): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setBeforeEndUndefined: Self = StObject.set(x, "beforeEnd", js.undefined)
    
    inline def setSet(value: /* arg */ ModifierArg[State] => Result): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setStart(value: /* arg */ ModifierArg[State] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* arg */ ModifierArg[State]) => value(t0).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: /* arg */ ModifierArg[State] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* arg */ ModifierArg[State]) => value(t0).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
