package typingsJapgolly.pkijs.ecpublickeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPublicKey extends js.Object {
  var namedCurve: String
  var x: scala.scalajs.js.typedarray.ArrayBuffer
  var y: scala.scalajs.js.typedarray.ArrayBuffer
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ECPublicKey {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Callback,
    fromSchema: js.Any => Callback,
    namedCurve: String,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    x: scala.scalajs.js.typedarray.ArrayBuffer,
    y: scala.scalajs.js.typedarray.ArrayBuffer
  ): ECPublicKey = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: org.scalajs.dom.crypto.JsonWebKey) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[ECPublicKey]
  }
}

