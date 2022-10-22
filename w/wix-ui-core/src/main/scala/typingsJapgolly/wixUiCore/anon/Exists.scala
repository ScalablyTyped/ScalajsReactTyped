package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists extends StObject {
  
  def blur(): Any
  
  def children(): org.scalajs.dom.Element
  
  def click(): Unit
  
  def element(): Any
  
  def exists(): Boolean
  
  def focus(): Any
  
  def hasErrorState(): Boolean
  
  def hasFocusState(): Boolean
  
  def hasReadOnlyState(): Boolean
  
  def input(): HTMLInputElement
  
  def isChecked(): Boolean
  
  def isDisabled(): Boolean
  
  def isIndeterminate(): Boolean
  
  def keyDown(key: String): Any
  
  def mouseDown(): Any
  
  def mouseEnter(): Any
  
  def mouseLeave(): Any
  
  def tickmark(): org.scalajs.dom.Element
}
object Exists {
  
  inline def apply(
    blur: CallbackTo[Any],
    children: CallbackTo[org.scalajs.dom.Element],
    click: Callback,
    element: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    focus: CallbackTo[Any],
    hasErrorState: CallbackTo[Boolean],
    hasFocusState: CallbackTo[Boolean],
    hasReadOnlyState: CallbackTo[Boolean],
    input: CallbackTo[HTMLInputElement],
    isChecked: CallbackTo[Boolean],
    isDisabled: CallbackTo[Boolean],
    isIndeterminate: CallbackTo[Boolean],
    keyDown: String => Any,
    mouseDown: CallbackTo[Any],
    mouseEnter: CallbackTo[Any],
    mouseLeave: CallbackTo[Any],
    tickmark: CallbackTo[org.scalajs.dom.Element]
  ): Exists = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, children = children.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, hasErrorState = hasErrorState.toJsFn, hasFocusState = hasFocusState.toJsFn, hasReadOnlyState = hasReadOnlyState.toJsFn, input = input.toJsFn, isChecked = isChecked.toJsFn, isDisabled = isDisabled.toJsFn, isIndeterminate = isIndeterminate.toJsFn, keyDown = js.Any.fromFunction1(keyDown), mouseDown = mouseDown.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, tickmark = tickmark.toJsFn)
    __obj.asInstanceOf[Exists]
  }
  
  extension [Self <: Exists](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setChildren(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "children", value.toJsFn)
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[Any]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[Any]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setHasErrorState(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasErrorState", value.toJsFn)
    
    inline def setHasFocusState(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFocusState", value.toJsFn)
    
    inline def setHasReadOnlyState(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasReadOnlyState", value.toJsFn)
    
    inline def setInput(value: CallbackTo[HTMLInputElement]): Self = StObject.set(x, "input", value.toJsFn)
    
    inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsIndeterminate(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIndeterminate", value.toJsFn)
    
    inline def setKeyDown(value: String => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setMouseDown(value: CallbackTo[Any]): Self = StObject.set(x, "mouseDown", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setTickmark(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "tickmark", value.toJsFn)
  }
}
