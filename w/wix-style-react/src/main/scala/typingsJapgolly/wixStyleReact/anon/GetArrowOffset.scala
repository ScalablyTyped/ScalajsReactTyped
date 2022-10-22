package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArrowOffset extends StObject {
  
  /**
    * Clicks on the target element
    * @returns {Promise<void>}
    */
  def click(): js.Promise[Unit]
  
  /**
    * Clicks outside the target element (triggers mouseDown and mouseUp events)
    * @returns {Promise<void>}
    */
  def clickOutside(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /**
    * Gets the arrow offset
    * @returns {Promise<any>}
    */
  def getArrowOffset(): js.Promise[Any]
  
  /**
    * Gets the content element
    * @returns {Promise<any>}
    */
  def getContentElement(): js.Promise[Any]
  
  /**
    * Gets content as unidriver element
    * @private
    */
  def getContentElementUniDriver(): js.Promise[UniDriver[Any]]
  
  /**
    * Gets the portal element
    * @returns {Promise<any>}
    */
  def getPortalElement(): js.Promise[Any]
  
  /**
    * Gets the target element
    * @returns {Promise<any>}
    */
  def getTargetElement(): js.Promise[Any]
  
  /**
    * Checks whether content element exists
    * @returns {Promise<boolean>}
    */
  def isContentElementExists(): js.Promise[Boolean]
  
  /**
    * Checks whether target element exists
    * @returns {Promise<boolean>}
    */
  def isTargetElementExists(): js.Promise[Boolean]
  
  /**
    * Triggers a mouseEnter event
    * @returns {Promise<void>}
    */
  def mouseEnter(): js.Promise[Unit]
  
  /**
    * Triggers a mouseLeave event
    * @returns {Promise<void>}
    */
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
    getContentElementUniDriver: CallbackTo[js.Promise[UniDriver[Any]]],
    getPortalElement: CallbackTo[js.Promise[Any]],
    getTargetElement: CallbackTo[js.Promise[Any]],
    isContentElementExists: CallbackTo[js.Promise[Boolean]],
    isTargetElementExists: CallbackTo[js.Promise[Boolean]],
    mouseEnter: CallbackTo[js.Promise[Unit]],
    mouseLeave: CallbackTo[js.Promise[Unit]]
  ): GetArrowOffset = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickOutside = clickOutside.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getArrowOffset = getArrowOffset.toJsFn, getContentElement = getContentElement.toJsFn, getContentElementUniDriver = getContentElementUniDriver.toJsFn, getPortalElement = getPortalElement.toJsFn, getTargetElement = getTargetElement.toJsFn, isContentElementExists = isContentElementExists.toJsFn, isTargetElementExists = isTargetElementExists.toJsFn, mouseEnter = mouseEnter.toJsFn, mouseLeave = mouseLeave.toJsFn)
    __obj.asInstanceOf[GetArrowOffset]
  }
  
  extension [Self <: GetArrowOffset](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickOutside(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetArrowOffset(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getArrowOffset", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetContentElementUniDriver(value: CallbackTo[js.Promise[UniDriver[Any]]]): Self = StObject.set(x, "getContentElementUniDriver", value.toJsFn)
    
    inline def setGetPortalElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getPortalElement", value.toJsFn)
    
    inline def setGetTargetElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTargetElement", value.toJsFn)
    
    inline def setIsContentElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isContentElementExists", value.toJsFn)
    
    inline def setIsTargetElementExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isTargetElementExists", value.toJsFn)
    
    inline def setMouseEnter(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseEnter", value.toJsFn)
    
    inline def setMouseLeave(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "mouseLeave", value.toJsFn)
  }
}
