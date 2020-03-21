package typingsJapgolly.pkijs.publicKeyInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInfo extends js.Object {
  var algorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var parsedKey: js.UndefOr[
    typingsJapgolly.pkijs.ecpublickeyMod.default | typingsJapgolly.pkijs.rsapublickeyMod.default
  ] = js.undefined
  var subjectPublicKey: BitString
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def importKey(publicKey: CryptoKey): js.Thenable[Unit]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PublicKeyInfo {
  @scala.inline
  def apply(
    algorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    importKey: CryptoKey => CallbackTo[js.Thenable[Unit]],
    subjectPublicKey: BitString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    parsedKey: typingsJapgolly.pkijs.ecpublickeyMod.default | typingsJapgolly.pkijs.rsapublickeyMod.default = null
  ): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("importKey")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.CryptoKey) => importKey(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfo]
  }
}

