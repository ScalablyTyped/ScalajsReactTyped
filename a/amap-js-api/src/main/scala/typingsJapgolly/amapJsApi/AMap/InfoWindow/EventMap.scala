package typingsJapgolly.amapJsApi.AMap.InfoWindow

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AnonTarget
import typingsJapgolly.amapJsApi.amapJsApiStrings.change
import typingsJapgolly.amapJsApi.amapJsApiStrings.close
import typingsJapgolly.amapJsApi.amapJsApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var change: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.change, AnonTarget[I]]
  var close: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.close, AnonTarget[I]]
  var open: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.open, AnonTarget[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, AnonTarget[I]],
    close: Event_[close, AnonTarget[I]],
    open: Event_[open, AnonTarget[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

