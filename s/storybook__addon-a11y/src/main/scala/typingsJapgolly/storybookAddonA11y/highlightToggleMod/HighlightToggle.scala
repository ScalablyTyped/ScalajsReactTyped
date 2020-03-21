package typingsJapgolly.storybookAddonA11y.highlightToggleMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonA11y.ReadonlyToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightToggle
  extends Component[ToggleProps, js.Object, js.Any] {
  var checkBoxRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MHighlightToggle(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHighlightToggle(prevProps: ReadonlyToggleProps): Unit = js.native
  def highlightRuleLocation(targetElement: HTMLElement, addHighlight: Boolean): Unit = js.native
  def onToggle(): Unit = js.native
  def saveElementDataToMap(targetElement: HTMLElement, isHighlighted: Boolean, originalOutline: String): Unit = js.native
}

