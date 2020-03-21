package typingsJapgolly.baseui.datepickerMod

import typingsJapgolly.baseui.AnonDate
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.mouseOver
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveLeft
import typingsJapgolly.baseui.baseuiStrings.moveRight
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps[CalendarProps | DatepickerProps], ContainerState, js.Any] {
  @JSName("internalSetState")
  def internalSetState_change(`type`: change_, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseLeave(`type`: mouseLeave, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_mouseOver(`type`: mouseOver, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveDown(`type`: moveDown, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveLeft(`type`: moveLeft, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveRight(`type`: moveRight, changes: ContainerState): Unit = js.native
  @JSName("internalSetState")
  def internalSetState_moveUp(`type`: moveUp, changes: ContainerState): Unit = js.native
  def onChange(data: AnonDate): Unit = js.native
}

