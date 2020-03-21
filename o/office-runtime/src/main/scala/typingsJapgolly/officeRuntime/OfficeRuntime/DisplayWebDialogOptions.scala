package typingsJapgolly.officeRuntime.OfficeRuntime

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides display options and actions a dialog box may take. */
trait DisplayWebDialogOptions extends js.Object {
  /**
    * Optional parameter that determines whether the dialog box displays as a popup (false) or within an IFrame (true).
    * This setting is only applicable to custom functions running on Excel Online.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var displayInIFrame: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameter that defines the height of the dialog box as a percentage of the current display.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Optional callback that runs when the dialog box is closed.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional callback that runs when the dialog box sends a message to its parent.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onMessage: js.UndefOr[js.Function2[/* message */ String, /* dialog */ js.UndefOr[Dialog], Unit]] = js.undefined
  /**
    * Optional callback that runs when the dialog box sends an error.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onRuntimeError: js.UndefOr[js.Function2[/* error */ js.Error, /* dialog */ js.UndefOr[Dialog], Unit]] = js.undefined
  /**
    * Optional parameter that defines the width of dialog as a percentage of window.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var width: js.UndefOr[String] = js.undefined
}

object DisplayWebDialogOptions {
  @scala.inline
  def apply(
    displayInIFrame: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onMessage: (/* message */ String, /* dialog */ js.UndefOr[Dialog]) => Callback = null,
    onRuntimeError: (/* error */ js.Error, /* dialog */ js.UndefOr[Dialog]) => Callback = null,
    width: String = null
  ): DisplayWebDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInIFrame)) __obj.updateDynamic("displayInIFrame")(displayInIFrame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* dialog */ js.UndefOr[typingsJapgolly.officeRuntime.OfficeRuntime.Dialog]) => onMessage(t0, t1).runNow()))
    if (onRuntimeError != null) __obj.updateDynamic("onRuntimeError")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* dialog */ js.UndefOr[typingsJapgolly.officeRuntime.OfficeRuntime.Dialog]) => onRuntimeError(t0, t1).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayWebDialogOptions]
  }
}

