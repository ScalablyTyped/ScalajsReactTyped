package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersAspectRatioMod.AspectRatioState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStop extends StObject {
  
  def beforeEnd(arg: ModifierArg[AspectRatioState]): Unit | Point
  
  def set(arg: ModifierArg[AspectRatioState]): Any
  
  def start(arg: ModifierArg[AspectRatioState]): Unit
  
  def stop(arg: ModifierArg[AspectRatioState]): Unit
}
object StartStop {
  
  inline def apply(
    beforeEnd: ModifierArg[AspectRatioState] => Unit | Point,
    set: ModifierArg[AspectRatioState] => Any,
    start: ModifierArg[AspectRatioState] => Callback,
    stop: ModifierArg[AspectRatioState] => Callback
  ): StartStop = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1((t0: ModifierArg[AspectRatioState]) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: ModifierArg[AspectRatioState]) => stop(t0).runNow()))
    __obj.asInstanceOf[StartStop]
  }
  
  extension [Self <: StartStop](x: Self) {
    
    inline def setBeforeEnd(value: ModifierArg[AspectRatioState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[AspectRatioState] => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[AspectRatioState] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: ModifierArg[AspectRatioState]) => value(t0).runNow()))
    
    inline def setStop(value: ModifierArg[AspectRatioState] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: ModifierArg[AspectRatioState]) => value(t0).runNow()))
  }
}
