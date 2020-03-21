package typingsJapgolly.pkijs.encryptedDataMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pkijs.AnonContentEncryptionAlgorithm
import typingsJapgolly.pkijs.AnonPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var encryptedContentInfo: typingsJapgolly.pkijs.encryptedContentInfoMod.default
  var unprotectedAttrs: js.Array[typingsJapgolly.pkijs.attributeMod.default]
  var version: Double
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: AnonPassword): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: AnonContentEncryptionAlgorithm): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EncryptedData {
  @scala.inline
  def apply(
    decrypt: AnonPassword => CallbackTo[js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]],
    encrypt: AnonContentEncryptionAlgorithm => CallbackTo[js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]],
    encryptedContentInfo: typingsJapgolly.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    unprotectedAttrs: js.Array[typingsJapgolly.pkijs.attributeMod.default],
    version: Double
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], unprotectedAttrs = unprotectedAttrs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.AnonPassword) => decrypt(t0).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.AnonContentEncryptionAlgorithm) => encrypt(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[EncryptedData]
  }
}

