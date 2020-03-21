package typingsJapgolly.storybookAddonKnobs.colorMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorType
  extends Component[ColorTypeProps, ColorTypeState, js.Any] {
  var popover: HTMLDivElement = js.native
  @JSName("componentDidMount")
  def componentDidMount_MColorType(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorType(): Unit = js.native
  def handleChange(color: ColorResult): Unit = js.native
  def handleClick(): Unit = js.native
  def handleWindowMouseDown(e: MouseEvent): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MColorType(nextProps: ColorTypeProps, nextState: ColorTypeState): Boolean = js.native
}

