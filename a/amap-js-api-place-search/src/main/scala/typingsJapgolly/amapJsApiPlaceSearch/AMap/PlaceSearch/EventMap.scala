package typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch

import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AMap.MapsEvent
import typingsJapgolly.amapJsApi.AMap.Marker
import typingsJapgolly.amapJsApiPlaceSearch.AnonData
import typingsJapgolly.amapJsApiPlaceSearch.AnonInfo
import typingsJapgolly.amapJsApiPlaceSearch.AnonLastSelected
import typingsJapgolly.amapJsApiPlaceSearch.AnonListElements
import typingsJapgolly.amapJsApiPlaceSearch.SelectChangeEventDataeven
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.click
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged
import typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, AnonInfo]
  var infoWindowClick: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
    SelectChangeEventDataeven
  ]
  var listElementClick: SelectChangeEvent[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
    MouseEvent
  ]
   // typo in source code
  var listElementDetroyed: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ]
  var markerClick: SelectChangeEvent[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ]
  var markerDestoryed: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ]
  // internal
  var renderComplete: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
    AnonListElements
  ]
  var selectChanged: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    AnonLastSelected
  ]
  var willClear: Event_[
    typingsJapgolly.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, 
    AnonData
  ]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, SearchResult],
    error: Event_[error, AnonInfo],
    infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
    renderComplete: Event_[renderComplete, AnonListElements],
    selectChanged: Event_[selectChanged, AnonLastSelected],
    willClear: Event_[willClear, AnonData]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

