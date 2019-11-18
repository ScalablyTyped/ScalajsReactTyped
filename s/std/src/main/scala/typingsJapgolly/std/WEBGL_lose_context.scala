package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGL_lose_context extends js.Object {
  def loseContext(): Unit
  def restoreContext(): Unit
}

object WEBGL_lose_context {
  @scala.inline
  def apply(loseContext: Callback, restoreContext: Callback): WEBGL_lose_context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loseContext")(loseContext.toJsFn)
    __obj.updateDynamic("restoreContext")(restoreContext.toJsFn)
    __obj.asInstanceOf[WEBGL_lose_context]
  }
}

