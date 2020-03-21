package typingsJapgolly.pkijs.signatureMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var certs: js.UndefOr[js.Array[typingsJapgolly.pkijs.certificateMod.default]] = js.undefined
  var signature: BitString
  var signatureAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Signature {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    signature: BitString,
    signatureAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    certs: js.Array[typingsJapgolly.pkijs.certificateMod.default] = null
  ): Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (certs != null) __obj.updateDynamic("certs")(certs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
}

