package typingsJapgolly.antd.selectMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdStrings.SECRET_COMBOBOX_MODE_DO_NOT_USE
import typingsJapgolly.antd.antdStrings.multiple
import typingsJapgolly.antd.antdStrings.tags
import typingsJapgolly.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof antd.antd/lib/select.SelectProps<VT>, 'mode'> ]: antd.antd/lib/select.SelectProps<VT>[P]} */ trait InternalSelectProps[VT] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var suffixIcon: js.UndefOr[Node] = js.undefined
}

object InternalSelectProps {
  @scala.inline
  def apply[VT](
    bordered: js.UndefOr[Boolean] = js.undefined,
    mode: multiple | tags | SECRET_COMBOBOX_MODE_DO_NOT_USE = null,
    size: SizeType = null,
    suffixIcon: VdomNode = null
  ): InternalSelectProps[VT] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSelectProps[VT]]
  }
}

