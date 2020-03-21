package typingsJapgolly.pkijs.encryptedContentInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedContentInfo extends js.Object {
  var contentEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var eContentType: String
  var encryptedContent: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedContentInfo {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    eContentType: String,
    encryptedContent: OctetString,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], eContentType = eContentType.asInstanceOf[js.Any], encryptedContent = encryptedContent.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[EncryptedContentInfo]
  }
}

