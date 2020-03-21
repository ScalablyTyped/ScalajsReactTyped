package typingsJapgolly.googleCloudCommon.serviceObjectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleCloudCommon.utilMod.DecorateRequestOptions
import typingsJapgolly.teenyRequest.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def request(opts: Options): DecorateRequestOptions
}

object Interceptor {
  @scala.inline
  def apply(request: Options => CallbackTo[DecorateRequestOptions]): Interceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: typingsJapgolly.teenyRequest.mod.Options) => request(t0).runNow()))
    __obj.asInstanceOf[Interceptor]
  }
}

