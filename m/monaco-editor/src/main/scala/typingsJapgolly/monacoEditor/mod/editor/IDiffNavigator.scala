package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffNavigator extends StObject {
  
  def canNavigate(): Boolean
  
  def dispose(): Unit
  
  def next(): Unit
  
  def previous(): Unit
}
object IDiffNavigator {
  
  inline def apply(canNavigate: CallbackTo[Boolean], dispose: Callback, next: Callback, previous: Callback): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = canNavigate.toJsFn, dispose = dispose.toJsFn, next = next.toJsFn, previous = previous.toJsFn)
    __obj.asInstanceOf[IDiffNavigator]
  }
  
  extension [Self <: IDiffNavigator](x: Self) {
    
    inline def setCanNavigate(value: CallbackTo[Boolean]): Self = StObject.set(x, "canNavigate", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
  }
}
