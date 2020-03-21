package typingsJapgolly.pkijs.certificateSetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSet extends js.Object {
  var certificates: js.Array[typingsJapgolly.pkijs.certificateMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificateSet {
  @scala.inline
  def apply(
    certificates: js.Array[typingsJapgolly.pkijs.certificateMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): CertificateSet = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[CertificateSet]
  }
}

