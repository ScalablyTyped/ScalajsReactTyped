package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowElement extends StObject {
  
  /** Click on the element */
  def click(): Unit
  
  /** Click outside the element */
  def clickOutside(): Unit
  
  /** Whether the element exists or not */
  def exists(): Boolean
  
  /** Returns the arrow element */
  def getArrowElement(): js.UndefOr[org.scalajs.dom.Element]
  
  /** Returns the arrow offset */
  def getArrowOffset(): Bottom
  
  /** Returns the content element (`<Popover.Content/>`) */
  def getContentElement(): org.scalajs.dom.Element | Null
  
  /** Returns the element's id */
  def getElementId(): js.UndefOr[String]
  
  /** Returns the target element (`<Popover.Element/>`) */
  def getTargetElement(): js.UndefOr[org.scalajs.dom.Element]
  
  /** Returns the element's inline styles */
  def inlineStyles(): Any
  
  /** Returns `true` whether the content element (`<Popover.Content/>`) exists */
  def isContentElementExists(): Boolean
  
  /** Returns `true` whether the target element (`<Popover.Element/>`) exists */
  def isTargetElementExists(): Boolean
  
  /** Trigger `mouseEnter` on the element */
  def mouseEnter(): js.UndefOr[Unit]
  
  /** Trigger `mouseLeave` on the element */
  def mouseLeave(): js.UndefOr[Unit]
}
object GetArrowElement {
  
  inline def apply(
    click: Callback,
    clickOutside: Callback,
    exists: CallbackTo[Boolean],
    getArrowElement: CallbackTo[js.UndefOr[org.scalajs.dom.Element]],
    getArrowOffset: CallbackTo[Bottom],
    getContentElement: CallbackTo[org.scalajs.dom.Element | Null],
    getElementId: CallbackTo[js.UndefOr[String]],
    getTargetElement: CallbackTo[js.UndefOr[org.scalajs.dom.Element]],
    inlineStyles: CallbackTo[Any],
    isContentElementExists: CallbackTo[Boolean],
    isTargetElementExists: CallbackTo[Boolean],
    mouseEnter: CallbackTo[js.UndefOr[Unit]],
    mouseLeave: CallbackTo[js.UndefOr[Unit]]
  ): GetArrowElement = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, getArrowElement = getArrowElement.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getElementId = getElementId.toJsFn, getTargetElement = getTargetElement.toJsFn, inlineStyles = inlineStyles.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
    __obj.asInstanceOf[GetArrowElement]
  }
  
  extension [Self <: GetArrowElement](x: Self) {
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOutside(value: Callback): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowElement(value: CallbackTo[js.UndefOr[org.scalajs.dom.Element]]): Self = StObject.set(x, "getArrowElement", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[Bottom]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[org.scalajs.dom.Element | Null]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetElementId(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getElementId", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[js.UndefOr[org.scalajs.dom.Element]]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setInlineStyles(value: CallbackTo[Any]): Self = StObject.set(x, "inlineStyles", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
  }
}
