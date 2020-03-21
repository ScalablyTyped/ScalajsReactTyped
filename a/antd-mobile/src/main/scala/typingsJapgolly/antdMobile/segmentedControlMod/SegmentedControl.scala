package typingsJapgolly.antdMobile.segmentedControlMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControl
  extends Component[SegmentedControlProps, js.Any, js.Any] {
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSegmentedControl(nextProps: SegmentedControlProps): Unit = js.native
  def onClick(e: ReactMouseEventFrom[HTMLDivElement], index: js.Any, value: js.Any): Unit = js.native
  def renderSegmentItem(idx: Double, value: String, selected: Boolean): Element = js.native
}

