package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayer
  extends StObject
     with ILayer {
  
  /**
    * Gets the opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    * @returns The opacity of the tile layer, defined as a double between 0 (not visible) and 1.
    */
  def getOpacity(): Double
  
  /**
    * Gets the tile source of the tile layer.
    * @returns The tile source of the tile layer.
    */
  def getTileSource(): TileSource
  
  /**
    * Gets a boolean that indicates if the tile layer is visible or not.
    * @returns A boolean that indicates if the tile layer is visible or not.
    */
  def getVisible(): Boolean
  
  /**
    * Gets the zIndex of the tile layer.
    * @returns The zIndex of the tile layer.
    */
  def getZIndex(): Double
  
  /** Optional property to store any additional metadata for this layer. */
  var metadata: Any
  
  /**
    * Sets the opacity of the tile layer. Value must be a number between 0 and 1.
    * @param opacity The opacity of the tile layer. Value must be a number between 0 and 1.
    */
  def setOpacity(opacity: Double): Unit
  
  /**
    * Sets options for the tile layer.
    * @param options The options for the tile layer.
    */
  def setOptions(options: ITileLayerOptions): Unit
  
  /**
    * Sets the visibility of the tile layer.
    * @param show A boolean indicating if the tile layer should be visible or not.
    */
  def setVisible(show: Boolean): Unit
  
  /**
    * Sets the zIndex of the tile layer.
    * @param idx The zIndex of the tile layer.
    */
  def setZIndex(idx: Double): Unit
}
object TileLayer {
  
  inline def apply(
    getOpacity: CallbackTo[Double],
    getTileSource: CallbackTo[TileSource],
    getVisible: CallbackTo[Boolean],
    getZIndex: CallbackTo[Double],
    metadata: Any,
    setOpacity: Double => Callback,
    setOptions: ITileLayerOptions => Callback,
    setVisible: Boolean => Callback,
    setZIndex: Double => Callback
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getOpacity = getOpacity.toJsFn, getTileSource = getTileSource.toJsFn, getVisible = getVisible.toJsFn, getZIndex = getZIndex.toJsFn, metadata = metadata.asInstanceOf[js.Any], setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOptions = js.Any.fromFunction1((t0: ITileLayerOptions) => setOptions(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZIndex = js.Any.fromFunction1((t0: Double) => setZIndex(t0).runNow()))
    __obj.asInstanceOf[TileLayer]
  }
  
  extension [Self <: TileLayer](x: Self) {
    
    inline def setGetOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getOpacity", value.toJsFn)
    
    inline def setGetTileSource(value: CallbackTo[TileSource]): Self = StObject.set(x, "getTileSource", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setGetZIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getZIndex", value.toJsFn)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSetOpacity(value: Double => Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOptions(value: ITileLayerOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: ITileLayerOptions) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetZIndex(value: Double => Callback): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
