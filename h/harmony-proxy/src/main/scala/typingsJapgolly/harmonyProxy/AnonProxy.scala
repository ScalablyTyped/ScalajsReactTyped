package typingsJapgolly.harmonyProxy

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProxy[T] extends js.Object {
  var proxy: T
  def revoke(): Unit
}

object AnonProxy {
  @scala.inline
  def apply[T](proxy: T, revoke: Callback): AnonProxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("revoke")(revoke.toJsFn)
    __obj.asInstanceOf[AnonProxy[T]]
  }
}

