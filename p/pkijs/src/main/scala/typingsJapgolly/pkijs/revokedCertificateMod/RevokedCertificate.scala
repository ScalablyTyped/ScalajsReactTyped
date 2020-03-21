package typingsJapgolly.pkijs.revokedCertificateMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokedCertificate extends js.Object {
  var crlEntryExtensions: typingsJapgolly.pkijs.extensionsMod.default
  var revocationDate: typingsJapgolly.pkijs.timeMod.default
  var userCertificate: Integer
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RevokedCertificate {
  @scala.inline
  def apply(
    crlEntryExtensions: typingsJapgolly.pkijs.extensionsMod.default,
    fromSchema: js.Any => Callback,
    revocationDate: typingsJapgolly.pkijs.timeMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    userCertificate: Integer
  ): RevokedCertificate = {
    val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions.asInstanceOf[js.Any], revocationDate = revocationDate.asInstanceOf[js.Any], userCertificate = userCertificate.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RevokedCertificate]
  }
}

