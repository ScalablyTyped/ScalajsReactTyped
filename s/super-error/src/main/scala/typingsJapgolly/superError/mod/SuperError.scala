package typingsJapgolly.superError.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperError
  extends Error
     with /* k */ StringDictionary[js.Any] {
  def causedBy(err: js.Error): this.type
}

object SuperError {
  @scala.inline
  def apply(
    causedBy: js.Error => CallbackTo[SuperError],
    message: String,
    name: String,
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    stack: String = null
  ): SuperError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("causedBy")(js.Any.fromFunction1((t0: js.Error) => causedBy(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperError]
  }
}

