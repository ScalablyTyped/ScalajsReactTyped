package typingsJapgolly.pkijs.issuerAndSerialNumberMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerAndSerialNumber extends js.Object {
  var issuer: typingsJapgolly.pkijs.relativeDistinguishedNamesMod.default
  var serialNumber: Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuerAndSerialNumber {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    issuer: typingsJapgolly.pkijs.relativeDistinguishedNamesMod.default,
    serialNumber: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): IssuerAndSerialNumber = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[IssuerAndSerialNumber]
  }
}

