package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapType extends StObject {
  
  def getMaxZoom(): Double
  
  def getMinZoom(): Double
  
  def getName(): String
  
  def getProjection(): Projection
  
  def getTextColor(): String
  
  def getTileLayer(): TileLayer
  
  def getTips(): String
}
object MapType {
  
  inline def apply(
    getMaxZoom: CallbackTo[Double],
    getMinZoom: CallbackTo[Double],
    getName: CallbackTo[String],
    getProjection: CallbackTo[Projection],
    getTextColor: CallbackTo[String],
    getTileLayer: CallbackTo[TileLayer],
    getTips: CallbackTo[String]
  ): MapType = {
    val __obj = js.Dynamic.literal(getMaxZoom = getMaxZoom.toJsFn, getMinZoom = getMinZoom.toJsFn, getName = getName.toJsFn, getProjection = getProjection.toJsFn, getTextColor = getTextColor.toJsFn, getTileLayer = getTileLayer.toJsFn, getTips = getTips.toJsFn)
    __obj.asInstanceOf[MapType]
  }
  
  extension [Self <: MapType](x: Self) {
    
    inline def setGetMaxZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxZoom", value.toJsFn)
    
    inline def setGetMinZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMinZoom", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetProjection(value: CallbackTo[Projection]): Self = StObject.set(x, "getProjection", value.toJsFn)
    
    inline def setGetTextColor(value: CallbackTo[String]): Self = StObject.set(x, "getTextColor", value.toJsFn)
    
    inline def setGetTileLayer(value: CallbackTo[TileLayer]): Self = StObject.set(x, "getTileLayer", value.toJsFn)
    
    inline def setGetTips(value: CallbackTo[String]): Self = StObject.set(x, "getTips", value.toJsFn)
  }
}
