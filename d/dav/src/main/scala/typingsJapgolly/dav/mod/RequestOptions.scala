package typingsJapgolly.dav.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Request> */
trait RequestOptions extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* error */ js.Error, _]] = js.undefined
  var requestData: js.UndefOr[String] = js.undefined
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.undefined
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    constructor: /* options */ js.UndefOr[RequestOptions] => CallbackTo[js.Any] = null,
    method: String = null,
    onerror: /* error */ js.Error => CallbackTo[js.Any] = null,
    requestData: String = null,
    transformRequest: /* xhr */ js.Any => CallbackTo[js.Any] = null,
    transformResponse: /* xhr */ js.Any => CallbackTo[js.Any] = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.dav.mod.RequestOptions]) => constructor(t0).runNow()))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* error */ js.Error) => onerror(t0).runNow()))
    if (requestData != null) __obj.updateDynamic("requestData")(requestData.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1((t0: /* xhr */ js.Any) => transformRequest(t0).runNow()))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction1((t0: /* xhr */ js.Any) => transformResponse(t0).runNow()))
    __obj.asInstanceOf[RequestOptions]
  }
}

