package typingsJapgolly.amapJsApiDriving.AMap.Driving

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiDriving.AnonInfo
import typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.complete
import typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.complete, 
    SearchResult | AnonInfo
  ]
  var error: Event_[typingsJapgolly.amapJsApiDriving.amapJsApiDrivingStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult | AnonInfo], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

