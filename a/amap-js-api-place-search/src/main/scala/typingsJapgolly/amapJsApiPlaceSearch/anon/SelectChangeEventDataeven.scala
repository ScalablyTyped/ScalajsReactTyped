package typingsJapgolly.amapJsApiPlaceSearch.anon

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.amapJsApi.AMap.InfoWindow
import typingsJapgolly.amapJsApi.AMap.Marker
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.Poi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api-place-search.AMap.PlaceSearch.SelectChangeEventData & {  event :std.MouseEvent,   infoWindow :amap-js-api.AMap.InfoWindow<any>,   infoWindowContentDom :std.HTMLDivElement} */
trait SelectChangeEventDataeven extends StObject {
  
  /**
    * 当前选中的POI的信息
    */
  var data: js.Array[Poi]
  
  var event: MouseEvent
  
  /**
    * 当前选中的POI的ID
    */
  var id: String
  
  /**
    * 索引
    */
  var index: Double
  
  var infoWindow: InfoWindow[Any]
  
  var infoWindowContentDom: HTMLDivElement
  
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement
  
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[Any]
}
object SelectChangeEventDataeven {
  
  inline def apply(
    data: js.Array[Poi],
    event: MouseEvent,
    id: String,
    index: Double,
    infoWindow: InfoWindow[Any],
    infoWindowContentDom: HTMLDivElement,
    listElement: HTMLLIElement,
    marker: Marker[Any]
  ): SelectChangeEventDataeven = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectChangeEventDataeven]
  }
  
  extension [Self <: SelectChangeEventDataeven](x: Self) {
    
    inline def setData(value: js.Array[Poi]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Poi*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInfoWindow(value: InfoWindow[Any]): Self = StObject.set(x, "infoWindow", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowContentDom(value: HTMLDivElement): Self = StObject.set(x, "infoWindowContentDom", value.asInstanceOf[js.Any])
    
    inline def setListElement(value: HTMLLIElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: Marker[Any]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
