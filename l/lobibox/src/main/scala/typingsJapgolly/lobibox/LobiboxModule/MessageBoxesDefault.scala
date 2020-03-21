package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesDefault extends js.Object {
  var baseClass: js.UndefOr[String] = js.undefined
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var buttonsAlign: js.UndefOr[String] = js.undefined
    // Height is automatically given calculated by width
  var closeButton: js.UndefOr[Boolean] = js.undefined
   // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
    // Make messagebox draggable
  var customBtnClass: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
    // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[Double] = js.undefined
    // Show close button or not
  var draggable: js.UndefOr[Boolean] = js.undefined
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  var hideClass: js.UndefOr[String] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
   // Class for custom buttons
  var modal: js.UndefOr[Boolean] = js.undefined
  var msg: js.UndefOr[String] = js.undefined
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], this.type]] = js.undefined
  var setPosition: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double], this.type]
  ] = js.undefined
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], this.type]
  ] = js.undefined
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.undefined
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], this.type]] = js.undefined
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  var showClass: js.UndefOr[String] = js.undefined
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MessageBoxesDefault {
  @scala.inline
  def apply(
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Callback = null,
    buttonsAlign: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Callback = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    height: String = null,
    hide: js.UndefOr[CallbackTo[MessageBoxesDefault]] = js.undefined,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Callback = null,
    setHeight: /* height */ js.UndefOr[Double] => CallbackTo[MessageBoxesDefault] = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => CallbackTo[MessageBoxesDefault] = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => CallbackTo[MessageBoxesDefault] = null,
    setTitle: /* title */ js.UndefOr[String] => CallbackTo[MessageBoxesDefault] = null,
    setWidth: /* width */ js.UndefOr[Double] => CallbackTo[MessageBoxesDefault] = null,
    show: js.UndefOr[CallbackTo[MessageBoxesDefault]] = js.undefined,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Callback = null,
    title: String = null,
    width: Int | Double = null
  ): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* lobibox */ js.Any) => beforeClose(t0).runNow()))
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MessageBoxesDefault]
  }
}

