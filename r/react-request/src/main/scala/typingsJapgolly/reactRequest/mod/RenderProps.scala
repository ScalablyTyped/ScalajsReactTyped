package typingsJapgolly.reactRequest.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps[T] extends FetchResponse[T] {
  var doFetch: DoFetch[T]
  var fetching: Boolean
  var requestName: String
}

object RenderProps {
  @scala.inline
  def apply[T](
    didUnmount: Boolean,
    doFetch: /* options */ js.UndefOr[DoFetchOptions] => CallbackTo[js.Promise[FetchResponse[T]]],
    failed: Boolean,
    fetching: Boolean,
    init: js.Any,
    requestKey: String,
    requestName: String,
    url: String,
    data: T = null,
    error: js.Error = null,
    response: Response = null
  ): RenderProps[T] = {
    val __obj = js.Dynamic.literal(didUnmount = didUnmount.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], fetching = fetching.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], requestKey = requestKey.asInstanceOf[js.Any], requestName = requestName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("doFetch")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.reactRequest.mod.DoFetchOptions]) => doFetch(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps[T]]
  }
}

