package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononSidePanelComponent extends js.Object {
  def close(): Unit
  def open(): Unit
}

object PhononSidePanelComponent {
  @scala.inline
  def apply(close: Callback, open: Callback): PhononSidePanelComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.asInstanceOf[PhononSidePanelComponent]
  }
}

