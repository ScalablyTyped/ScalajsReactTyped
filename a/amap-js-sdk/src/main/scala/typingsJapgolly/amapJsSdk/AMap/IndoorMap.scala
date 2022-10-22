package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndoorMap extends StObject {
  
  def getOpacity(): Double
  
  def getSelectedBuilding(): String
  
  def getSelectedBuildingId(): String
  
  def hide(): Unit
  
  def hideFloorBar(): Unit
  
  def hideLabels(): Unit
  
  def setMap(map: Map): Unit
  
  def setOpacity(alpha: Double): Unit
  
  def setzIndex(): Unit
  
  def show(): Unit
  
  def showFloor(floor: Double, noMove: Boolean): Unit
  
  def showFloorBar(): Unit
  
  def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit
  
  def showLabels(): Unit
}
object IndoorMap {
  
  inline def apply(
    getOpacity: CallbackTo[Double],
    getSelectedBuilding: CallbackTo[String],
    getSelectedBuildingId: CallbackTo[String],
    hide: Callback,
    hideFloorBar: Callback,
    hideLabels: Callback,
    setMap: Map => Callback,
    setOpacity: Double => Callback,
    setzIndex: Callback,
    show: Callback,
    showFloor: (Double, Boolean) => Callback,
    showFloorBar: Callback,
    showIndoorMap: (String, Double, String) => Callback,
    showLabels: Callback
  ): IndoorMap = {
    val __obj = js.Dynamic.literal(getOpacity = getOpacity.toJsFn, getSelectedBuilding = getSelectedBuilding.toJsFn, getSelectedBuildingId = getSelectedBuildingId.toJsFn, hide = hide.toJsFn, hideFloorBar = hideFloorBar.toJsFn, hideLabels = hideLabels.toJsFn, setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setzIndex = setzIndex.toJsFn, show = show.toJsFn, showFloor = js.Any.fromFunction2((t0: Double, t1: Boolean) => (showFloor(t0, t1)).runNow()), showFloorBar = showFloorBar.toJsFn, showIndoorMap = js.Any.fromFunction3((t0: String, t1: Double, t2: String) => (showIndoorMap(t0, t1, t2)).runNow()), showLabels = showLabels.toJsFn)
    __obj.asInstanceOf[IndoorMap]
  }
  
  extension [Self <: IndoorMap](x: Self) {
    
    inline def setGetOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getOpacity", value.toJsFn)
    
    inline def setGetSelectedBuilding(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedBuilding", value.toJsFn)
    
    inline def setGetSelectedBuildingId(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedBuildingId", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setHideFloorBar(value: Callback): Self = StObject.set(x, "hideFloorBar", value.toJsFn)
    
    inline def setHideLabels(value: Callback): Self = StObject.set(x, "hideLabels", value.toJsFn)
    
    inline def setSetMap(value: Map => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
    
    inline def setSetOpacity(value: Double => Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetzIndex(value: Callback): Self = StObject.set(x, "setzIndex", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setShowFloor(value: (Double, Boolean) => Callback): Self = StObject.set(x, "showFloor", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShowFloorBar(value: Callback): Self = StObject.set(x, "showFloorBar", value.toJsFn)
    
    inline def setShowIndoorMap(value: (String, Double, String) => Callback): Self = StObject.set(x, "showIndoorMap", js.Any.fromFunction3((t0: String, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setShowLabels(value: Callback): Self = StObject.set(x, "showLabels", value.toJsFn)
  }
}
