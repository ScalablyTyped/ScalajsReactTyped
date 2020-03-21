package typingsJapgolly.amapJsApiTransfer.AMap.Transfer

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiTransfer.AnonInfo
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.complete
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.complete, SearchResult]
  var error: Event_[typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

