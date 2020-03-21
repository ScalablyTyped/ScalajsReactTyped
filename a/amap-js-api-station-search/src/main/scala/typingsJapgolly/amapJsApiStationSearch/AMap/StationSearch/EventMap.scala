package typingsJapgolly.amapJsApiStationSearch.AMap.StationSearch

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiStationSearch.AnonInfo
import typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
import typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[
    typingsJapgolly.amapJsApiStationSearch.amapJsApiStationSearchStrings.error, 
    AnonInfo
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

