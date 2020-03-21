package typingsJapgolly.eventKit.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisposableLike extends js.Object {
  def dispose(): Unit
}

object DisposableLike {
  @scala.inline
  def apply(dispose: Callback): DisposableLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[DisposableLike]
  }
}

