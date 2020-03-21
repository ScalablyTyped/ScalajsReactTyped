package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLLoseContext extends js.Object {
  def loseContext(): Unit
  def restoreContext(): Unit
}

object WEBGLLoseContext {
  @scala.inline
  def apply(loseContext: Callback, restoreContext: Callback): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loseContext")(loseContext.toJsFn)
    __obj.updateDynamic("restoreContext")(restoreContext.toJsFn)
    __obj.asInstanceOf[WEBGLLoseContext]
  }
}

