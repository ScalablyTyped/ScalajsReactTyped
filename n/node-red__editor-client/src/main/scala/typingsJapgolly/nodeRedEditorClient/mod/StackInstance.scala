package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeRedEditorClient.anon.Collapsible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackInstance extends StObject {
  
  def add(entry: Collapsible): StackInstanceEntry
  
  def hide(): StackInstance
  
  def resize(): Unit
  
  def show(): StackInstance
}
object StackInstance {
  
  inline def apply(
    add: Collapsible => StackInstanceEntry,
    hide: CallbackTo[StackInstance],
    resize: Callback,
    show: CallbackTo[StackInstance]
  ): StackInstance = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), hide = hide.toJsFn, resize = resize.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[StackInstance]
  }
  
  extension [Self <: StackInstance](x: Self) {
    
    inline def setAdd(value: Collapsible => StackInstanceEntry): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setHide(value: CallbackTo[StackInstance]): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setResize(value: Callback): Self = StObject.set(x, "resize", value.toJsFn)
    
    inline def setShow(value: CallbackTo[StackInstance]): Self = StObject.set(x, "show", value.toJsFn)
  }
}
