package typingsJapgolly.navermaps.naver.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMapType
  extends StObject
     with MapType {
  
  def getMapTypeOptions(): ImageMapTypeOptions
  
  def getMaxZoom(): Double
  
  def getMinZoom(): Double
  
  def getName(): String
  
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String]
  
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit
}
object ImageMapType {
  
  inline def apply(
    getMapTypeOptions: CallbackTo[ImageMapTypeOptions],
    getMaxZoom: CallbackTo[Double],
    getMinZoom: CallbackTo[Double],
    getName: CallbackTo[String],
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileUrls: (Double, Double, Double) => js.Array[String],
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: ImageMapTypeOptions => Callback,
    tileSize: Size
  ): ImageMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = getMapTypeOptions.toJsFn, getMaxZoom = getMaxZoom.toJsFn, getMinZoom = getMinZoom.toJsFn, getName = getName.toJsFn, getTile = js.Any.fromFunction3(getTile), getTileUrls = js.Any.fromFunction3(getTileUrls), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1((t0: ImageMapTypeOptions) => setMapTypeOptions(t0).runNow()), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapType]
  }
  
  extension [Self <: ImageMapType](x: Self) {
    
    inline def setGetMapTypeOptions(value: CallbackTo[ImageMapTypeOptions]): Self = StObject.set(x, "getMapTypeOptions", value.toJsFn)
    
    inline def setGetMaxZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxZoom", value.toJsFn)
    
    inline def setGetMinZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMinZoom", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetTileUrls(value: (Double, Double, Double) => js.Array[String]): Self = StObject.set(x, "getTileUrls", js.Any.fromFunction3(value))
    
    inline def setSetMapTypeOptions(value: ImageMapTypeOptions => Callback): Self = StObject.set(x, "setMapTypeOptions", js.Any.fromFunction1((t0: ImageMapTypeOptions) => value(t0).runNow()))
  }
}
