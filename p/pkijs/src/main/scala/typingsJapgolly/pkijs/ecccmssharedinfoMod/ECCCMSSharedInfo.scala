package typingsJapgolly.pkijs.ecccmssharedinfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import typingsJapgolly.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[OctetString] = js.undefined
  var keyInfo: AlgorithmIdentifier
  var suppPubInfo: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECCCMSSharedInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    keyInfo: AlgorithmIdentifier,
    suppPubInfo: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    entityUInfo: OctetString = null
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (entityUInfo != null) __obj.updateDynamic("entityUInfo")(entityUInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
}

