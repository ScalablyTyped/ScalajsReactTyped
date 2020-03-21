package typingsJapgolly.pkijs.authorityKeyIdentifierMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorityKeyIdentifier extends js.Object {
  var authorityCertIssuer: js.Array[typingsJapgolly.pkijs.accessDescriptionMod.default]
  var authorityCertSerialNumber: Integer
  var keyIdentifier: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AuthorityKeyIdentifier {
  @scala.inline
  def apply(
    authorityCertIssuer: js.Array[typingsJapgolly.pkijs.accessDescriptionMod.default],
    authorityCertSerialNumber: Integer,
    fromSchema: js.Any => Callback,
    keyIdentifier: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer.asInstanceOf[js.Any], authorityCertSerialNumber = authorityCertSerialNumber.asInstanceOf[js.Any], keyIdentifier = keyIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
}

