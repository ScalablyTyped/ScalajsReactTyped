package typingsJapgolly.amapJsApiPlaceSearch

import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEvent
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastSelected extends js.Object {
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ])
}

object AnonLastSelected {
  @scala.inline
  def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]),
    lastSelected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]) = null
  ): AnonLastSelected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    if (lastSelected != null) __obj.updateDynamic("lastSelected")(lastSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastSelected]
  }
}

