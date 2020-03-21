package typingsJapgolly.reactReduxToastr.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[Element] = js.undefined
  var icon: js.UndefOr[iconType | Element] = js.undefined
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var removeOnHover: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[iconType] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object LightToastrOptions {
  @scala.inline
  def apply(
    attention: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: VdomElement = null,
    icon: iconType | Element = null,
    onCloseButtonClick: js.UndefOr[Callback] = js.undefined,
    onHideComplete: js.UndefOr[Callback] = js.undefined,
    onShowComplete: js.UndefOr[Callback] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    removeOnHover: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    status: iconType = null,
    timeOut: Int | Double = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): LightToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onCloseButtonClick.foreach(p => __obj.updateDynamic("onCloseButtonClick")(p.toJsFn))
    onHideComplete.foreach(p => __obj.updateDynamic("onHideComplete")(p.toJsFn))
    onShowComplete.foreach(p => __obj.updateDynamic("onShowComplete")(p.toJsFn))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnHover)) __obj.updateDynamic("removeOnHover")(removeOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightToastrOptions]
  }
}

