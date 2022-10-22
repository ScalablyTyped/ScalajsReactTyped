package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
trait MarkerClusterer
  extends StObject
     with EventBindable {
  
  /**
    * 添加一个需进行聚合的点标记
    * @param marker
    */
  def addMarker(marker: Marker): Unit
  
  /**
    * 添加一组需进行聚合的点标记
    */
  def addMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 从地图上彻底清除所有聚合点标记
    */
  def clearMarkers(): Unit
  
  /**
    * 获取聚合点的总数量
    */
  def getClustersCount(): Double
  
  /**
    * 获取聚合网格的像素大小
    */
  def getGridSize(): Double
  
  /**
    * 获取该点聚合的地图对象
    */
  def getMap(): Map
  
  /**
    * 获取该点聚合中的点标记集合
    */
  def getMarkers(): js.Array[Marker]
  
  /**
    * 获取地图中点标记的最大聚合级别
    */
  def getMaxZoom(): Double
  
  /**
    * 获取单个聚合的最小数量
    */
  def getMinClusterSize(): Double
  
  /**
    * 获取聚合的样式风格集合
    */
  def getStyles(): js.Array[Any]
  
  /**
    * 获取单个聚合点位置是否是聚合内所有标记的平均中心
    */
  def isAverageCenter(): Boolean
  
  /**
    * 删除一个聚合的点标记
    * @param marker 点标记
    */
  def removeMarker(marker: Marker): Unit
  
  /**
    * 删除一组聚合的点标记
    * @param markers
    */
  def removeMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 设置单个聚合点位置是否是聚合内所有标记的平均中心
    * @param averageCenter
    */
  def setAverageCenter(averageCenter: Boolean): Unit
  
  /**
    * 设置聚合网格的像素大小
    * @param size
    */
  def setGridSize(size: Double): Unit
  
  /**
    * 设置将进行点聚合的地图对象
    * @param map
    */
  def setMap(map: Map): Unit
  
  /**
    * 设置将进行点聚合显示的点标记集合
    * @param markers
    */
  def setMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 设置地图中点标记的最大聚合级别
    * @param zoom
    */
  def setMaxZoom(zoom: Double): Unit
  
  /**
    * 设置单个聚合的最小数量
    * @param size
    */
  def setMinClusterSize(size: Double): Unit
  
  /**
    * 设置聚合的样式风格
    * @param styles
    */
  def setStyles(styles: js.Array[Any]): Unit
}
object MarkerClusterer {
  
  inline def apply(
    addMarker: Marker => Callback,
    addMarkers: js.Array[Marker] => Callback,
    clearMarkers: Callback,
    getClustersCount: CallbackTo[Double],
    getGridSize: CallbackTo[Double],
    getMap: CallbackTo[Map],
    getMarkers: CallbackTo[js.Array[Marker]],
    getMaxZoom: CallbackTo[Double],
    getMinClusterSize: CallbackTo[Double],
    getStyles: CallbackTo[js.Array[Any]],
    isAverageCenter: CallbackTo[Boolean],
    off: (String, EventCallback) => Callback,
    on: (String, EventCallback) => Callback,
    removeMarker: Marker => Callback,
    removeMarkers: js.Array[Marker] => Callback,
    setAverageCenter: Boolean => Callback,
    setGridSize: Double => Callback,
    setMap: Map => Callback,
    setMarkers: js.Array[Marker] => Callback,
    setMaxZoom: Double => Callback,
    setMinClusterSize: Double => Callback,
    setStyles: js.Array[Any] => Callback
  ): MarkerClusterer = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1((t0: Marker) => addMarker(t0).runNow()), addMarkers = js.Any.fromFunction1((t0: js.Array[Marker]) => addMarkers(t0).runNow()), clearMarkers = clearMarkers.toJsFn, getClustersCount = getClustersCount.toJsFn, getGridSize = getGridSize.toJsFn, getMap = getMap.toJsFn, getMarkers = getMarkers.toJsFn, getMaxZoom = getMaxZoom.toJsFn, getMinClusterSize = getMinClusterSize.toJsFn, getStyles = getStyles.toJsFn, isAverageCenter = isAverageCenter.toJsFn, off = js.Any.fromFunction2((t0: String, t1: EventCallback) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: EventCallback) => (on(t0, t1)).runNow()), removeMarker = js.Any.fromFunction1((t0: Marker) => removeMarker(t0).runNow()), removeMarkers = js.Any.fromFunction1((t0: js.Array[Marker]) => removeMarkers(t0).runNow()), setAverageCenter = js.Any.fromFunction1((t0: Boolean) => setAverageCenter(t0).runNow()), setGridSize = js.Any.fromFunction1((t0: Double) => setGridSize(t0).runNow()), setMap = js.Any.fromFunction1((t0: Map) => setMap(t0).runNow()), setMarkers = js.Any.fromFunction1((t0: js.Array[Marker]) => setMarkers(t0).runNow()), setMaxZoom = js.Any.fromFunction1((t0: Double) => setMaxZoom(t0).runNow()), setMinClusterSize = js.Any.fromFunction1((t0: Double) => setMinClusterSize(t0).runNow()), setStyles = js.Any.fromFunction1((t0: js.Array[Any]) => setStyles(t0).runNow()))
    __obj.asInstanceOf[MarkerClusterer]
  }
  
  extension [Self <: MarkerClusterer](x: Self) {
    
    inline def setAddMarker(value: Marker => Callback): Self = StObject.set(x, "addMarker", js.Any.fromFunction1((t0: Marker) => value(t0).runNow()))
    
    inline def setAddMarkers(value: js.Array[Marker] => Callback): Self = StObject.set(x, "addMarkers", js.Any.fromFunction1((t0: js.Array[Marker]) => value(t0).runNow()))
    
    inline def setClearMarkers(value: Callback): Self = StObject.set(x, "clearMarkers", value.toJsFn)
    
    inline def setGetClustersCount(value: CallbackTo[Double]): Self = StObject.set(x, "getClustersCount", value.toJsFn)
    
    inline def setGetGridSize(value: CallbackTo[Double]): Self = StObject.set(x, "getGridSize", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[Map]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetMarkers(value: CallbackTo[js.Array[Marker]]): Self = StObject.set(x, "getMarkers", value.toJsFn)
    
    inline def setGetMaxZoom(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxZoom", value.toJsFn)
    
    inline def setGetMinClusterSize(value: CallbackTo[Double]): Self = StObject.set(x, "getMinClusterSize", value.toJsFn)
    
    inline def setGetStyles(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getStyles", value.toJsFn)
    
    inline def setIsAverageCenter(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAverageCenter", value.toJsFn)
    
    inline def setRemoveMarker(value: Marker => Callback): Self = StObject.set(x, "removeMarker", js.Any.fromFunction1((t0: Marker) => value(t0).runNow()))
    
    inline def setRemoveMarkers(value: js.Array[Marker] => Callback): Self = StObject.set(x, "removeMarkers", js.Any.fromFunction1((t0: js.Array[Marker]) => value(t0).runNow()))
    
    inline def setSetAverageCenter(value: Boolean => Callback): Self = StObject.set(x, "setAverageCenter", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetGridSize(value: Double => Callback): Self = StObject.set(x, "setGridSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMap(value: Map => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
    
    inline def setSetMarkers(value: js.Array[Marker] => Callback): Self = StObject.set(x, "setMarkers", js.Any.fromFunction1((t0: js.Array[Marker]) => value(t0).runNow()))
    
    inline def setSetMaxZoom(value: Double => Callback): Self = StObject.set(x, "setMaxZoom", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinClusterSize(value: Double => Callback): Self = StObject.set(x, "setMinClusterSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStyles(value: js.Array[Any] => Callback): Self = StObject.set(x, "setStyles", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
  }
}
