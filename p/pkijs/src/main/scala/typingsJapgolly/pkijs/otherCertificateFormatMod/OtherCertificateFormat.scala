package typingsJapgolly.pkijs.otherCertificateFormatMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherCertificateFormat extends js.Object {
  var otherCert: js.Any
  var otherCertFormat: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherCertificateFormat {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    otherCert: js.Any,
    otherCertFormat: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OtherCertificateFormat = {
    val __obj = js.Dynamic.literal(otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OtherCertificateFormat]
  }
}

