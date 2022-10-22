package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import typingsJapgolly.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyboard extends StObject {
  
  def findFocusable(element: JQuery): js.Object
  
  def handleKey(event: Any, component: Any, functions: Any): Unit
  
  def parseKey(event: Any): String
  
  def register(componentName: Any, cmds: Any): Unit
  
  def releaseFocus(element: JQuery): Unit
  
  def trapFocus(element: JQuery): Unit
}
object Keyboard {
  
  inline def apply(
    findFocusable: JQuery => js.Object,
    handleKey: (Any, Any, Any) => Callback,
    parseKey: Any => String,
    register: (Any, Any) => Callback,
    releaseFocus: JQuery => Callback,
    trapFocus: JQuery => Callback
  ): Keyboard = {
    val __obj = js.Dynamic.literal(findFocusable = js.Any.fromFunction1(findFocusable), handleKey = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (handleKey(t0, t1, t2)).runNow()), parseKey = js.Any.fromFunction1(parseKey), register = js.Any.fromFunction2((t0: Any, t1: Any) => (register(t0, t1)).runNow()), releaseFocus = js.Any.fromFunction1((t0: JQuery) => releaseFocus(t0).runNow()), trapFocus = js.Any.fromFunction1((t0: JQuery) => trapFocus(t0).runNow()))
    __obj.asInstanceOf[Keyboard]
  }
  
  extension [Self <: Keyboard](x: Self) {
    
    inline def setFindFocusable(value: JQuery => js.Object): Self = StObject.set(x, "findFocusable", js.Any.fromFunction1(value))
    
    inline def setHandleKey(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "handleKey", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setParseKey(value: Any => String): Self = StObject.set(x, "parseKey", js.Any.fromFunction1(value))
    
    inline def setRegister(value: (Any, Any) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setReleaseFocus(value: JQuery => Callback): Self = StObject.set(x, "releaseFocus", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
    
    inline def setTrapFocus(value: JQuery => Callback): Self = StObject.set(x, "trapFocus", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
  }
}
