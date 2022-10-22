package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map.MapType
trait CanvasMapType
  extends StObject
     with MapType {
  
  def getMapTypeOptions(): CanvasMapTypeOptions
  
  def getMaxZoom(): Double
  
  def getMinZoom(): Double
  
  def getName(): String
  
  def getTileData(x: Double, y: Double, z: Double): ImageData
  
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit
}
object CanvasMapType {
  
  inline def apply(
    getMapTypeOptions: CallbackTo[CanvasMapTypeOptions],
    getMaxZoom: CallbackTo[Double],
    getMinZoom: CallbackTo[Double],
    getName: CallbackTo[String],
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileData: (Double, Double, Double) => ImageData,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: CanvasMapTypeOptions => Callback,
    tileSize: Size
  ): CanvasMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = getMapTypeOptions.toJsFn, getMaxZoom = getMaxZoom.toJsFn, getMinZoom = getMinZoom.toJsFn, getName = getName.toJsFn, getTile = js.Any.fromFunction3(getTile), getTileData = js.Any.fromFunction3(getTileData), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1((t0: CanvasMapTypeOptions) => setMapTypeOptions(t0).runNow()), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasMapType]
  }
  
  extension [Self <: CanvasMapType](x: Self) {
    
    inline def setGetMapTypeOptions(value: CallbackTo[CanvasMapTypeOptions]): Self = StObject.set(x, "getMapTypeOptions", value.toJsFn)
    
    inline def setGetMaxZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxZoom", value.toJsFn)
    
    inline def setGetMinZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMinZoom", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetTileData(value: (Double, Double, Double) => ImageData): Self = StObject.set(x, "getTileData", js.Any.fromFunction3(value))
    
    inline def setSetMapTypeOptions(value: CanvasMapTypeOptions => Callback): Self = StObject.set(x, "setMapTypeOptions", js.Any.fromFunction1((t0: CanvasMapTypeOptions) => value(t0).runNow()))
  }
}
