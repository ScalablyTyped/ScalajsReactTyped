package typingsJapgolly.pkijs.rsaprivatekeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.JsonWebKey
import typingsJapgolly.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAPrivateKey extends js.Object {
  var coefficient: Integer
  var exponent1: Integer
  var exponent2: Integer
  var modulus: Integer
  var otherPrimeInfos: js.UndefOr[js.Array[typingsJapgolly.pkijs.otherPrimeInfoMod.default]] = js.undefined
  var prime1: Integer
  var prime2: Integer
  var privateExponent: Integer
  var publicExponent: Integer
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

object RSAPrivateKey {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent1: Integer,
    exponent2: Integer,
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    modulus: Integer,
    prime1: Integer,
    prime2: Integer,
    privateExponent: Integer,
    publicExponent: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    otherPrimeInfos: js.Array[typingsJapgolly.pkijs.otherPrimeInfoMod.default] = null
  ): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (otherPrimeInfos != null) __obj.updateDynamic("otherPrimeInfos")(otherPrimeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
}

