package typingsJapgolly.amapJsApiRiding.AMap.Riding

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiRiding.AnonInfo
import typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.complete
import typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.complete, SearchResult]
  var error: Event_[typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

