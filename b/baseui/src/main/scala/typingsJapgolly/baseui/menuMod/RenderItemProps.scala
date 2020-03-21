package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  var resetMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object RenderItemProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isHighlighted: js.UndefOr[Boolean] = js.undefined,
    ref: Ref = null,
    resetMenu: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): RenderItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlighted)) __obj.updateDynamic("isHighlighted")(isHighlighted.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    resetMenu.foreach(p => __obj.updateDynamic("resetMenu")(p.toJsFn))
    __obj.asInstanceOf[RenderItemProps]
  }
}

