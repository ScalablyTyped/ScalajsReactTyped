package typingsJapgolly.pkijs.signerInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerInfo extends js.Object {
  var digestAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var sid: js.Any
  var signature: OctetString
  var signatureAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var signedAttrs: js.UndefOr[typingsJapgolly.pkijs.signedAndUnsignedAttributesMod.default] = js.undefined
  var unsignedAttrs: js.UndefOr[typingsJapgolly.pkijs.signedAndUnsignedAttributesMod.default] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SignerInfo {
  @scala.inline
  def apply(
    digestAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Callback,
    sid: js.Any,
    signature: OctetString,
    signatureAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    signedAttrs: typingsJapgolly.pkijs.signedAndUnsignedAttributesMod.default = null,
    unsignedAttrs: typingsJapgolly.pkijs.signedAndUnsignedAttributesMod.default = null
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (signedAttrs != null) __obj.updateDynamic("signedAttrs")(signedAttrs.asInstanceOf[js.Any])
    if (unsignedAttrs != null) __obj.updateDynamic("unsignedAttrs")(unsignedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerInfo]
  }
}

