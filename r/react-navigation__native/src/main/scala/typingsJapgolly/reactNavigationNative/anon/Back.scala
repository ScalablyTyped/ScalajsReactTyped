package typingsJapgolly.reactNavigationNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back extends StObject {
  
  def back(): Unit
  
  def forward(): Unit
  
  def go(n: Double): Unit
  
  def pushState(state: Any, _underscore: String, path: String): Unit
  
  def replaceState(state: Any, _underscore: String, path: String): Unit
  
  val state: Any
}
object Back {
  
  inline def apply(
    back: Callback,
    forward: Callback,
    go: Double => Callback,
    pushState: (Any, String, String) => Callback,
    replaceState: (Any, String, String) => Callback,
    state: Any
  ): Back = {
    val __obj = js.Dynamic.literal(back = back.toJsFn, forward = forward.toJsFn, go = js.Any.fromFunction1((t0: Double) => go(t0).runNow()), pushState = js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (pushState(t0, t1, t2)).runNow()), replaceState = js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (replaceState(t0, t1, t2)).runNow()), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  extension [Self <: Back](x: Self) {
    
    inline def setBack(value: Callback): Self = StObject.set(x, "back", value.toJsFn)
    
    inline def setForward(value: Callback): Self = StObject.set(x, "forward", value.toJsFn)
    
    inline def setGo(value: Double => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPushState(value: (Any, String, String) => Callback): Self = StObject.set(x, "pushState", js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setReplaceState(value: (Any, String, String) => Callback): Self = StObject.set(x, "replaceState", js.Any.fromFunction3((t0: Any, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
