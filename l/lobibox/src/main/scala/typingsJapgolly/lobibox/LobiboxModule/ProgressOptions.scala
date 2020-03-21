package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lobibox.AnonCancel
import typingsJapgolly.lobibox.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressOptions
  extends MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
    // Show percentage of progress
  var label: js.UndefOr[String] = js.undefined
  var progressCompleted: js.UndefOr[js.Any] = js.undefined
    // Show progress label
  var progressTpl: js.UndefOr[Boolean] = js.undefined
    //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.undefined
  var showProgressLabel: js.UndefOr[Boolean] = js.undefined
}

object ProgressOptions {
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
    getProgress: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    height: String = null,
    hide: js.UndefOr[CallbackTo[ProgressOptions]] = js.undefined,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    label: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: AnonConfirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Callback = null,
    progressComplete: /* lobibox */ LobiboxStatic => Callback = null,
    progressCompleted: js.Any = null,
    progressTpl: js.UndefOr[Boolean] = js.undefined,
    progressUpdated: js.Any = null,
    setHeight: /* height */ js.UndefOr[Double] => CallbackTo[ProgressOptions] = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => CallbackTo[ProgressOptions] = null,
    setProgress: /* progress */ Double => CallbackTo[ProgressOptions] = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => CallbackTo[ProgressOptions] = null,
    setTitle: /* title */ js.UndefOr[String] => CallbackTo[ProgressOptions] = null,
    setWidth: /* width */ js.UndefOr[Double] => CallbackTo[ProgressOptions] = null,
    show: js.UndefOr[CallbackTo[ProgressOptions]] = js.undefined,
    showClass: String = null,
    showProgressLabel: js.UndefOr[Boolean] = js.undefined,
    shown: /* lobibox */ js.Any => Callback = null,
    title: String = null,
    width: Int | Double = null
  ): ProgressOptions = {
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
    getProgress.foreach(p => __obj.updateDynamic("getProgress")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => onShow(t0).runNow()))
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(js.Any.fromFunction1((t0: /* lobibox */ typingsJapgolly.lobibox.LobiboxModule.LobiboxStatic) => progressComplete(t0).runNow()))
    if (progressCompleted != null) __obj.updateDynamic("progressCompleted")(progressCompleted.asInstanceOf[js.Any])
    if (!js.isUndefined(progressTpl)) __obj.updateDynamic("progressTpl")(progressTpl.asInstanceOf[js.Any])
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(progressUpdated.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[scala.Double]) => setHeight(t0).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2((t0: /* left */ js.UndefOr[scala.Double | java.lang.String], t1: /* top */ js.UndefOr[scala.Double]) => setPosition(t0, t1).runNow()))
    if (setProgress != null) __obj.updateDynamic("setProgress")(js.Any.fromFunction1((t0: /* progress */ scala.Double) => setProgress(t0).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double]) => setSize(t0, t1).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[scala.Double]) => setWidth(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgressLabel)) __obj.updateDynamic("showProgressLabel")(showProgressLabel.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => shown(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
}

