package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileSource extends StObject {
  
  /**
    * Gets the specified bounding box of the of the tile source.
    * @returns The specified bounding box of the of the tile source.
    */
  def getBounds(): LocationRect
  
  /**
    * Gets the pixel height of each tile in the tile source.
    * @returns The pixel height of each tile in the tile source.
    */
  def getHeight(): Double
  
  /**
    * Gets the maximum zoom level specified for the tile source.
    * @returns The maximum zoom level specified for the tile source.
    */
  def getMaxZoom(): Double
  
  /**
    * Gets the minimum zoom level specified for the tile source.
    * @returns The minimum zoom level specified for the tile source.
    */
  def getMinZoom(): Double
  
  /**
    * Gets a string that constructs tile URLs used to retrieve tiles for the tile layer.
    * @returns A string that constructs tile URLs used to retrieve tiles for the tile layer.
    */
  def getUriConstructor(): String | (js.Function1[/* tile */ PyramidTileId, String])
  
  /**
    * Gets the pixel width of each tile in the tile source.
    * @returns The pixel width of each tile in the tile source.
    */
  def getWidth(): Double
}
object TileSource {
  
  inline def apply(
    getBounds: CallbackTo[LocationRect],
    getHeight: CallbackTo[Double],
    getMaxZoom: CallbackTo[Double],
    getMinZoom: CallbackTo[Double],
    getUriConstructor: CallbackTo[String | (js.Function1[/* tile */ PyramidTileId, String])],
    getWidth: CallbackTo[Double]
  ): TileSource = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, getHeight = getHeight.toJsFn, getMaxZoom = getMaxZoom.toJsFn, getMinZoom = getMinZoom.toJsFn, getUriConstructor = getUriConstructor.toJsFn, getWidth = getWidth.toJsFn)
    __obj.asInstanceOf[TileSource]
  }
  
  extension [Self <: TileSource](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[LocationRect]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetMaxZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxZoom", value.toJsFn)
    
    inline def setGetMinZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMinZoom", value.toJsFn)
    
    inline def setGetUriConstructor(value: CallbackTo[String | (js.Function1[/* tile */ PyramidTileId, String])]): Self = StObject.set(x, "getUriConstructor", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
