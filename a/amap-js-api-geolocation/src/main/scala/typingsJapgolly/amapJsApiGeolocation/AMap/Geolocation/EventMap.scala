package typingsJapgolly.amapJsApiGeolocation.AMap.Geolocation

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete
import typingsJapgolly.amapJsApiGeolocation.amapJsApiGeolocationStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiGeolocation.amapJsApiGeolocationStrings.complete, 
    GeolocationResult
  ]
  var error: Event_[
    typingsJapgolly.amapJsApiGeolocation.amapJsApiGeolocationStrings.error, 
    ErrorStatus
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, GeolocationResult], error: Event_[error, ErrorStatus]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

