package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPanelComponent extends js.Object {
  def close(): Unit
  def open(): Unit
}

object PhononPanelComponent {
  @scala.inline
  def apply(close: Callback, open: Callback): PhononPanelComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.asInstanceOf[PhononPanelComponent]
  }
}

