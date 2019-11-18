package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetIOSStatic extends js.Object {
  /**
    * Display an iOS action sheet. The `options` object must contain one or more
    * of:
    * - `options` (array of strings) - a list of button titles (required)
    * - `cancelButtonIndex` (int) - index of cancel button in `options`
    * - `destructiveButtonIndex` (int) - index of destructive button in `options`
    * - `title` (string) - a title to show above the action sheet
    * - `message` (string) - a message to show below the title
    */
  def showActionSheetWithOptions(options: ActionSheetIOSOptions, callback: js.Function1[/* buttonIndex */ Double, Unit]): Unit
  /**
    * Display the iOS share sheet. The `options` object should contain
    * one or both of `message` and `url` and can additionally have
    * a `subject` or `excludedActivityTypes`:
    *
    * - `url` (string) - a URL to share
    * - `message` (string) - a message to share
    * - `subject` (string) - a subject for the message
    * - `excludedActivityTypes` (array) - the activities to exclude from the ActionSheet
    *
    * NOTE: if `url` points to a local file, or is a base64-encoded
    * uri, the file it points to will be loaded and shared directly.
    * In this way, you can share images, videos, PDF files, etc.
    */
  def showShareActionSheetWithOptions(
    options: ShareActionSheetIOSOptions,
    failureCallback: js.Function1[/* error */ js.Error, Unit],
    successCallback: js.Function2[/* success */ Boolean, /* method */ String, Unit]
  ): Unit
}

object ActionSheetIOSStatic {
  @scala.inline
  def apply(
    showActionSheetWithOptions: (ActionSheetIOSOptions, js.Function1[/* buttonIndex */ Double, Unit]) => Callback,
    showShareActionSheetWithOptions: (ShareActionSheetIOSOptions, js.Function1[/* error */ js.Error, Unit], js.Function2[/* success */ Boolean, /* method */ String, Unit]) => Callback
  ): ActionSheetIOSStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("showActionSheetWithOptions")(js.Any.fromFunction2((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.ActionSheetIOSOptions, t1: js.Function1[/* buttonIndex */ scala.Double, scala.Unit]) => showActionSheetWithOptions(t0, t1).runNow()))
    __obj.updateDynamic("showShareActionSheetWithOptions")(js.Any.fromFunction3((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.ShareActionSheetIOSOptions, t1: js.Function1[/* error */ js.Error, scala.Unit], t2: js.Function2[/* success */ scala.Boolean, /* method */ java.lang.String, scala.Unit]) => showShareActionSheetWithOptions(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ActionSheetIOSStatic]
  }
}

