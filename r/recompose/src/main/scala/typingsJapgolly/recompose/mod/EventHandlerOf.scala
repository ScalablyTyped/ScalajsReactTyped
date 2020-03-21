package typingsJapgolly.recompose.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// createEventHandler: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEventHandler
trait EventHandlerOf[T, TSubs /* <: Subscribable[T] */] extends js.Object {
  var stream: TSubs
  def handler(value: T): Unit
}

object EventHandlerOf {
  @scala.inline
  def apply[T, TSubs /* <: Subscribable[T] */](handler: T => Callback, stream: TSubs): EventHandlerOf[T, TSubs] = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: T) => handler(t0).runNow()))
    __obj.asInstanceOf[EventHandlerOf[T, TSubs]]
  }
}

