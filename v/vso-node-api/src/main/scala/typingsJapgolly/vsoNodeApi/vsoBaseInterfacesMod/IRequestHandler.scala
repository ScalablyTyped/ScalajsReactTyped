package typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestHandler extends js.Object {
  def canHandleAuthentication(res: IHttpResponse): Boolean
  def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit
  def prepareRequest(options: js.Any): Unit
}

object IRequestHandler {
  @scala.inline
  def apply(
    canHandleAuthentication: IHttpResponse => CallbackTo[Boolean],
    handleAuthentication: (js.Any, js.Any, js.Any, js.Any, js.Any) => Callback,
    prepareRequest: js.Any => Callback
  ): IRequestHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canHandleAuthentication")(js.Any.fromFunction1((t0: typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IHttpResponse) => canHandleAuthentication(t0).runNow()))
    __obj.updateDynamic("handleAuthentication")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => handleAuthentication(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("prepareRequest")(js.Any.fromFunction1((t0: js.Any) => prepareRequest(t0).runNow()))
    __obj.asInstanceOf[IRequestHandler]
  }
}

