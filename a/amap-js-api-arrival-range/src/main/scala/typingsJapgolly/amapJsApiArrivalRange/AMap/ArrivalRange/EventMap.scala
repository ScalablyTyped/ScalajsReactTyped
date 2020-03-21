package typingsJapgolly.amapJsApiArrivalRange.AMap.ArrivalRange

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiArrivalRange.AnonInfo
import typingsJapgolly.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event_[typingsJapgolly.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

