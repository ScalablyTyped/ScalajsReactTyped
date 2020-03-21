package typingsJapgolly.baseui.accordionMod

import typingsJapgolly.baseui.baseuiStrings.expand
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/accordion", "StatefulPanelContainer")
@js.native
class StatefulPanelContainer ()
  extends Component[StatefulPanelContainerProps, PanelState, js.Any] {
  @JSName("internalSetState")
  def internalSetState_expand(`type`: expand, changes: PanelState): Unit = js.native
  def onChange(args: js.Any): Unit = js.native
}

