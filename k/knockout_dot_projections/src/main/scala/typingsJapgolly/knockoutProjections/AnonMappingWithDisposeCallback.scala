package typingsJapgolly.knockoutProjections

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMappingWithDisposeCallback[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): AnonDispose[TResult]
}

object AnonMappingWithDisposeCallback {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => CallbackTo[AnonDispose[TResult]]): AnonMappingWithDisposeCallback[T, TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappingWithDisposeCallback")(js.Any.fromFunction1((t0: T) => mappingWithDisposeCallback(t0).runNow()))
    __obj.asInstanceOf[AnonMappingWithDisposeCallback[T, TResult]]
  }
}

