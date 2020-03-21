package typingsJapgolly.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeFlow extends js.Object {
  /**
    * A message relevant to the code flow.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the code flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of one or more unique threadFlow objects, each of which describes the progress of a program through a
    * thread of execution.
    */
  var threadFlows: js.Array[ThreadFlow]
}

object CodeFlow {
  @scala.inline
  def apply(threadFlows: js.Array[ThreadFlow], message: Message = null, properties: PropertyBag = null): CodeFlow = {
    val __obj = js.Dynamic.literal(threadFlows = threadFlows.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFlow]
  }
}

