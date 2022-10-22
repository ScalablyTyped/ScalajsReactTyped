package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeInput extends StObject {
  
  /** @returns {array} array of children unidrivers */
  def _DEPRECATED_children(): Any
  
  def _DEPRECATED_getClassList(): js.Promise[Any]
  
  var _private: CompositionEnd
  
  def beforeInput(eventData: Any): js.Promise[Any]
  
  def blur(): js.Promise[Unit]
  
  def focus(): js.Promise[Unit]
  
  def isFocus(): js.Promise[Boolean]
  
  def keyDown(eventData: Any): js.Promise[Unit]
  
  def keyUp(eventData: Any): js.Promise[Unit]
  
  def mouseEnter(eventData: Any): js.Promise[Unit]
  
  def mouseLeave(eventData: Any): js.Promise[Unit]
  
  def paste(): js.Promise[Unit]
  
  def select(selectedIndex: Any): js.Promise[Unit]
  
  def wheel(eventData: Any): js.Promise[Unit]
}
object BeforeInput {
  
  inline def apply(
    _DEPRECATED_children: CallbackTo[Any],
    _DEPRECATED_getClassList: CallbackTo[js.Promise[Any]],
    _private: CompositionEnd,
    beforeInput: Any => js.Promise[Any],
    blur: CallbackTo[js.Promise[Unit]],
    focus: CallbackTo[js.Promise[Unit]],
    isFocus: CallbackTo[js.Promise[Boolean]],
    keyDown: Any => js.Promise[Unit],
    keyUp: Any => js.Promise[Unit],
    mouseEnter: Any => js.Promise[Unit],
    mouseLeave: Any => js.Promise[Unit],
    paste: CallbackTo[js.Promise[Unit]],
    select: Any => js.Promise[Unit],
    wheel: Any => js.Promise[Unit]
  ): BeforeInput = {
    val __obj = js.Dynamic.literal(_DEPRECATED_children = _DEPRECATED_children.toJsFn, _DEPRECATED_getClassList = _DEPRECATED_getClassList.toJsFn, _private = _private.asInstanceOf[js.Any], beforeInput = js.Any.fromFunction1(beforeInput), blur = blur.toJsFn, focus = focus.toJsFn, isFocus = isFocus.toJsFn, keyDown = js.Any.fromFunction1(keyDown), keyUp = js.Any.fromFunction1(keyUp), mouseEnter = js.Any.fromFunction1(mouseEnter), mouseLeave = js.Any.fromFunction1(mouseLeave), paste = paste.toJsFn, select = js.Any.fromFunction1(select), wheel = js.Any.fromFunction1(wheel))
    __obj.asInstanceOf[BeforeInput]
  }
  
  extension [Self <: BeforeInput](x: Self) {
    
    inline def setBeforeInput(value: Any => js.Promise[Any]): Self = StObject.set(x, "beforeInput", js.Any.fromFunction1(value))
    
    inline def setBlur(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setIsFocus(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocus", value.toJsFn)
    
    inline def setKeyDown(value: Any => js.Promise[Unit]): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setKeyUp(value: Any => js.Promise[Unit]): Self = StObject.set(x, "keyUp", js.Any.fromFunction1(value))
    
    inline def setMouseEnter(value: Any => js.Promise[Unit]): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction1(value))
    
    inline def setMouseLeave(value: Any => js.Promise[Unit]): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction1(value))
    
    inline def setPaste(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "paste", value.toJsFn)
    
    inline def setSelect(value: Any => js.Promise[Unit]): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setWheel(value: Any => js.Promise[Unit]): Self = StObject.set(x, "wheel", js.Any.fromFunction1(value))
    
    inline def set_DEPRECATED_children(value: CallbackTo[Any]): Self = StObject.set(x, "_DEPRECATED_children", value.toJsFn)
    
    inline def set_DEPRECATED_getClassList(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "_DEPRECATED_getClassList", value.toJsFn)
    
    inline def set_private(value: CompositionEnd): Self = StObject.set(x, "_private", value.asInstanceOf[js.Any])
  }
}
