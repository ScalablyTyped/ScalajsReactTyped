package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callout extends StObject {
  
  /** Adds a link to the actions panel in the bottom part of the callout window */
  def addAction(action: CalloutAction): Unit
  
  /** Adds event handler to the callout.
    @param eventName one of the following: "opened", "opening", "closing", "closed" */
  def addEventCallback(eventName: String, callback: js.Function1[/* callout */ this.type, Unit]): Unit
  
  /** Hide the callout. Animation can be used only for IE9+ */
  def close(useAnimation: Boolean): Unit
  
  /** Do not call this directly. Instead, use CalloutManager.remove */
  def destroy(): Unit
  
  /** Returns the callout actions menu */
  def getActionMenu(): CalloutActionMenu
  
  /** Returns the beak orientation defined for the callout during its creation. */
  def getBeakOrientation(): String
  
  /** Returns the bounding element defined for the callout during its creation. */
  def getBoundingBox(): HTMLElement
  
  /** Returns the contents of the callout. */
  def getContent(): String
  
  /** Returns the content element of the callout. */
  def getContentElement(): HTMLElement
  
  /** Returns the content width defined for the callout during its creation. */
  def getContentWidth(): Double
  
  /** Returns the ID of the callout. */
  def getID(): String
  
  /** Returns the launch point element of the callout. */
  def getLaunchPoint(): HTMLElement
  
  /** Returns the object that represents open behaivor defined for the callout during its creation. */
  def getOpenOptions(): CalloutOpenOptions
  
  /** Returns the position algorithm function defined for the callout during its creation. */
  def getPositionAlgorithm(): Any
  
  /** Returns the title of the callout. */
  def getTitle(): String
  
  /** Specifies wherever callout is in "Closed" state */
  def isClosed(): Boolean
  
  /** Specifies wherever callout is in "Closing" state */
  def isClosing(): Boolean
  
  /** Specifies wherever callout is in "Opened" state */
  def isOpen(): Boolean
  
  /** Specifies wherever callout is in "Opened" or "Opening" state */
  def isOpenOrOpening(): Boolean
  
  /** Specifies wherever callout is in "Opening" state */
  def isOpening(): Boolean
  
  /** Display the callout. Animation can be used only for IE9+ */
  def open(useAnimation: Boolean): Unit
  
  /** Re-renders the actions menu. Call after the actions menu is changed. */
  def refreshActions(): Unit
  
  /** Sets options for the callout. Not all options can be changed for the callout after its creation. */
  def set(options: CalloutOptions): Any
  
  /** Display if hidden, hide if shown. */
  def toggle(): Unit
}
object Callout {
  
  inline def apply(
    addAction: CalloutAction => Callback,
    addEventCallback: (String, js.Function1[Callout, Unit]) => Callback,
    close: Boolean => Callback,
    destroy: Callback,
    getActionMenu: CallbackTo[CalloutActionMenu],
    getBeakOrientation: CallbackTo[String],
    getBoundingBox: CallbackTo[HTMLElement],
    getContent: CallbackTo[String],
    getContentElement: CallbackTo[HTMLElement],
    getContentWidth: CallbackTo[Double],
    getID: CallbackTo[String],
    getLaunchPoint: CallbackTo[HTMLElement],
    getOpenOptions: CallbackTo[CalloutOpenOptions],
    getPositionAlgorithm: CallbackTo[Any],
    getTitle: CallbackTo[String],
    isClosed: CallbackTo[Boolean],
    isClosing: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    isOpenOrOpening: CallbackTo[Boolean],
    isOpening: CallbackTo[Boolean],
    open: Boolean => Callback,
    refreshActions: Callback,
    set: CalloutOptions => Any,
    toggle: Callback
  ): Callout = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1((t0: CalloutAction) => addAction(t0).runNow()), addEventCallback = js.Any.fromFunction2((t0: String, t1: js.Function1[Callout, Unit]) => (addEventCallback(t0, t1)).runNow()), close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()), destroy = destroy.toJsFn, getActionMenu = getActionMenu.toJsFn, getBeakOrientation = getBeakOrientation.toJsFn, getBoundingBox = getBoundingBox.toJsFn, getContent = getContent.toJsFn, getContentElement = getContentElement.toJsFn, getContentWidth = getContentWidth.toJsFn, getID = getID.toJsFn, getLaunchPoint = getLaunchPoint.toJsFn, getOpenOptions = getOpenOptions.toJsFn, getPositionAlgorithm = getPositionAlgorithm.toJsFn, getTitle = getTitle.toJsFn, isClosed = isClosed.toJsFn, isClosing = isClosing.toJsFn, isOpen = isOpen.toJsFn, isOpenOrOpening = isOpenOrOpening.toJsFn, isOpening = isOpening.toJsFn, open = js.Any.fromFunction1((t0: Boolean) => open(t0).runNow()), refreshActions = refreshActions.toJsFn, set = js.Any.fromFunction1(set), toggle = toggle.toJsFn)
    __obj.asInstanceOf[Callout]
  }
  
  extension [Self <: Callout](x: Self) {
    
    inline def setAddAction(value: CalloutAction => Callback): Self = StObject.set(x, "addAction", js.Any.fromFunction1((t0: CalloutAction) => value(t0).runNow()))
    
    inline def setAddEventCallback(value: (String, js.Function1[Callout, Unit]) => Callback): Self = StObject.set(x, "addEventCallback", js.Any.fromFunction2((t0: String, t1: js.Function1[Callout, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setClose(value: Boolean => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetActionMenu(value: CallbackTo[CalloutActionMenu]): Self = StObject.set(x, "getActionMenu", value.toJsFn)
    
    inline def setGetBeakOrientation(value: CallbackTo[String]): Self = StObject.set(x, "getBeakOrientation", value.toJsFn)
    
    inline def setGetBoundingBox(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getBoundingBox", value.toJsFn)
    
    inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetContentElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContentElement", value.toJsFn)
    
    inline def setGetContentWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getContentWidth", value.toJsFn)
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetLaunchPoint(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getLaunchPoint", value.toJsFn)
    
    inline def setGetOpenOptions(value: CallbackTo[CalloutOpenOptions]): Self = StObject.set(x, "getOpenOptions", value.toJsFn)
    
    inline def setGetPositionAlgorithm(value: CallbackTo[Any]): Self = StObject.set(x, "getPositionAlgorithm", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
    
    inline def setIsClosing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosing", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setIsOpenOrOpening(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpenOrOpening", value.toJsFn)
    
    inline def setIsOpening(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpening", value.toJsFn)
    
    inline def setOpen(value: Boolean => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setRefreshActions(value: Callback): Self = StObject.set(x, "refreshActions", value.toJsFn)
    
    inline def setSet(value: CalloutOptions => Any): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
