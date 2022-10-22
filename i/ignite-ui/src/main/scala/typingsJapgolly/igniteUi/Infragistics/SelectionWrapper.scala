package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionWrapper extends StObject {
  
  def execCommand(name: js.Object, args: js.Object): Unit
  
  def focus(): Unit
  
  def getSelectedItem(): Unit
  
  def getSelectionAsText(): Unit
  
  def insertElement(element: js.Object): Unit
  
  def insertTable(table: js.Object): Unit
  
  def replaceNode(newNode: js.Object): Unit
  
  def select(element: js.Object): Unit
}
object SelectionWrapper {
  
  inline def apply(
    execCommand: (js.Object, js.Object) => Callback,
    focus: Callback,
    getSelectedItem: Callback,
    getSelectionAsText: Callback,
    insertElement: js.Object => Callback,
    insertTable: js.Object => Callback,
    replaceNode: js.Object => Callback,
    select: js.Object => Callback
  ): SelectionWrapper = {
    val __obj = js.Dynamic.literal(execCommand = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (execCommand(t0, t1)).runNow()), focus = focus.toJsFn, getSelectedItem = getSelectedItem.toJsFn, getSelectionAsText = getSelectionAsText.toJsFn, insertElement = js.Any.fromFunction1((t0: js.Object) => insertElement(t0).runNow()), insertTable = js.Any.fromFunction1((t0: js.Object) => insertTable(t0).runNow()), replaceNode = js.Any.fromFunction1((t0: js.Object) => replaceNode(t0).runNow()), select = js.Any.fromFunction1((t0: js.Object) => select(t0).runNow()))
    __obj.asInstanceOf[SelectionWrapper]
  }
  
  extension [Self <: SelectionWrapper](x: Self) {
    
    inline def setExecCommand(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "execCommand", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetSelectedItem(value: Callback): Self = StObject.set(x, "getSelectedItem", value.toJsFn)
    
    inline def setGetSelectionAsText(value: Callback): Self = StObject.set(x, "getSelectionAsText", value.toJsFn)
    
    inline def setInsertElement(value: js.Object => Callback): Self = StObject.set(x, "insertElement", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setInsertTable(value: js.Object => Callback): Self = StObject.set(x, "insertTable", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setReplaceNode(value: js.Object => Callback): Self = StObject.set(x, "replaceNode", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSelect(value: js.Object => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
