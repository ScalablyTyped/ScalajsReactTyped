package typingsJapgolly.winrtUwp.Windows.Web.Http.Filters

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpProgress
import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpRequestMessage
import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface used to implement custom filters for an HttpClient instance. */
trait IHttpFilter extends IClosable {
  /**
    * Send an HTTP request on the IHttpFilter instance as an asynchronous operation.
    * @param request The HTTP request message to send.
    * @return The object representing the asynchronous operation.
    */
  def sendRequestAsync(request: HttpRequestMessage): IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]
}

object IHttpFilter {
  @scala.inline
  def apply(
    close: Callback,
    sendRequestAsync: HttpRequestMessage => CallbackTo[IPromiseWithIAsyncOperationWithProgress[HttpResponseMessage, HttpProgress]]
  ): IHttpFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("sendRequestAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Web.Http.HttpRequestMessage) => sendRequestAsync(t0).runNow()))
    __obj.asInstanceOf[IHttpFilter]
  }
}

