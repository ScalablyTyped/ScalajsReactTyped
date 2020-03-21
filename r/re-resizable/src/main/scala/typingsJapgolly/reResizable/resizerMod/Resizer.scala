package typingsJapgolly.reResizable.resizerMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-resizable/lib/resizer", "Resizer")
@js.native
class Resizer ()
  extends Component[Props, js.Object, js.Any] {
  def onMouseDown(e: ReactMouseEventFrom[HTMLDivElement]): Unit = js.native
  def onTouchStart(e: ReactTouchEventFrom[HTMLDivElement]): Unit = js.native
}

