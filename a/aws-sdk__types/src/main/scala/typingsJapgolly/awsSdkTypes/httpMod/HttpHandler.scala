package typingsJapgolly.awsSdkTypes.httpMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHandler[StreamType, HttpOptionsType] extends js.Object {
  /**
    * Perform any necessary cleanup actions, such as closing any open
    * connections. Calling `destroy` should allow the host application to
    * immediately proceed with graceful termination.
    *
    * HttpHandlers should be considered unusable after `destroy` has been
    * called.
    */
  def destroy(): Unit
  /**
    * A function that takes an HTTP request and returns a promise for an HTTP
    * response.
    *
    * If a `StreamType` type parameter is supplied, both the request and the
    * response may have streaming bodies. In such implementations, the promise
    * returned should resolve as soon as headers are available, and the as-yet
    * uncollected stream should be set as the response's `body` property.
    */
  def handle(request: HttpRequest[StreamType], options: HttpHandlerOptions): js.Promise[HttpResponse[StreamType]]
}

object HttpHandler {
  @scala.inline
  def apply[StreamType, HttpOptionsType](
    destroy: Callback,
    handle: (HttpRequest[StreamType], HttpHandlerOptions) => CallbackTo[js.Promise[HttpResponse[StreamType]]]
  ): HttpHandler[StreamType, HttpOptionsType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("handle")(js.Any.fromFunction2((t0: typingsJapgolly.awsSdkTypes.httpMod.HttpRequest[StreamType], t1: typingsJapgolly.awsSdkTypes.httpMod.HttpHandlerOptions) => handle(t0, t1).runNow()))
    __obj.asInstanceOf[HttpHandler[StreamType, HttpOptionsType]]
  }
}

