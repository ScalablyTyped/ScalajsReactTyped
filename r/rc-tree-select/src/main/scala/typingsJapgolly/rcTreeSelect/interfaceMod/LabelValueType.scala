package typingsJapgolly.rcTreeSelect.interfaceMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValueType extends js.Object {
  /** Only works on `treeCheckStrictly` */
  var halfChecked: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[RawValueType] = js.undefined
}

object LabelValueType {
  @scala.inline
  def apply(
    halfChecked: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: VdomNode = null,
    value: RawValueType = null
  ): LabelValueType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(halfChecked)) __obj.updateDynamic("halfChecked")(halfChecked.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValueType]
  }
}

