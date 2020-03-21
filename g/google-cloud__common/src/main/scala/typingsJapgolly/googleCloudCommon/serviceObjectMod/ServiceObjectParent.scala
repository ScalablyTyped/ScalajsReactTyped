package typingsJapgolly.googleCloudCommon.serviceObjectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleCloudCommon.utilMod.BodyResponseCallback
import typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.teenyRequest.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectParent extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
  def requestStream(reqOpts: DecorateRequestOptions): Request
}

object ServiceObjectParent {
  @scala.inline
  def apply(
    request: (DecorateRequestOptions, BodyResponseCallback) => Callback,
    requestStream: DecorateRequestOptions => CallbackTo[Request],
    Promise: PromiseConstructor = null
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction2((t0: typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions, t1: typingsJapgolly.googleCloudCommon.utilMod.BodyResponseCallback) => request(t0, t1).runNow()))
    __obj.updateDynamic("requestStream")(js.Any.fromFunction1((t0: typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions) => requestStream(t0).runNow()))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObjectParent]
  }
}

