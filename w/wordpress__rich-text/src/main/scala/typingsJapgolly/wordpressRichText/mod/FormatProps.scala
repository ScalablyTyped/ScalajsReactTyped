package typingsJapgolly.wordpressRichText.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatProps extends js.Object {
  var activeAttributes: Record[String, String]
  var isActive: Boolean
  var value: Value
  def onChange(value: Value): Unit
}

object FormatProps {
  @scala.inline
  def apply(
    activeAttributes: Record[String, String],
    isActive: Boolean,
    onChange: Value => Callback,
    value: Value
  ): FormatProps = {
    val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.wordpressRichText.mod.Value) => onChange(t0).runNow()))
    __obj.asInstanceOf[FormatProps]
  }
}

