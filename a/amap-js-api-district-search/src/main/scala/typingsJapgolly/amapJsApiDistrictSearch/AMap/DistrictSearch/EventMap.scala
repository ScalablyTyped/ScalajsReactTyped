package typingsJapgolly.amapJsApiDistrictSearch.AMap.DistrictSearch

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiDistrictSearch.AnonInfo
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
import typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[
    typingsJapgolly.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error, 
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

