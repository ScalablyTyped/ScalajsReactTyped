package typingsJapgolly.baseui.formControlMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlProps extends js.Object {
  var caption: js.UndefOr[Node] = js.undefined
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean | Node] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var overrides: js.UndefOr[FormControlOverrides] = js.undefined
  var positive: js.UndefOr[Node] = js.undefined
}

object FormControlProps {
  @scala.inline
  def apply(
    caption: VdomNode = null,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | Node = null,
    label: VdomNode = null,
    overrides: FormControlOverrides = null,
    positive: VdomNode = null
  ): FormControlProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.rawNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlProps]
  }
}

