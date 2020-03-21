package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lobibox.AnonCancel
import typingsJapgolly.lobibox.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends MessageBoxesOptions {
    // Override default option
  var autoload: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.undefined
    // Auto load from given url when window is created
  var loadMethod: js.UndefOr[String] = js.undefined
    // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.undefined
    // Ajax method to load content
  var showAfterLoad: js.UndefOr[Boolean] = js.undefined
    // HTML Content of window
  var url: js.UndefOr[String] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    autoload: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Callback = null,
    bodyClass: String = null,
    buttons: AnonCancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Callback = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Callback = null,
    content: js.Any = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    height: js.Any = null,
    hide: js.UndefOr[CallbackTo[WindowOptions]] = js.undefined,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    loadMethod: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: AnonConfirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Callback = null,
    params: js.Object = null,
    setHeight: /* height */ js.UndefOr[Double] => CallbackTo[WindowOptions] = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => CallbackTo[WindowOptions] = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => CallbackTo[WindowOptions] = null,
    setTitle: /* title */ js.UndefOr[String] => CallbackTo[WindowOptions] = null,
    setWidth: /* width */ js.UndefOr[Double] => CallbackTo[WindowOptions] = null,
    show: js.UndefOr[CallbackTo[WindowOptions]] = js.undefined,
    showAfterLoad: js.UndefOr[Boolean] = js.undefined,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Callback = null,
    title: String = null,
    url: String = null,
    width: Int | Double = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => beforeClose(t0).runNow()))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3((t0: /* lobibox */ js.Any, t1: /* type */ js.UndefOr[java.lang.String], t2: /* ev */ js.UndefOr[js.Any]) => callback(t0, t1, t2).runNow()))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => closed(t0).runNow()))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (loadMethod != null) __obj.updateDynamic("loadMethod")(loadMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => onShow(t0).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[scala.Double]) => setHeight(t0).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2((t0: /* left */ js.UndefOr[scala.Double | java.lang.String], t1: /* top */ js.UndefOr[scala.Double]) => setPosition(t0, t1).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double]) => setSize(t0, t1).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[scala.Double]) => setWidth(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(showAfterLoad)) __obj.updateDynamic("showAfterLoad")(showAfterLoad.asInstanceOf[js.Any])
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => shown(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

