package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersRestrictPointerMod.RestrictState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeEndSetStart extends StObject {
  
  def beforeEnd(arg: ModifierArg[RestrictState]): Unit | Point
  
  def set(arg: ModifierArg[RestrictState]): Any
  
  def start(arg: ModifierArg[RestrictState]): Unit
  
  def stop(arg: ModifierArg[RestrictState]): Unit
}
object BeforeEndSetStart {
  
  inline def apply(
    beforeEnd: ModifierArg[RestrictState] => Unit | Point,
    set: ModifierArg[RestrictState] => Any,
    start: ModifierArg[RestrictState] => Callback,
    stop: ModifierArg[RestrictState] => Callback
  ): BeforeEndSetStart = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1((t0: ModifierArg[RestrictState]) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: ModifierArg[RestrictState]) => stop(t0).runNow()))
    __obj.asInstanceOf[BeforeEndSetStart]
  }
  
  extension [Self <: BeforeEndSetStart](x: Self) {
    
    inline def setBeforeEnd(value: ModifierArg[RestrictState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[RestrictState] => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[RestrictState] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: ModifierArg[RestrictState]) => value(t0).runNow()))
    
    inline def setStop(value: ModifierArg[RestrictState] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: ModifierArg[RestrictState]) => value(t0).runNow()))
  }
}
