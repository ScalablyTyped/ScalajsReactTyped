package typingsJapgolly.storybookAddonA11y.highlightToggleMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.std.Map
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends js.Object {
  var addElement: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var elementsToHighlight: js.Array[NodeResult]
  var highlightedElementsMap: js.UndefOr[Map[HTMLElement, HighlightedElementData]] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var isToggledOn: js.UndefOr[Boolean] = js.undefined
  var toggleId: js.UndefOr[String] = js.undefined
  var `type`: RuleType
}

object ToggleProps {
  @scala.inline
  def apply(
    elementsToHighlight: js.Array[NodeResult],
    `type`: RuleType,
    addElement: /* data */ js.Any => Callback = null,
    highlightedElementsMap: Map[HTMLElement, HighlightedElementData] = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    isToggledOn: js.UndefOr[Boolean] = js.undefined,
    toggleId: String = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addElement != null) __obj.updateDynamic("addElement")(js.Any.fromFunction1((t0: /* data */ js.Any) => addElement(t0).runNow()))
    if (highlightedElementsMap != null) __obj.updateDynamic("highlightedElementsMap")(highlightedElementsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (!js.isUndefined(isToggledOn)) __obj.updateDynamic("isToggledOn")(isToggledOn.asInstanceOf[js.Any])
    if (toggleId != null) __obj.updateDynamic("toggleId")(toggleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}

