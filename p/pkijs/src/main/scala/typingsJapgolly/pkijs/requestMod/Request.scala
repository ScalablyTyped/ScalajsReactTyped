package typingsJapgolly.pkijs.requestMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var reqCert: typingsJapgolly.pkijs.certIDMod.default
  var singleRequestExtensions: js.UndefOr[js.Array[typingsJapgolly.pkijs.extensionMod.default]] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Request {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    reqCert: typingsJapgolly.pkijs.certIDMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    singleRequestExtensions: js.Array[typingsJapgolly.pkijs.extensionMod.default] = null
  ): Request = {
    val __obj = js.Dynamic.literal(reqCert = reqCert.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (singleRequestExtensions != null) __obj.updateDynamic("singleRequestExtensions")(singleRequestExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

