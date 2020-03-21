package typingsJapgolly.amapJsApiCitySearch.AMap.CitySearch

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiCitySearch.AnonInfo
import typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
import typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsJapgolly.amapJsApiCitySearch.amapJsApiCitySearchStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

