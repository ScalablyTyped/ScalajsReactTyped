package typingsJapgolly.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  var cancel: Boolean
  var `type`: String
}

object BaseEvent {
  @scala.inline
  def apply(cancel: Boolean, `type`: String): BaseEvent = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
}

