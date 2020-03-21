package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitOffcanvasElement extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object UIkitOffcanvasElement {
  @scala.inline
  def apply(hide: Callback, show: Callback): UIkitOffcanvasElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[UIkitOffcanvasElement]
  }
}

