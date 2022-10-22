package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blur extends StObject {
  
  def blur(): Any
  
  def click(): Any
  
  def clickInput(): Any
  
  def clickOutside(): Unit
  
  def doubleClickInput(): Any
  
  def dropdownContentDisplayed(): Boolean
  
  def exists(): Boolean
  
  def focus(): Any
  
  def getArrowElement(): org.scalajs.dom.Element
  
  def getArrowOffset(): Bottom
  
  def getAutoComplete(): Any
  
  def getContentElement(): Any
  
  def getElementId(): Any
  
  def getId(): Any
  
  def getInput(): Any
  
  def getOptionsCount(): Any
  
  def getPlaceholder(): Any
  
  def getPrefix(): Any
  
  def getSelectedOptionsCount(): Double
  
  def getSuffix(): Any
  
  def getTargetElement(): org.scalajs.dom.Element
  
  def getValue(): Any
  
  def hasStyleState(state: Any): Boolean
  
  def inlineStyles(): Any
  
  def isContentElementExists(): Boolean
  
  def isDisabled(): Any
  
  def isReadOnly(): Any
  
  def isTargetElementExists(): Boolean
  
  def keyDown(key: Any): Any
  
  def mouseEnter(): Any
  
  def mouseEnterInput(): Any
  
  def mouseLeave(): Any
  
  def mouseLeaveInput(): Any
  
  def optionAt(index: Double): ClassName
  
  def setValue(value: Any): Unit
  
  def triggerMouseDownOnDropdownContent(): Any
}
object Blur {
  
  inline def apply(
    blur: CallbackTo[Any],
    click: CallbackTo[Any],
    clickInput: CallbackTo[Any],
    clickOutside: Callback,
    doubleClickInput: CallbackTo[Any],
    dropdownContentDisplayed: CallbackTo[Boolean],
    exists: CallbackTo[Boolean],
    focus: CallbackTo[Any],
    getArrowElement: CallbackTo[org.scalajs.dom.Element],
    getArrowOffset: CallbackTo[Bottom],
    getAutoComplete: CallbackTo[Any],
    getContentElement: CallbackTo[Any],
    getElementId: CallbackTo[Any],
    getId: CallbackTo[Any],
    getInput: CallbackTo[Any],
    getOptionsCount: CallbackTo[Any],
    getPlaceholder: CallbackTo[Any],
    getPrefix: CallbackTo[Any],
    getSelectedOptionsCount: CallbackTo[Double],
    getSuffix: CallbackTo[Any],
    getTargetElement: CallbackTo[org.scalajs.dom.Element],
    getValue: CallbackTo[Any],
    hasStyleState: Any => Boolean,
    inlineStyles: CallbackTo[Any],
    isContentElementExists: CallbackTo[Boolean],
    isDisabled: CallbackTo[Any],
    isReadOnly: CallbackTo[Any],
    isTargetElementExists: CallbackTo[Boolean],
    keyDown: Any => Any,
    mouseEnter: CallbackTo[Any],
    mouseEnterInput: CallbackTo[Any],
    mouseLeave: CallbackTo[Any],
    mouseLeaveInput: CallbackTo[Any],
    optionAt: Double => ClassName,
    setValue: Any => Callback,
    triggerMouseDownOnDropdownContent: CallbackTo[Any]
  ): Blur = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, clickInput = clickInput.toJsFn, clickOutside = clickOutside.toJsFn, doubleClickInput = doubleClickInput.toJsFn, dropdownContentDisplayed = dropdownContentDisplayed.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getArrowElement = getArrowElement.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getAutoComplete = getAutoComplete.toJsFn, getContentElement = getContentElement.toJsFn, getElementId = getElementId.toJsFn, getId = getId.toJsFn, getInput = getInput.toJsFn, getOptionsCount = getOptionsCount.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getPrefix = getPrefix.toJsFn, getSelectedOptionsCount = getSelectedOptionsCount.toJsFn, getSuffix = getSuffix.toJsFn, getTargetElement = getTargetElement.toJsFn, getValue = getValue.toJsFn, hasStyleState = js.Any.fromFunction1(hasStyleState), inlineStyles = inlineStyles.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isDisabled = isDisabled.toJsFn, isReadOnly = isReadOnly.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, keyDown = js.Any.fromFunction1(keyDown), mouseEnter = mouseEnter.toJsFn, mouseEnterInput = mouseEnterInput.toJsFn, mouseLeave = mouseLeave.toJsFn, mouseLeaveInput = mouseLeaveInput.toJsFn, optionAt = js.Any.fromFunction1(optionAt), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()), triggerMouseDownOnDropdownContent = triggerMouseDownOnDropdownContent.toJsFn)
    __obj.asInstanceOf[Blur]
  }
  
  extension [Self <: Blur](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickInput(value: CallbackTo[Any]): Self = StObject.set(x, "clickInput", value.toJsFn)
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setDoubleClickInput(value: CallbackTo[Any]): Self = StObject.set(x, "doubleClickInput", value.toJsFn)
    
    inline def setDropdownContentDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "dropdownContentDisplayed", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[Any]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetArrowElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getArrowElement", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[Bottom]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetAutoComplete(value: CallbackTo[Any]): Self = StObject.set(x, "getAutoComplete", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[Any]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetElementId(value: CallbackTo[Any]): Self = StObject.set(x, "getElementId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetInput(value: CallbackTo[Any]): Self = StObject.set(x, "getInput", value.toJsFn)
    
    inline def setGetOptionsCount(value: CallbackTo[Any]): Self = StObject.set(x, "getOptionsCount", value.toJsFn)
    
    inline def setGetPlaceholder(value: CallbackTo[Any]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
    
    inline def setGetPrefix(value: CallbackTo[Any]): Self = StObject.set(x, "getPrefix", value.toJsFn)
    
    inline def setGetSelectedOptionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedOptionsCount", value.toJsFn)
    
    inline def setGetSuffix(value: CallbackTo[Any]): Self = StObject.set(x, "getSuffix", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setHasStyleState(value: Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    inline def setInlineStyles(value: CallbackTo[Any]): Self = StObject.set(x, "inlineStyles", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsReadOnly(value: CallbackTo[Any]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setKeyDown(value: Any => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseEnterInput(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnterInput", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setMouseLeaveInput(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeaveInput", value.toJsFn)
    
    inline def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTriggerMouseDownOnDropdownContent(value: CallbackTo[Any]): Self = StObject.set(x, "triggerMouseDownOnDropdownContent", value.toJsFn)
  }
}
