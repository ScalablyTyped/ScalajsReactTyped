package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxDriverAt extends StObject {
  
  def checkboxDriverAt(index: Double): Exists
  
  def click(): Any
  
  def clickOutside(): Unit
  
  def dropdownContentDisplayed(): Boolean
  
  def exists(): Boolean
  
  def getArrowElement(): org.scalajs.dom.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): Any
  
  def getElementId(): Any
  
  def getForAttribute(): Any
  
  def getId(): Any
  
  def getLabelText(): Any
  
  def getOptionsCount(): Any
  
  def getSelectedOptionsCount(): Double
  
  def getSuffix(): Any
  
  def getTargetElement(): org.scalajs.dom.Element
  
  def hasEllipsis(): Boolean
  
  def hasStyleState(state: Any): Boolean
  
  def inlineStyles(): Any
  
  def isContentElementExists(): Boolean
  
  def isDisabled(): Boolean
  
  def isError(): Boolean
  
  def isRequired(): Boolean
  
  def isTargetElementExists(): Boolean
  
  def keyDown(key: Any): Any
  
  def mouseEnter(): Any
  
  def mouseLeave(): Any
  
  def optionAt(index: Double): ClassName
  
  def triggerMouseDownOnDropdownContent(): Any
}
object CheckboxDriverAt {
  
  inline def apply(
    checkboxDriverAt: Double => Exists,
    click: CallbackTo[Any],
    clickOutside: Callback,
    dropdownContentDisplayed: CallbackTo[Boolean],
    exists: CallbackTo[Boolean],
    getArrowElement: CallbackTo[org.scalajs.dom.Element],
    getArrowOffset: CallbackTo[Bottom],
    getContentElement: CallbackTo[Any],
    getElementId: CallbackTo[Any],
    getForAttribute: CallbackTo[Any],
    getId: CallbackTo[Any],
    getLabelText: CallbackTo[Any],
    getOptionsCount: CallbackTo[Any],
    getSelectedOptionsCount: CallbackTo[Double],
    getSuffix: CallbackTo[Any],
    getTargetElement: CallbackTo[org.scalajs.dom.Element],
    hasEllipsis: CallbackTo[Boolean],
    hasStyleState: Any => Boolean,
    inlineStyles: CallbackTo[Any],
    isContentElementExists: CallbackTo[Boolean],
    isDisabled: CallbackTo[Boolean],
    isError: CallbackTo[Boolean],
    isRequired: CallbackTo[Boolean],
    isTargetElementExists: CallbackTo[Boolean],
    keyDown: Any => Any,
    mouseEnter: CallbackTo[Any],
    mouseLeave: CallbackTo[Any],
    optionAt: Double => ClassName,
    triggerMouseDownOnDropdownContent: CallbackTo[Any]
  ): CheckboxDriverAt = {
    val __obj = js.Dynamic.literal(checkboxDriverAt = js.Any.fromFunction1(checkboxDriverAt), click = click.toJsFn, clickOutside = clickOutside.toJsFn, dropdownContentDisplayed = dropdownContentDisplayed.toJsFn, exists = exists.toJsFn, getArrowElement = getArrowElement.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getElementId = getElementId.toJsFn, getForAttribute = getForAttribute.toJsFn, getId = getId.toJsFn, getLabelText = getLabelText.toJsFn, getOptionsCount = getOptionsCount.toJsFn, getSelectedOptionsCount = getSelectedOptionsCount.toJsFn, getSuffix = getSuffix.toJsFn, getTargetElement = getTargetElement.toJsFn, hasEllipsis = hasEllipsis.toJsFn, hasStyleState = js.Any.fromFunction1(hasStyleState), inlineStyles = inlineStyles.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isDisabled = isDisabled.toJsFn, isError = isError.toJsFn, isRequired = isRequired.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, keyDown = js.Any.fromFunction1(keyDown), mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn, optionAt = js.Any.fromFunction1(optionAt), triggerMouseDownOnDropdownContent = triggerMouseDownOnDropdownContent.toJsFn)
    __obj.asInstanceOf[CheckboxDriverAt]
  }
  
  extension [Self <: CheckboxDriverAt](x: Self) {
    
    inline def setCheckboxDriverAt(value: Double => Exists): Self = StObject.set(x, "checkboxDriverAt", js.Any.fromFunction1(value))
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setDropdownContentDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "dropdownContentDisplayed", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getArrowElement", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[Bottom]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[Any]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetElementId(value: CallbackTo[Any]): Self = StObject.set(x, "getElementId", value.toJsFn)
    
    inline def setGetForAttribute(value: CallbackTo[Any]): Self = StObject.set(x, "getForAttribute", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Any]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLabelText(value: CallbackTo[Any]): Self = StObject.set(x, "getLabelText", value.toJsFn)
    
    inline def setGetOptionsCount(value: CallbackTo[Any]): Self = StObject.set(x, "getOptionsCount", value.toJsFn)
    
    inline def setGetSelectedOptionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedOptionsCount", value.toJsFn)
    
    inline def setGetSuffix(value: CallbackTo[Any]): Self = StObject.set(x, "getSuffix", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setHasEllipsis(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasEllipsis", value.toJsFn)
    
    inline def setHasStyleState(value: Any => Boolean): Self = StObject.set(x, "hasStyleState", js.Any.fromFunction1(value))
    
    inline def setInlineStyles(value: CallbackTo[Any]): Self = StObject.set(x, "inlineStyles", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isError", value.toJsFn)
    
    inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setKeyDown(value: Any => Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
    
    inline def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    inline def setTriggerMouseDownOnDropdownContent(value: CallbackTo[Any]): Self = StObject.set(x, "triggerMouseDownOnDropdownContent", value.toJsFn)
  }
}
