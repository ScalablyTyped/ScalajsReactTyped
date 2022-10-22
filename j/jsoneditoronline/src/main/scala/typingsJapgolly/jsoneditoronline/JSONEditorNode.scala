package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorNode extends StObject {
  
  def appendChild(node: JSONEditorNode): Unit
  
  def blur(): Unit
  
  def changeType(newType: String): Unit
  
  def clearDom(): Unit
  
  def collapse(recurse: Boolean): Unit
  
  def containsNode(node: JSONEditorNode): Boolean
  
  def expand(recurse: Boolean): Unit
  
  def focus(): Unit
  
  def getAppend(): HTMLElement
  
  def getDom(): HTMLElement
  
  def getField(): String
  
  def getLevel(): Double
  
  def getParent(): JSONEditorNode
  
  def getValue(): Any
  
  def hide(): Unit
  
  def hideChilds(): Unit
  
  def insertBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  
  def moveBefore(node: JSONEditorNode, beforeNode: JSONEditorNode): Unit
  
  def moveTo(node: JSONEditorNode, index: Double): Unit
  
  def onEvent(event: Event): Unit
  
  def removeChild(node: JSONEditorNode): JSONEditorNode
  
  def scrollTo(): Unit
  
  def search(text: String): js.Array[JSONEditorNode]
  
  def setField(field: String, fieldEditable: Boolean): Unit
  
  def setHighlight(highlight: Boolean): Unit
  
  def setParent(parent: JSONEditorNode): Unit
  
  def setValue(value: Any): Unit
  
  def showChilds(): Unit
  
  var types: js.Array[JSONEditorNodeType]
  
  def updateDom(): Unit
  
  def updateField(field: String): Unit
  
  def updateValue(value: Any): Unit
}
object JSONEditorNode {
  
  inline def apply(
    appendChild: JSONEditorNode => Callback,
    blur: Callback,
    changeType: String => Callback,
    clearDom: Callback,
    collapse: Boolean => Callback,
    containsNode: JSONEditorNode => Boolean,
    expand: Boolean => Callback,
    focus: Callback,
    getAppend: CallbackTo[HTMLElement],
    getDom: CallbackTo[HTMLElement],
    getField: CallbackTo[String],
    getLevel: CallbackTo[Double],
    getParent: CallbackTo[JSONEditorNode],
    getValue: CallbackTo[Any],
    hide: Callback,
    hideChilds: Callback,
    insertBefore: (JSONEditorNode, JSONEditorNode) => Callback,
    moveBefore: (JSONEditorNode, JSONEditorNode) => Callback,
    moveTo: (JSONEditorNode, Double) => Callback,
    onEvent: Event => Callback,
    removeChild: JSONEditorNode => JSONEditorNode,
    scrollTo: Callback,
    search: String => js.Array[JSONEditorNode],
    setField: (String, Boolean) => Callback,
    setHighlight: Boolean => Callback,
    setParent: JSONEditorNode => Callback,
    setValue: Any => Callback,
    showChilds: Callback,
    types: js.Array[JSONEditorNodeType],
    updateDom: Callback,
    updateField: String => Callback,
    updateValue: Any => Callback
  ): JSONEditorNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1((t0: JSONEditorNode) => appendChild(t0).runNow()), blur = blur.toJsFn, changeType = js.Any.fromFunction1((t0: String) => changeType(t0).runNow()), clearDom = clearDom.toJsFn, collapse = js.Any.fromFunction1((t0: Boolean) => collapse(t0).runNow()), containsNode = js.Any.fromFunction1(containsNode), expand = js.Any.fromFunction1((t0: Boolean) => expand(t0).runNow()), focus = focus.toJsFn, getAppend = getAppend.toJsFn, getDom = getDom.toJsFn, getField = getField.toJsFn, getLevel = getLevel.toJsFn, getParent = getParent.toJsFn, getValue = getValue.toJsFn, hide = hide.toJsFn, hideChilds = hideChilds.toJsFn, insertBefore = js.Any.fromFunction2((t0: JSONEditorNode, t1: JSONEditorNode) => (insertBefore(t0, t1)).runNow()), moveBefore = js.Any.fromFunction2((t0: JSONEditorNode, t1: JSONEditorNode) => (moveBefore(t0, t1)).runNow()), moveTo = js.Any.fromFunction2((t0: JSONEditorNode, t1: Double) => (moveTo(t0, t1)).runNow()), onEvent = js.Any.fromFunction1((t0: Event) => onEvent(t0).runNow()), removeChild = js.Any.fromFunction1(removeChild), scrollTo = scrollTo.toJsFn, search = js.Any.fromFunction1(search), setField = js.Any.fromFunction2((t0: String, t1: Boolean) => (setField(t0, t1)).runNow()), setHighlight = js.Any.fromFunction1((t0: Boolean) => setHighlight(t0).runNow()), setParent = js.Any.fromFunction1((t0: JSONEditorNode) => setParent(t0).runNow()), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()), showChilds = showChilds.toJsFn, types = types.asInstanceOf[js.Any], updateDom = updateDom.toJsFn, updateField = js.Any.fromFunction1((t0: String) => updateField(t0).runNow()), updateValue = js.Any.fromFunction1((t0: Any) => updateValue(t0).runNow()))
    __obj.asInstanceOf[JSONEditorNode]
  }
  
  extension [Self <: JSONEditorNode](x: Self) {
    
    inline def setAppendChild(value: JSONEditorNode => Callback): Self = StObject.set(x, "appendChild", js.Any.fromFunction1((t0: JSONEditorNode) => value(t0).runNow()))
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setChangeType(value: String => Callback): Self = StObject.set(x, "changeType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClearDom(value: Callback): Self = StObject.set(x, "clearDom", value.toJsFn)
    
    inline def setCollapse(value: Boolean => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setContainsNode(value: JSONEditorNode => Boolean): Self = StObject.set(x, "containsNode", js.Any.fromFunction1(value))
    
    inline def setExpand(value: Boolean => Callback): Self = StObject.set(x, "expand", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetAppend(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getAppend", value.toJsFn)
    
    inline def setGetDom(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getDom", value.toJsFn)
    
    inline def setGetField(value: CallbackTo[String]): Self = StObject.set(x, "getField", value.toJsFn)
    
    inline def setGetLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getLevel", value.toJsFn)
    
    inline def setGetParent(value: CallbackTo[JSONEditorNode]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideChilds(value: Callback): Self = StObject.set(x, "hideChilds", value.toJsFn)
    
    inline def setInsertBefore(value: (JSONEditorNode, JSONEditorNode) => Callback): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2((t0: JSONEditorNode, t1: JSONEditorNode) => (value(t0, t1)).runNow()))
    
    inline def setMoveBefore(value: (JSONEditorNode, JSONEditorNode) => Callback): Self = StObject.set(x, "moveBefore", js.Any.fromFunction2((t0: JSONEditorNode, t1: JSONEditorNode) => (value(t0, t1)).runNow()))
    
    inline def setMoveTo(value: (JSONEditorNode, Double) => Callback): Self = StObject.set(x, "moveTo", js.Any.fromFunction2((t0: JSONEditorNode, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnEvent(value: Event => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setRemoveChild(value: JSONEditorNode => JSONEditorNode): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setScrollTo(value: Callback): Self = StObject.set(x, "scrollTo", value.toJsFn)
    
    inline def setSearch(value: String => js.Array[JSONEditorNode]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setSetField(value: (String, Boolean) => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetHighlight(value: Boolean => Callback): Self = StObject.set(x, "setHighlight", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetParent(value: JSONEditorNode => Callback): Self = StObject.set(x, "setParent", js.Any.fromFunction1((t0: JSONEditorNode) => value(t0).runNow()))
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShowChilds(value: Callback): Self = StObject.set(x, "showChilds", value.toJsFn)
    
    inline def setTypes(value: js.Array[JSONEditorNodeType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: JSONEditorNodeType*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUpdateDom(value: Callback): Self = StObject.set(x, "updateDom", value.toJsFn)
    
    inline def setUpdateField(value: String => Callback): Self = StObject.set(x, "updateField", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateValue(value: Any => Callback): Self = StObject.set(x, "updateValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
