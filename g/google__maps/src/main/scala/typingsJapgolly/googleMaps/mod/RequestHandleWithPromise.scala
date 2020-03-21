package typingsJapgolly.googleMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestHandleWithPromise[T] extends RequestHandle[T] {
  /**
    * Returns the response as a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise).
    * This method is only available if you supplied the `Promise` constructor to the `createClient()` method when you constructed
    * the client object.
    */
  def asPromise(): js.Promise[ClientResponse[T]]
}

object RequestHandleWithPromise {
  @scala.inline
  def apply[T](
    asPromise: CallbackTo[js.Promise[ClientResponse[T]]],
    cancel: Callback,
    `finally`: js.Function0[Unit] => CallbackTo[RequestHandle[T]]
  ): RequestHandleWithPromise[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asPromise")(asPromise.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("finally")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => `finally`(t0).runNow()))
    __obj.asInstanceOf[RequestHandleWithPromise[T]]
  }
}

