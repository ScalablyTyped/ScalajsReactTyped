package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTickerDown extends StObject {
  
  def blur(): Any
  
  def clickTickerDown(): Any
  
  def clickTickerUp(): Any
  
  def element(): Any
  
  def exists(): Boolean
  
  def focus(): Any
  
  def getInlineStyle(): CSSStyleDeclaration
  
  def getInputElement(): Any
  
  def getInputType(): Any
  
  def getTickers(): Any
  
  def getValue(): Any
  
  def isDisabled(): Any
  
  def keyDown(key: Any): Any
  
  def setValue(value: Any): Unit
}
object ClickTickerDown {
  
  inline def apply(
    blur: CallbackTo[Any],
    clickTickerDown: CallbackTo[Any],
    clickTickerUp: CallbackTo[Any],
    element: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    focus: CallbackTo[Any],
    getInlineStyle: CallbackTo[CSSStyleDeclaration],
    getInputElement: CallbackTo[Any],
    getInputType: CallbackTo[Any],
    getTickers: CallbackTo[Any],
    getValue: CallbackTo[Any],
    isDisabled: CallbackTo[Any],
    keyDown: Any => Any,
    setValue: Any => Callback
  ): ClickTickerDown = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, clickTickerDown = clickTickerDown.toJsFn, clickTickerUp = clickTickerUp.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getInlineStyle = getInlineStyle.toJsFn, getInputElement = getInputElement.toJsFn, getInputType = getInputType.toJsFn, getTickers = getTickers.toJsFn, getValue = getValue.toJsFn, isDisabled = isDisabled.toJsFn, keyDown = js.Any.fromFunction1(keyDown), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()))
    __obj.asInstanceOf[ClickTickerDown]
  }
  
  extension [Self <: ClickTickerDown](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setClickTickerDown(value: CallbackTo[Any]): Self = StObject.set(x, "clickTickerDown", value.toJsFn)
    
    inline def setClickTickerUp(value: CallbackTo[Any]): Self = StObject.set(x, "clickTickerUp", value.toJsFn)
    
    inline def setElement(value: CallbackTo[Any]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[Any]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetInlineStyle(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getInlineStyle", value.toJsFn)
    
    inline def setGetInputElement(value: CallbackTo[Any]): Self = StObject.set(x, "getInputElement", value.toJsFn)
    
    inline def setGetInputType(value: CallbackTo[Any]): Self = StObject.set(x, "getInputType", value.toJsFn)
    
    inline def setGetTickers(value: CallbackTo[Any]): Self = StObject.set(x, "getTickers", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setKeyDown(value: Any => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
