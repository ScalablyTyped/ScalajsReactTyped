package typingsJapgolly.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object defining the message input to be sent to the assistant if the user selects the corresponding option. */
trait DialogNodeOutputOptionsElementValue extends js.Object {
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
}

object DialogNodeOutputOptionsElementValue {
  @scala.inline
  def apply(input: MessageInput = null): DialogNodeOutputOptionsElementValue = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeOutputOptionsElementValue]
  }
}

