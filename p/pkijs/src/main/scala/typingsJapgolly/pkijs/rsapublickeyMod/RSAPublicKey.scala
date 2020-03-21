package typingsJapgolly.pkijs.rsapublickeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPublicKey extends js.Object {
  var modulus: Integer
  var publicExponent: Integer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    modulus: Integer,
    publicExponent: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): RSAPublicKey = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RSAPublicKey]
  }
}

