package typingsJapgolly.primereact.overlayPanelMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayPanelProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var ariaCloseLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dismissable: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var showCloseIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object OverlayPanelProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    ariaCloseLabel: String = null,
    className: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onHide: js.UndefOr[Callback] = js.undefined,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): OverlayPanelProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseLabel != null) __obj.updateDynamic("ariaCloseLabel")(ariaCloseLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    onHide.foreach(p => __obj.updateDynamic("onHide")(p.toJsFn))
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayPanelProps]
  }
}

