package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControl extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object MapControl {
  @scala.inline
  def apply(hide: Callback, show: Callback): MapControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[MapControl]
  }
}

