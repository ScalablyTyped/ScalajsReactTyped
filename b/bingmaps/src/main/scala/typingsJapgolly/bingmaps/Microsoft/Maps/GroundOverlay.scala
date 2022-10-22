package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A map overlay that binds an image to a bounding box area on the map.
  */
trait GroundOverlay
  extends StObject
     with CustomOverlay {
  
  /**
    * Gets the background color of the ground overlay.
    * @returns The background color of the ground overlay.
    */
  def getBackgroundColor(): String | Color
  
  /**
    * Gets the bounding box that the ground overlay is bounded to.
    * @returns The bounding box that the ground overlay is bounded to.
    */
  def getBounds(): LocationRect
  
  /**
    * Gets the url to the ground overlay image.
    * @returns The url to the ground overlay image.
    */
  def getImageUrl(): String
  
  /**
    * Gets the opacity of the ground overlay.
    * @returns The opacity of the ground overlay.
    */
  def getOpacity(): Double
  
  /**
    * Gets the rotation of the ground overlay.
    * @returns The rotation of the ground overlay.
    */
  def getRotation(): Double
  
  /**
    * Gets a boolean indicating if the ground overlay is visible or not.
    * @returns A boolean indicating if the ground overlay is visible or not.
    */
  def getVisible(): Boolean
  
  /** Optional property to store any additional metadata for this layer. */
  var metadata: Any
  
  /**
    * Sets the options used to render the ground overlay.
    * @param options The options used to render the ground overlay.
    */
  def setOptions(options: IGroundOverlayOptions): Unit
  
  /**
    * Sets the visibility of the Ground Overlay.
    * @param value A value indicating if the Ground Overlay should be displayed or not.
    */
  def setVisible(visible: Boolean): Unit
}
object GroundOverlay {
  
  inline def apply(
    _map: Map,
    getBackgroundColor: CallbackTo[String | Color],
    getBounds: CallbackTo[LocationRect],
    getHtmlElement: CallbackTo[HTMLElement],
    getImageUrl: CallbackTo[String],
    getMap: CallbackTo[Map],
    getOpacity: CallbackTo[Double],
    getRotation: CallbackTo[Double],
    getVisible: CallbackTo[Boolean],
    metadata: Any,
    onAdd: Callback,
    onLoad: Callback,
    onRemove: Callback,
    setHtmlElement: HTMLElement => Callback,
    setOptions: IGroundOverlayOptions => Callback,
    setVisible: Boolean => Callback
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], getBackgroundColor = getBackgroundColor.toJsFn, getBounds = getBounds.toJsFn, getHtmlElement = getHtmlElement.toJsFn, getImageUrl = getImageUrl.toJsFn, getMap = getMap.toJsFn, getOpacity = getOpacity.toJsFn, getRotation = getRotation.toJsFn, getVisible = getVisible.toJsFn, metadata = metadata.asInstanceOf[js.Any], onAdd = onAdd.toJsFn, onLoad = onLoad.toJsFn, onRemove = onRemove.toJsFn, setHtmlElement = js.Any.fromFunction1((t0: HTMLElement) => setHtmlElement(t0).runNow()), setOptions = js.Any.fromFunction1((t0: IGroundOverlayOptions) => setOptions(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[GroundOverlay]
  }
  
  extension [Self <: GroundOverlay](x: Self) {
    
    inline def setGetBackgroundColor(value: CallbackTo[String | Color]): Self = StObject.set(x, "getBackgroundColor", value.toJsFn)
    
    inline def setGetBounds(value: CallbackTo[LocationRect]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
    
    inline def setGetOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getOpacity", value.toJsFn)
    
    inline def setGetRotation(value: CallbackTo[Double]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSetOptions(value: IGroundOverlayOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IGroundOverlayOptions) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
