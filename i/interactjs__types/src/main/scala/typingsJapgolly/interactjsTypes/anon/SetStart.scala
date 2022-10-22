package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.modifiersSnapPointerMod.SnapState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStart extends StObject {
  
  def beforeEnd(arg: ModifierArg[SnapState]): Unit | Point
  
  def set(arg: ModifierArg[SnapState]): Delta
  
  def start(arg: ModifierArg[SnapState]): Unit
  
  def stop(arg: ModifierArg[SnapState]): Unit
}
object SetStart {
  
  inline def apply(
    beforeEnd: ModifierArg[SnapState] => Unit | Point,
    set: ModifierArg[SnapState] => Delta,
    start: ModifierArg[SnapState] => Callback,
    stop: ModifierArg[SnapState] => Callback
  ): SetStart = {
    val __obj = js.Dynamic.literal(beforeEnd = js.Any.fromFunction1(beforeEnd), set = js.Any.fromFunction1(set), start = js.Any.fromFunction1((t0: ModifierArg[SnapState]) => start(t0).runNow()), stop = js.Any.fromFunction1((t0: ModifierArg[SnapState]) => stop(t0).runNow()))
    __obj.asInstanceOf[SetStart]
  }
  
  extension [Self <: SetStart](x: Self) {
    
    inline def setBeforeEnd(value: ModifierArg[SnapState] => Unit | Point): Self = StObject.set(x, "beforeEnd", js.Any.fromFunction1(value))
    
    inline def setSet(value: ModifierArg[SnapState] => Delta): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setStart(value: ModifierArg[SnapState] => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: ModifierArg[SnapState]) => value(t0).runNow()))
    
    inline def setStop(value: ModifierArg[SnapState] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: ModifierArg[SnapState]) => value(t0).runNow()))
  }
}
