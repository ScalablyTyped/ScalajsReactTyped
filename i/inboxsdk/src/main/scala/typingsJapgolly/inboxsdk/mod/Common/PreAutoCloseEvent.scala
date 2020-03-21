package typingsJapgolly.inboxsdk.mod.Common

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.escape
import typingsJapgolly.inboxsdk.inboxsdkStrings.outsideInteraction
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAutoCloseEvent extends js.Object {
  var cause: Event_
  var `type`: outsideInteraction | escape
  def cancel(): Unit
}

object PreAutoCloseEvent {
  @scala.inline
  def apply(cancel: Callback, cause: Event_, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAutoCloseEvent]
  }
}

