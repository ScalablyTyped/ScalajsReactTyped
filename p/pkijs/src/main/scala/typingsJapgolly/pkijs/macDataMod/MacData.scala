package typingsJapgolly.pkijs.macDataMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacData extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var mac: typingsJapgolly.pkijs.digestInfoMod.default
  var macSalt: OctetString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MacData {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    mac: typingsJapgolly.pkijs.digestInfoMod.default,
    macSalt: OctetString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    iterations: Int | Double = null
  ): MacData = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacData]
  }
}

