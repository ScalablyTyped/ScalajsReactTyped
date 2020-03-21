package typingsJapgolly.pkijs.pkistatusinfoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.BitString
import typingsJapgolly.asn1js.mod.Utf8String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKIStatusInfo extends js.Object {
  var failInfo: js.UndefOr[BitString] = js.undefined
  var status: Double
  var statusStrings: js.UndefOr[Utf8String] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PKIStatusInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    status: Double,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    failInfo: BitString = null,
    statusStrings: Utf8String = null
  ): PKIStatusInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (failInfo != null) __obj.updateDynamic("failInfo")(failInfo.asInstanceOf[js.Any])
    if (statusStrings != null) __obj.updateDynamic("statusStrings")(statusStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKIStatusInfo]
  }
}

