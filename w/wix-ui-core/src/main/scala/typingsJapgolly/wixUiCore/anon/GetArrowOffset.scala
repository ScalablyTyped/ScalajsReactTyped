package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowOffset extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickOutside(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getArrowOffset(): js.Promise[Any]
  
  /**
    * Returns the content element (`<Popover.Content/>`)
    * @returns null if element is not found
    */
  def getContentElement(): js.Promise[Any]
  
  def getPortalElement(): js.Promise[Any]
  
  def getTargetElement(): js.Promise[Any]
  
  /** Returns `true` whether the content element (`<Popover.Content/>`) exists */
  def isContentElementExists(): js.Promise[Boolean]
  
  /** Returns `true` whether the target element (`<Popover.Element/>`) exists */
  def isTargetElementExists(): js.Promise[Boolean]
  
  def mouseEnter(): js.Promise[Unit]
  
  def mouseLeave(): js.Promise[Unit]
}
object GetArrowOffset {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    clickOutside: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getArrowOffset: CallbackTo[js.Promise[Any]],
    getContentElement: CallbackTo[js.Promise[Any]],
    getPortalElement: CallbackTo[js.Promise[Any]],
    getTargetElement: CallbackTo[js.Promise[Any]],
    isContentElementExists: CallbackTo[js.Promise[Boolean]],
    isTargetElementExists: CallbackTo[js.Promise[Boolean]],
    mouseEnter: CallbackTo[js.Promise[Unit]],
    mouseLeave: CallbackTo[js.Promise[Unit]]
  ): GetArrowOffset = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickOutside = clickOutside.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getPortalElement = getPortalElement.toJsFn, getTargetElement = getTargetElement.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
    __obj.asInstanceOf[GetArrowOffset]
  }
  
  extension [Self <: GetArrowOffset](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOutside(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetPortalElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getPortalElement", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
  }
}
