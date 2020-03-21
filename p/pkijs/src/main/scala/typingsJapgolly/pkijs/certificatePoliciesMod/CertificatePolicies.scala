package typingsJapgolly.pkijs.certificatePoliciesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificatePolicies extends js.Object {
  var certificatePolicies: js.Array[typingsJapgolly.pkijs.policyInformationMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertificatePolicies {
  @scala.inline
  def apply(
    certificatePolicies: js.Array[typingsJapgolly.pkijs.policyInformationMod.default],
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): CertificatePolicies = {
    val __obj = js.Dynamic.literal(certificatePolicies = certificatePolicies.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[CertificatePolicies]
  }
}

