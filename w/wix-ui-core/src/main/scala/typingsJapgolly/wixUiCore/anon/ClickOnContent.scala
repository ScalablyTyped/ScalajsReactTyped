package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOnContent extends StObject {
  
  def click(): Any
  
  /** Perform a click outside on the content element */
  def clickOnContent(): Unit
  
  def clickOutside(): Unit
  
  def exists(): Boolean
  
  def getArrowElement(): org.scalajs.dom.Element
  
  def getArrowOffset(): Bottom
  
  def getContentElement(): Any
  
  def getElementId(): Any
  
  /** Return the <Popover/>'s portal element */
  def getPortalElement(): Any
  
  def getTargetElement(): org.scalajs.dom.Element
  
  def inlineStyles(): Any
  
  def isContentElementExists(): Boolean
  
  def isTargetElementExists(): Boolean
  
  def mouseEnter(): Any
  
  def mouseLeave(): Any
}
object ClickOnContent {
  
  inline def apply(
    click: CallbackTo[Any],
    clickOnContent: Callback,
    clickOutside: Callback,
    exists: CallbackTo[Boolean],
    getArrowElement: CallbackTo[org.scalajs.dom.Element],
    getArrowOffset: CallbackTo[Bottom],
    getContentElement: CallbackTo[Any],
    getElementId: CallbackTo[Any],
    getPortalElement: CallbackTo[Any],
    getTargetElement: CallbackTo[org.scalajs.dom.Element],
    inlineStyles: CallbackTo[Any],
    isContentElementExists: CallbackTo[Boolean],
    isTargetElementExists: CallbackTo[Boolean],
    mouseEnter: CallbackTo[Any],
    mouseLeave: CallbackTo[Any]
  ): ClickOnContent = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnContent = clickOnContent.toJsFn, clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, getArrowElement = getArrowElement.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getElementId = getElementId.toJsFn, getPortalElement = getPortalElement.toJsFn, getTargetElement = getTargetElement.toJsFn, inlineStyles = inlineStyles.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
    __obj.asInstanceOf[ClickOnContent]
  }
  
  extension [Self <: ClickOnContent](x: Self) {
    
    inline def setClick(value: CallbackTo[Any]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOnContent(value: Callback): Self = StObject.set(x, "clickOnContent", value.toJsFn)
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getArrowElement", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[Bottom]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[Any]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetElementId(value: CallbackTo[Any]): Self = StObject.set(x, "getElementId", value.toJsFn)
    
    inline def setGetPortalElement(value: CallbackTo[Any]): Self = StObject.set(x, "getPortalElement", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[org.scalajs.dom.Element]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setInlineStyles(value: CallbackTo[Any]): Self = StObject.set(x, "inlineStyles", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[Any]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[Any]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
  }
}
