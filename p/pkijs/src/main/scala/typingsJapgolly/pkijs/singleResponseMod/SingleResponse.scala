package typingsJapgolly.pkijs.singleResponseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResponse extends js.Object {
  var certID: typingsJapgolly.pkijs.certIDMod.default
  var certStatus: js.Any
  var nextUpdate: js.UndefOr[js.Date] = js.undefined
  var singleExtensions: js.Array[typingsJapgolly.pkijs.extensionMod.default]
  var thisUpdate: js.Date
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object SingleResponse {
  @scala.inline
  def apply(
    certID: typingsJapgolly.pkijs.certIDMod.default,
    certStatus: js.Any,
    fromSchema: js.Any => Callback,
    singleExtensions: js.Array[typingsJapgolly.pkijs.extensionMod.default],
    thisUpdate: js.Date,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    nextUpdate: js.Date = null
  ): SingleResponse = {
    val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], singleExtensions = singleExtensions.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (nextUpdate != null) __obj.updateDynamic("nextUpdate")(nextUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
}

