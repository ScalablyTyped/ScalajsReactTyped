package typingsJapgolly.typedRestClient.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(response: IHttpClientResponse): Boolean
  def handleAuthentication(httpClient: IHttpClient, requestInfo: IRequestInfo, objs: js.Any): js.Promise[IHttpClientResponse]
  def prepareRequest(options: RequestOptions): Unit
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpClientResponse => CallbackTo[Boolean],
    handleAuthentication: (IHttpClient, IRequestInfo, js.Any) => CallbackTo[js.Promise[IHttpClientResponse]],
    prepareRequest: RequestOptions => Callback
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canHandleAuthentication")(js.Any.fromFunction1((t0: typingsJapgolly.typedRestClient.interfacesMod.IHttpClientResponse) => canHandleAuthentication(t0).runNow()))
    __obj.updateDynamic("handleAuthentication")(js.Any.fromFunction3((t0: typingsJapgolly.typedRestClient.interfacesMod.IHttpClient, t1: typingsJapgolly.typedRestClient.interfacesMod.IRequestInfo, t2: js.Any) => handleAuthentication(t0, t1, t2).runNow()))
    __obj.updateDynamic("prepareRequest")(js.Any.fromFunction1((t0: typingsJapgolly.node.httpMod.RequestOptions) => prepareRequest(t0).runNow()))
    __obj.asInstanceOf[IRequestHandler]
  }
}

