package typingsJapgolly.rtlcss.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions extends js.Object {
  /**
    * The function to be called after processing the CSS.
    */
  def post(): Unit
  /**
    * The function to be called before processing the CSS.
    */
  def pre(): Unit
}

object HookOptions {
  @scala.inline
  def apply(post: Callback, pre: Callback): HookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("post")(post.toJsFn)
    __obj.updateDynamic("pre")(pre.toJsFn)
    __obj.asInstanceOf[HookOptions]
  }
}

