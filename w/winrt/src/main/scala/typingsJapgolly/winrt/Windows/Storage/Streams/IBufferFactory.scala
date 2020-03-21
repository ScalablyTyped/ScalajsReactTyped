package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferFactory extends js.Object {
  def create(capacity: Double): Buffer
}

object IBufferFactory {
  @scala.inline
  def apply(create: Double => CallbackTo[Buffer]): IBufferFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: scala.Double) => create(t0).runNow()))
    __obj.asInstanceOf[IBufferFactory]
  }
}

