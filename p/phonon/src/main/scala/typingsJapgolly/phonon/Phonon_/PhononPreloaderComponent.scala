package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPreloaderComponent extends js.Object {
  def hide(): Unit
  def show(): Unit
}

object PhononPreloaderComponent {
  @scala.inline
  def apply(hide: Callback, show: Callback): PhononPreloaderComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[PhononPreloaderComponent]
  }
}

