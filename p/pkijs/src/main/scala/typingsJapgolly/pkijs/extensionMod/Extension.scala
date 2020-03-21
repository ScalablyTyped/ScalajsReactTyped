package typingsJapgolly.pkijs.extensionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var critical: Boolean
  var extnID: String
  var extnValue: OctetString
  var parsedValue: js.UndefOr[js.Any] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Extension {
  @scala.inline
  def apply(
    critical: Boolean,
    extnID: String,
    extnValue: OctetString,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    parsedValue: js.Any = null
  ): Extension = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], extnID = extnID.asInstanceOf[js.Any], extnValue = extnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (parsedValue != null) __obj.updateDynamic("parsedValue")(parsedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
}

