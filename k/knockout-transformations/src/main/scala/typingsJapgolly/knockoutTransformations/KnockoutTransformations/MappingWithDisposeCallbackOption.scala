package typingsJapgolly.knockoutTransformations.KnockoutTransformations

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.knockoutTransformations.AnonDispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingWithDisposeCallbackOption[T, TResult] extends js.Object {
  def mappingWithDisposeCallback(value: T): AnonDispose[TResult]
}

object MappingWithDisposeCallbackOption {
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => CallbackTo[AnonDispose[TResult]]): MappingWithDisposeCallbackOption[T, TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mappingWithDisposeCallback")(js.Any.fromFunction1((t0: T) => mappingWithDisposeCallback(t0).runNow()))
    __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
  }
}

