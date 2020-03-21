package typingsJapgolly.hapiJoi.mod

import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorReport extends Error {
  var code: String
  var flags: Record[String, ExtensionFlag]
  var messages: LanguageMessages
  var path: js.Array[String]
  var prefs: ErrorValidationOptions
  var state: State
  var value: js.Any
}

object ErrorReport {
  @scala.inline
  def apply(
    code: String,
    flags: Record[String, ExtensionFlag],
    message: String,
    messages: LanguageMessages,
    name: String,
    path: js.Array[String],
    prefs: ErrorValidationOptions,
    state: State,
    value: js.Any,
    stack: String = null
  ): ErrorReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prefs = prefs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReport]
  }
}

