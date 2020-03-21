package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Splashscreen extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object Splashscreen {
  @scala.inline
  def apply(hide: Callback, show: Callback): Splashscreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Splashscreen]
  }
}

