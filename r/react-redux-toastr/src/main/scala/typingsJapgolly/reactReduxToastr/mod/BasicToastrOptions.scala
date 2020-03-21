package typingsJapgolly.reactReduxToastr.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicToastrOptions extends js.Object {
  var attention: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[(Component[js.Object, js.Object]) | Element] = js.undefined
  var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var removeOnHover: js.UndefOr[Boolean] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object BasicToastrOptions {
  @scala.inline
  def apply(
    attention: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    component: (Component[js.Object, js.Object]) | Element = null,
    getState: /* state */ ToastrState => CallbackTo[ToastrState] = null,
    icon: VdomElement = null,
    onCloseButtonClick: js.UndefOr[Callback] = js.undefined,
    onHideComplete: js.UndefOr[Callback] = js.undefined,
    onShowComplete: js.UndefOr[Callback] = js.undefined,
    onToastrClick: js.UndefOr[Callback] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    removeOnHover: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    timeOut: Int | Double = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): BasicToastrOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactReduxToastr.mod.ToastrState) => getState(t0).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    onCloseButtonClick.foreach(p => __obj.updateDynamic("onCloseButtonClick")(p.toJsFn))
    onHideComplete.foreach(p => __obj.updateDynamic("onHideComplete")(p.toJsFn))
    onShowComplete.foreach(p => __obj.updateDynamic("onShowComplete")(p.toJsFn))
    onToastrClick.foreach(p => __obj.updateDynamic("onToastrClick")(p.toJsFn))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnHover)) __obj.updateDynamic("removeOnHover")(removeOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicToastrOptions]
  }
}

