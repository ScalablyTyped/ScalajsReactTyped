package typingsJapgolly.spacePen

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  def bindEventHandlers(view: View): Unit
  
  def buildHtml(params: Any): Any
  
  def command(commandName: Any, selector: Any, options: Any, handler: Any): Any
  
  def end(): Any
  
  // tag end
  def initialize(view: View, args: Any): Unit
  
  def preempt(eventName: Any, handler: Any): Any
  
  def pushStack(elems: Any): Any
  
  def wireOutlets(view: View): Unit
}
object View {
  
  inline def apply(
    bindEventHandlers: View => Callback,
    buildHtml: Any => Any,
    command: (Any, Any, Any, Any) => Any,
    end: CallbackTo[Any],
    initialize: (View, Any) => Callback,
    preempt: (Any, Any) => Any,
    pushStack: Any => Any,
    wireOutlets: View => Callback
  ): View = {
    val __obj = js.Dynamic.literal(bindEventHandlers = js.Any.fromFunction1((t0: View) => bindEventHandlers(t0).runNow()), buildHtml = js.Any.fromFunction1(buildHtml), command = js.Any.fromFunction4(command), end = end.toJsFn, initialize = js.Any.fromFunction2((t0: View, t1: Any) => (initialize(t0, t1)).runNow()), preempt = js.Any.fromFunction2(preempt), pushStack = js.Any.fromFunction1(pushStack), wireOutlets = js.Any.fromFunction1((t0: View) => wireOutlets(t0).runNow()))
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setBindEventHandlers(value: View => Callback): Self = StObject.set(x, "bindEventHandlers", js.Any.fromFunction1((t0: View) => value(t0).runNow()))
    
    inline def setBuildHtml(value: Any => Any): Self = StObject.set(x, "buildHtml", js.Any.fromFunction1(value))
    
    inline def setCommand(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "command", js.Any.fromFunction4(value))
    
    inline def setEnd(value: CallbackTo[Any]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setInitialize(value: (View, Any) => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction2((t0: View, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPreempt(value: (Any, Any) => Any): Self = StObject.set(x, "preempt", js.Any.fromFunction2(value))
    
    inline def setPushStack(value: Any => Any): Self = StObject.set(x, "pushStack", js.Any.fromFunction1(value))
    
    inline def setWireOutlets(value: View => Callback): Self = StObject.set(x, "wireOutlets", js.Any.fromFunction1((t0: View) => value(t0).runNow()))
  }
}
