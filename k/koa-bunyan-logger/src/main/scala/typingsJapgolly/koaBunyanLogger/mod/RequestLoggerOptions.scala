package typingsJapgolly.koaBunyanLogger.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var durationField: js.UndefOr[String] = js.undefined
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.undefined
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.undefined
  var ignorePath: js.UndefOr[js.Array[String]] = js.undefined
  var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ js.Error, String]] = js.undefined
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.undefined
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.undefined
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(
    durationField: String = null,
    formatRequestMessage: /* requestData */ RequestData => CallbackTo[String] = null,
    formatResponseMessage: /* responseData */ ResponseData => CallbackTo[String] = null,
    ignorePath: js.Array[String] = null,
    levelFn: (/* status */ Double, /* err */ js.Error) => CallbackTo[String] = null,
    updateLogFields: /* data */ RequestData => CallbackTo[RequestData] = null,
    updateRequestLogFields: /* requestData */ RequestData => CallbackTo[RequestData] = null,
    updateResponseLogFields: /* responseData */ ResponseData => CallbackTo[ResponseData] = null
  ): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (durationField != null) __obj.updateDynamic("durationField")(durationField.asInstanceOf[js.Any])
    if (formatRequestMessage != null) __obj.updateDynamic("formatRequestMessage")(js.Any.fromFunction1((t0: /* requestData */ typingsJapgolly.koaBunyanLogger.mod.RequestData) => formatRequestMessage(t0).runNow()))
    if (formatResponseMessage != null) __obj.updateDynamic("formatResponseMessage")(js.Any.fromFunction1((t0: /* responseData */ typingsJapgolly.koaBunyanLogger.mod.ResponseData) => formatResponseMessage(t0).runNow()))
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (levelFn != null) __obj.updateDynamic("levelFn")(js.Any.fromFunction2((t0: /* status */ scala.Double, t1: /* err */ js.Error) => levelFn(t0, t1).runNow()))
    if (updateLogFields != null) __obj.updateDynamic("updateLogFields")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.koaBunyanLogger.mod.RequestData) => updateLogFields(t0).runNow()))
    if (updateRequestLogFields != null) __obj.updateDynamic("updateRequestLogFields")(js.Any.fromFunction1((t0: /* requestData */ typingsJapgolly.koaBunyanLogger.mod.RequestData) => updateRequestLogFields(t0).runNow()))
    if (updateResponseLogFields != null) __obj.updateDynamic("updateResponseLogFields")(js.Any.fromFunction1((t0: /* responseData */ typingsJapgolly.koaBunyanLogger.mod.ResponseData) => updateResponseLogFields(t0).runNow()))
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

