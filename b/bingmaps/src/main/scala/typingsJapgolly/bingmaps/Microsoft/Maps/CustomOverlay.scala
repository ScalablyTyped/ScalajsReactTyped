package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOverlay
  extends StObject
     with ILayer {
  
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  var _map: Map
  
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  def getHtmlElement(): HTMLElement
  
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  def getMap(): Map
  
  /**
    * Implement this method to perform any task that should be done when the overlay is added to the map.
    */
  def onAdd(): Unit
  
  /**
    * Implement this method to perform any tasks that should be done when the overlay is removed from the map.
    */
  def onLoad(): Unit
  
  /**
    * Implement this methof to perform any task that should be done after the overlay has been added to the map.
    */
  def onRemove(): Unit
  
  /**
    * Updates the html element of this custom overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  def setHtmlElement(htmlElement: HTMLElement): Unit
}
object CustomOverlay {
  
  inline def apply(
    _map: Map,
    getHtmlElement: CallbackTo[HTMLElement],
    getMap: CallbackTo[Map],
    onAdd: Callback,
    onLoad: Callback,
    onRemove: Callback,
    setHtmlElement: HTMLElement => Callback
  ): CustomOverlay = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], getHtmlElement = getHtmlElement.toJsFn, getMap = getMap.toJsFn, onAdd = onAdd.toJsFn, onLoad = onLoad.toJsFn, onRemove = onRemove.toJsFn, setHtmlElement = js.Any.fromFunction1((t0: HTMLElement) => setHtmlElement(t0).runNow()))
    __obj.asInstanceOf[CustomOverlay]
  }
  
  extension [Self <: CustomOverlay](x: Self) {
    
    inline def setGetHtmlElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getHtmlElement", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[Map]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setOnAdd(value: Callback): Self = StObject.set(x, "onAdd", value.toJsFn)
    
    inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
    
    inline def setSetHtmlElement(value: HTMLElement => Callback): Self = StObject.set(x, "setHtmlElement", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def set_map(value: Map): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
  }
}
