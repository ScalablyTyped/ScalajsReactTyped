package typingsJapgolly.when.When

import typingsJapgolly.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectedDescriptor
  extends Descriptor[js.Any]
     with Snapshot[js.Any] {
  var reason: js.Any
  var state: rejected
}

object RejectedDescriptor {
  @scala.inline
  def apply(reason: js.Any, state: rejected): RejectedDescriptor = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RejectedDescriptor]
  }
}

