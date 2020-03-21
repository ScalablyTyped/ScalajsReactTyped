package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  val checked: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[Node] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onChange: /* checked */ Boolean => Callback = null,
    style: CSSProperties = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

