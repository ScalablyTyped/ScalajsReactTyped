package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lobibox.AnonCancel
import typingsJapgolly.lobibox.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesOptions extends MessageBoxesDefault {
  var bodyClass: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[AnonCancel | js.Any] = js.undefined
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var modalClasses: js.UndefOr[AnonConfirm] = js.undefined
}

object MessageBoxesOptions {
  @scala.inline
  def apply(
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Callback = null,
    bodyClass: String = null,
    buttons: AnonCancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Callback = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Callback = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    height: String = null,
    hide: js.UndefOr[CallbackTo[MessageBoxesOptions]] = js.undefined,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: AnonConfirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Callback = null,
    setHeight: /* height */ js.UndefOr[Double] => CallbackTo[MessageBoxesOptions] = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => CallbackTo[MessageBoxesOptions] = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => CallbackTo[MessageBoxesOptions] = null,
    setTitle: /* title */ js.UndefOr[String] => CallbackTo[MessageBoxesOptions] = null,
    setWidth: /* width */ js.UndefOr[Double] => CallbackTo[MessageBoxesOptions] = null,
    show: js.UndefOr[CallbackTo[MessageBoxesOptions]] = js.undefined,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Callback = null,
    title: String = null,
    width: Int | Double = null
  ): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => beforeClose(t0).runNow()))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3((t0: /* lobibox */ js.Any, t1: /* type */ js.UndefOr[java.lang.String], t2: /* ev */ js.UndefOr[js.Any]) => callback(t0, t1, t2).runNow()))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => closed(t0).runNow()))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => onShow(t0).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[scala.Double]) => setHeight(t0).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2((t0: /* left */ js.UndefOr[scala.Double | java.lang.String], t1: /* top */ js.UndefOr[scala.Double]) => setPosition(t0, t1).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double]) => setSize(t0, t1).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[scala.Double]) => setWidth(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => shown(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxesOptions]
  }
}

