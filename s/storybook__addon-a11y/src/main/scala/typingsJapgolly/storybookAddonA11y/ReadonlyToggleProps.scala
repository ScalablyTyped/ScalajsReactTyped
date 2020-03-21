package typingsJapgolly.storybookAddonA11y

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.std.Map
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import typingsJapgolly.storybookAddonA11y.highlightToggleMod.HighlightedElementData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-a11y.@storybook/addon-a11y/dist/components/Report/HighlightToggle.ToggleProps> */
trait ReadonlyToggleProps extends js.Object {
  val addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  val elementsToHighlight: js.Array[NodeResult]
  val highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.undefined
  val indeterminate: js.UndefOr[Boolean] = js.undefined
  val isToggledOn: js.UndefOr[Boolean] = js.undefined
  val toggleId: js.UndefOr[String] = js.undefined
  val `type`: RuleType
}

object ReadonlyToggleProps {
  @scala.inline
  def apply(
    elementsToHighlight: js.Array[NodeResult],
    `type`: RuleType,
    addElement: /* data */ js.Any => Callback = null,
    highlightedElementsMap: Map[HTMLElement, HighlightedElementData] = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    isToggledOn: js.UndefOr[Boolean] = js.undefined,
    toggleId: String = null
  ): ReadonlyToggleProps = {
    val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addElement != null) __obj.updateDynamic("addElement")(js.Any.fromFunction1((t0: /* data */ js.Any) => addElement(t0).runNow()))
    if (highlightedElementsMap != null) __obj.updateDynamic("highlightedElementsMap")(highlightedElementsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggledOn)) __obj.updateDynamic("isToggledOn")(isToggledOn.asInstanceOf[js.Any])
    if (toggleId != null) __obj.updateDynamic("toggleId")(toggleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToggleProps]
  }
}

