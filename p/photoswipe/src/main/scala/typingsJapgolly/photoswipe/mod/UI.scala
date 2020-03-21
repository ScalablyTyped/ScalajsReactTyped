package typingsJapgolly.photoswipe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UI[T /* <: Options */] extends js.Object {
  /**
    * Called by PhotoSwipe after it constructs the UI.
    */
  def init(): Unit
}

object UI {
  @scala.inline
  def apply[T /* <: Options */](init: Callback): UI[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.asInstanceOf[UI[T]]
  }
}

