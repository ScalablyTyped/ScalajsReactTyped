package typingsJapgolly.pkijs.digestInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestInfo extends js.Object {
  var digest: OctetString
  var digestAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DigestInfo {
  @scala.inline
  def apply(
    digest: OctetString,
    digestAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): DigestInfo = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[DigestInfo]
  }
}

