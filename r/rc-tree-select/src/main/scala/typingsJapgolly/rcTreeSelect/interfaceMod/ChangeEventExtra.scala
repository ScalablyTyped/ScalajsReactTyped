package typingsJapgolly.rcTreeSelect.interfaceMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventExtra extends js.Object {
  /** @deprecated This prop not work as react node anymore. */
  var allCheckedNodes: js.Array[LegacyCheckedNode]
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Please save prev value by control logic instead */
  var preValue: js.Array[LabelValueType]
  /** @deprecated Use `onSelect` or `onDeselect` instead. */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** @deprecated This prop not work as react node anymore. */
  var triggerNode: Element
  var triggerValue: RawValueType
}

object ChangeEventExtra {
  @scala.inline
  def apply(
    allCheckedNodes: js.Array[LegacyCheckedNode],
    preValue: js.Array[LabelValueType],
    triggerNode: VdomElement,
    triggerValue: RawValueType,
    checked: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): ChangeEventExtra = {
    val __obj = js.Dynamic.literal(allCheckedNodes = allCheckedNodes.asInstanceOf[js.Any], preValue = preValue.asInstanceOf[js.Any], triggerValue = triggerValue.asInstanceOf[js.Any])
    if (triggerNode != null) __obj.updateDynamic("triggerNode")(triggerNode.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventExtra]
  }
}

