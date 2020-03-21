package typingsJapgolly.amapJsApiPlaceSearch

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.amapJsApi.AMap.InfoWindow
import typingsJapgolly.amapJsApi.AMap.Marker
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.Poi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-place-search.AMap.PlaceSearch.SelectChangeEventData & {  event  :std.MouseEvent,   infoWindow  :amap-js-api.AMap.InfoWindow<any>,   infoWindowContentDom  :std.HTMLDivElement} */
trait SelectChangeEventDataeven extends js.Object {
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
  var infoWindow: InfoWindow[_]
  var infoWindowContentDom: HTMLDivElement
  /**
    * 当前选中的POI在结果面板中对应的列表项
    */
  var listElement: HTMLLIElement
  /**
    * 当前选中的POI对应的在地图中的Marker对象
    */
  var marker: Marker[_]
}

object SelectChangeEventDataeven {
  @scala.inline
  def apply(
    data: js.Array[Poi],
    event: MouseEvent,
    id: String,
    index: Double,
    infoWindow: InfoWindow[_],
    infoWindowContentDom: HTMLDivElement,
    listElement: HTMLLIElement,
    marker: Marker[_]
  ): SelectChangeEventDataeven = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], infoWindow = infoWindow.asInstanceOf[js.Any], infoWindowContentDom = infoWindowContentDom.asInstanceOf[js.Any], listElement = listElement.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectChangeEventDataeven]
  }
}

