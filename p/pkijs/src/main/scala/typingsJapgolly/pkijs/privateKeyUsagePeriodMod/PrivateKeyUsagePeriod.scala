package typingsJapgolly.pkijs.privateKeyUsagePeriodMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyUsagePeriod extends js.Object {
  var notAfter: js.UndefOr[js.Date] = js.undefined
  var notBefore: js.UndefOr[js.Date] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PrivateKeyUsagePeriod {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    notAfter: js.Date = null,
    notBefore: js.Date = null
  ): PrivateKeyUsagePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyUsagePeriod]
  }
}

