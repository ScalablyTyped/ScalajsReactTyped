package typingsJapgolly.reactToastify.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactToastify.reactToastifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends ToastOptions {
  /**
    * Used to update a toast.
    * Pass any valid ReactNode(string, number, component)
    */
  var render: js.UndefOr[ToastContent] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(
    autoClose: Double | `false` = null,
    bodyClassName: String | js.Object = null,
    className: String | js.Object = null,
    closeButton: Node | Boolean = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    containerId: String | Double = null,
    delay: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggablePercent: Int | Double = null,
    hideProgressBar: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onOpen: js.UndefOr[Callback] = js.undefined,
    pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    position: PositionOptions = null,
    progress: Int | Double = null,
    progressClassName: String | js.Object = null,
    progressStyle: js.Object = null,
    render: ToastContent = null,
    role: String = null,
    toastId: ToastId = null,
    transition: ComponentType[js.Object] = null,
    `type`: TypeOptions = null
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (autoClose != null) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (bodyClassName != null) __obj.updateDynamic("bodyClassName")(bodyClassName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (draggablePercent != null) __obj.updateDynamic("draggablePercent")(draggablePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideProgressBar)) __obj.updateDynamic("hideProgressBar")(hideProgressBar.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onOpen.foreach(p => __obj.updateDynamic("onOpen")(p.toJsFn))
    if (!js.isUndefined(pauseOnFocusLoss)) __obj.updateDynamic("pauseOnFocusLoss")(pauseOnFocusLoss.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (progressClassName != null) __obj.updateDynamic("progressClassName")(progressClassName.asInstanceOf[js.Any])
    if (progressStyle != null) __obj.updateDynamic("progressStyle")(progressStyle.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (toastId != null) __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

