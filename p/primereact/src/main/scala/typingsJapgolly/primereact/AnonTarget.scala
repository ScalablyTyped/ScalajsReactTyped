package typingsJapgolly.primereact

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var direction: String
  var originalEvent: Event_
  var source: js.Array[_]
  var target: js.Array[_]
}

object AnonTarget {
  @scala.inline
  def apply(direction: String, originalEvent: Event_, source: js.Array[_], target: js.Array[_]): AnonTarget = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTarget]
  }
}

