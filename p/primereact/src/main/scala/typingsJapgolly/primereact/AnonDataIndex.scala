package typingsJapgolly.primereact

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataIndex extends js.Object {
  var data: js.Any
  var index: Double
  var originalEvent: Event_
}

object AnonDataIndex {
  @scala.inline
  def apply(data: js.Any, index: Double, originalEvent: Event_): AnonDataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataIndex]
  }
}

