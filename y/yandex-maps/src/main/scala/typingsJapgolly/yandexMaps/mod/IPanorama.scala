package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanorama extends StObject {
  
  def getAngularBBox(): js.Array[Double]
  
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow]
  
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker]
  
  def getCoordSystem(): ICoordSystem
  
  def getDefaultDirection(): js.Array[Double]
  
  def getDefaultSpan(): js.Array[Double]
  
  def getGraph(): IPanoramaGraph | Null
  
  def getMarkers(): js.Array[IPanoramaMarker]
  
  def getName(): String
  
  def getPosition(): js.Array[Double]
  
  def getTileLevels(): js.Array[IPanoramaTileLevel]
  
  def getTileSize(): js.Array[Double]
}
object IPanorama {
  
  inline def apply(
    getAngularBBox: CallbackTo[js.Array[Double]],
    getConnectionArrows: CallbackTo[js.Array[IPanoramaConnectionArrow]],
    getConnectionMarkers: CallbackTo[js.Array[IPanoramaConnectionMarker]],
    getCoordSystem: CallbackTo[ICoordSystem],
    getDefaultDirection: CallbackTo[js.Array[Double]],
    getDefaultSpan: CallbackTo[js.Array[Double]],
    getGraph: CallbackTo[IPanoramaGraph | Null],
    getMarkers: CallbackTo[js.Array[IPanoramaMarker]],
    getName: CallbackTo[String],
    getPosition: CallbackTo[js.Array[Double]],
    getTileLevels: CallbackTo[js.Array[IPanoramaTileLevel]],
    getTileSize: CallbackTo[js.Array[Double]]
  ): IPanorama = {
    val __obj = js.Dynamic.literal(getAngularBBox = getAngularBBox.toJsFn, getConnectionArrows = getConnectionArrows.toJsFn, getConnectionMarkers = getConnectionMarkers.toJsFn, getCoordSystem = getCoordSystem.toJsFn, getDefaultDirection = getDefaultDirection.toJsFn, getDefaultSpan = getDefaultSpan.toJsFn, getGraph = getGraph.toJsFn, getMarkers = getMarkers.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getTileLevels = getTileLevels.toJsFn, getTileSize = getTileSize.toJsFn)
    __obj.asInstanceOf[IPanorama]
  }
  
  extension [Self <: IPanorama](x: Self) {
    
    inline def setGetAngularBBox(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getAngularBBox", value.toJsFn)
    
    inline def setGetConnectionArrows(value: CallbackTo[js.Array[IPanoramaConnectionArrow]]): Self = StObject.set(x, "getConnectionArrows", value.toJsFn)
    
    inline def setGetConnectionMarkers(value: CallbackTo[js.Array[IPanoramaConnectionMarker]]): Self = StObject.set(x, "getConnectionMarkers", value.toJsFn)
    
    inline def setGetCoordSystem(value: CallbackTo[ICoordSystem]): Self = StObject.set(x, "getCoordSystem", value.toJsFn)
    
    inline def setGetDefaultDirection(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getDefaultDirection", value.toJsFn)
    
    inline def setGetDefaultSpan(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getDefaultSpan", value.toJsFn)
    
    inline def setGetGraph(value: CallbackTo[IPanoramaGraph | Null]): Self = StObject.set(x, "getGraph", value.toJsFn)
    
    inline def setGetMarkers(value: CallbackTo[js.Array[IPanoramaMarker]]): Self = StObject.set(x, "getMarkers", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetTileLevels(value: CallbackTo[js.Array[IPanoramaTileLevel]]): Self = StObject.set(x, "getTileLevels", value.toJsFn)
    
    inline def setGetTileSize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getTileSize", value.toJsFn)
  }
}
