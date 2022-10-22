package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedNavigator extends StObject {
  
  def getCurrentRoutes(): js.Array[DeprecatedNavigatorRoute]
  
  def immediatelyResetRouteStack(nextRouteStack: js.Array[DeprecatedNavigatorRoute]): Unit
  
  def jumpBack(): Unit
  
  def jumpForward(): Unit
  
  def jumpTo(route: DeprecatedNavigatorRoute): Unit
  
  def pop(): Unit
  
  def popN(n: Double): Unit
  
  def popToRoute(route: DeprecatedNavigatorRoute): Unit
  
  def popToTop(): Unit
  
  def push(route: DeprecatedNavigatorRoute): Unit
  
  def replace(route: DeprecatedNavigatorRoute): Unit
  
  def replaceAtIndex(route: DeprecatedNavigatorRoute, index: Double): Unit
  
  def replacePrevious(route: DeprecatedNavigatorRoute): Unit
}
object DeprecatedNavigator {
  
  inline def apply(
    getCurrentRoutes: CallbackTo[js.Array[DeprecatedNavigatorRoute]],
    immediatelyResetRouteStack: js.Array[DeprecatedNavigatorRoute] => Callback,
    jumpBack: Callback,
    jumpForward: Callback,
    jumpTo: DeprecatedNavigatorRoute => Callback,
    pop: Callback,
    popN: Double => Callback,
    popToRoute: DeprecatedNavigatorRoute => Callback,
    popToTop: Callback,
    push: DeprecatedNavigatorRoute => Callback,
    replace: DeprecatedNavigatorRoute => Callback,
    replaceAtIndex: (DeprecatedNavigatorRoute, Double) => Callback,
    replacePrevious: DeprecatedNavigatorRoute => Callback
  ): DeprecatedNavigator = {
    val __obj = js.Dynamic.literal(getCurrentRoutes = getCurrentRoutes.toJsFn, immediatelyResetRouteStack = js.Any.fromFunction1((t0: js.Array[DeprecatedNavigatorRoute]) => immediatelyResetRouteStack(t0).runNow()), jumpBack = jumpBack.toJsFn, jumpForward = jumpForward.toJsFn, jumpTo = js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => jumpTo(t0).runNow()), pop = pop.toJsFn, popN = js.Any.fromFunction1((t0: Double) => popN(t0).runNow()), popToRoute = js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => popToRoute(t0).runNow()), popToTop = popToTop.toJsFn, push = js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => push(t0).runNow()), replace = js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => replace(t0).runNow()), replaceAtIndex = js.Any.fromFunction2((t0: DeprecatedNavigatorRoute, t1: Double) => (replaceAtIndex(t0, t1)).runNow()), replacePrevious = js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => replacePrevious(t0).runNow()))
    __obj.asInstanceOf[DeprecatedNavigator]
  }
  
  extension [Self <: DeprecatedNavigator](x: Self) {
    
    inline def setGetCurrentRoutes(value: CallbackTo[js.Array[DeprecatedNavigatorRoute]]): Self = StObject.set(x, "getCurrentRoutes", value.toJsFn)
    
    inline def setImmediatelyResetRouteStack(value: js.Array[DeprecatedNavigatorRoute] => Callback): Self = StObject.set(x, "immediatelyResetRouteStack", js.Any.fromFunction1((t0: js.Array[DeprecatedNavigatorRoute]) => value(t0).runNow()))
    
    inline def setJumpBack(value: Callback): Self = StObject.set(x, "jumpBack", value.toJsFn)
    
    inline def setJumpForward(value: Callback): Self = StObject.set(x, "jumpForward", value.toJsFn)
    
    inline def setJumpTo(value: DeprecatedNavigatorRoute => Callback): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => value(t0).runNow()))
    
    inline def setPop(value: Callback): Self = StObject.set(x, "pop", value.toJsFn)
    
    inline def setPopN(value: Double => Callback): Self = StObject.set(x, "popN", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPopToRoute(value: DeprecatedNavigatorRoute => Callback): Self = StObject.set(x, "popToRoute", js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => value(t0).runNow()))
    
    inline def setPopToTop(value: Callback): Self = StObject.set(x, "popToTop", value.toJsFn)
    
    inline def setPush(value: DeprecatedNavigatorRoute => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => value(t0).runNow()))
    
    inline def setReplace(value: DeprecatedNavigatorRoute => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => value(t0).runNow()))
    
    inline def setReplaceAtIndex(value: (DeprecatedNavigatorRoute, Double) => Callback): Self = StObject.set(x, "replaceAtIndex", js.Any.fromFunction2((t0: DeprecatedNavigatorRoute, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setReplacePrevious(value: DeprecatedNavigatorRoute => Callback): Self = StObject.set(x, "replacePrevious", js.Any.fromFunction1((t0: DeprecatedNavigatorRoute) => value(t0).runNow()))
  }
}
