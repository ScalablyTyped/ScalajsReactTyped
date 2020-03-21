package typingsJapgolly.pkijs.otherPrimeInfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import typingsJapgolly.pkijs.JsonOtherPrimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPrimeInfo extends js.Object {
  var coefficient: Integer
  var exponent: Integer
  var prime: Integer
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: JsonOtherPrimeInfo): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherPrimeInfo {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent: Integer,
    fromJSON: JsonOtherPrimeInfo => Callback,
    fromSchema: js.Any => Callback,
    prime: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.JsonOtherPrimeInfo) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OtherPrimeInfo]
  }
}

