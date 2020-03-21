package typingsJapgolly.openfin.mod.fin

import typingsJapgolly.openfin.openfinStrings.`hide-on-close`
import typingsJapgolly.openfin.openfinStrings.hidden
import typingsJapgolly.openfin.openfinStrings.hide
import typingsJapgolly.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowHiddenEvent extends WindowBaseEvent {
  /**
    * What action prompted the close.
    * The reasons are: "hide", "hide-on-close"
    */
  var reason: hide | `hide-on-close`
  @JSName("type")
  var type_WindowHiddenEvent: hidden
}

object WindowHiddenEvent {
  @scala.inline
  def apply(name: String, reason: hide | `hide-on-close`, topic: window, `type`: hidden, uuid: String): WindowHiddenEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent]
  }
}

