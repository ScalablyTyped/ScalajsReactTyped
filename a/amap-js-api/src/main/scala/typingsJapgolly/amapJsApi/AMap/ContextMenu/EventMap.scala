package typingsJapgolly.amapJsApi.AMap.ContextMenu

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApi.AnonTarget
import typingsJapgolly.amapJsApi.amapJsApiStrings.close
import typingsJapgolly.amapJsApi.amapJsApiStrings.items
import typingsJapgolly.amapJsApi.amapJsApiStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var close: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.close, AnonTarget[I]]
  var items: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.items, js.UndefOr[scala.Nothing]]
  var open: Event_[typingsJapgolly.amapJsApi.amapJsApiStrings.open, AnonTarget[I]]
}

object EventMap {
  @scala.inline
  def apply[I](
    close: Event_[close, AnonTarget[I]],
    items: Event_[items, js.UndefOr[scala.Nothing]],
    open: Event_[open, AnonTarget[I]]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

