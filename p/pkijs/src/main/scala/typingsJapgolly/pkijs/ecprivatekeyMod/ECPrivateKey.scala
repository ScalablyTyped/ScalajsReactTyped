package typingsJapgolly.pkijs.ecprivatekeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivateKey extends js.Object {
  var namedCurve: js.UndefOr[String] = js.undefined
  var privateKey: OctetString
  var publicKey: js.UndefOr[typingsJapgolly.pkijs.ecpublickeyMod.default] = js.undefined
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

object ECPrivateKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    privateKey: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    namedCurve: String = null,
    publicKey: typingsJapgolly.pkijs.ecpublickeyMod.default = null
  ): ECPrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (namedCurve != null) __obj.updateDynamic("namedCurve")(namedCurve.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPrivateKey]
  }
}

