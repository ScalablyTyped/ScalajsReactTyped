package typingsJapgolly.nodeValidator.ValidatorOptions

import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeValidator.ValidatorOptions.IsStringOptions
  - typingsJapgolly.nodeValidator.ValidatorOptions.IsNumberOptions
  - typingsJapgolly.nodeValidator.ValidatorOptions.IsDateOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def IsStringOptions(message: String = null, regex: js.RegExp = null): Options = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def IsNumberOptions(max: Number = null, min: Number = null): Options = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def IsDateOptions(format: String = null, message: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

