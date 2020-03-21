package typingsJapgolly.jupyterlabApputils.toolbarMod.ToolbarButtonComponent

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ToolbarButttonComponent props.
  */
trait IProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var iconLabel: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    className: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    iconClassName: String = null,
    iconLabel: String = null,
    label: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    tooltip: String = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

