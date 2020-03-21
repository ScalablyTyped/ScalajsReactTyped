package typingsJapgolly.pkijs.privateKeyInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[typingsJapgolly.pkijs.attributeMod.default]] = js.undefined
  var parsedKey: js.UndefOr[
    typingsJapgolly.pkijs.ecprivatekeyMod.default | typingsJapgolly.pkijs.rsaprivatekeyMod.default
  ] = js.undefined
  var privateKey: OctetString
  var privateKeyAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var version: Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PrivateKeyInfo {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    privateKey: OctetString,
    privateKeyAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    attributes: js.Array[typingsJapgolly.pkijs.attributeMod.default] = null,
    parsedKey: typingsJapgolly.pkijs.ecprivatekeyMod.default | typingsJapgolly.pkijs.rsaprivatekeyMod.default = null
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
}

