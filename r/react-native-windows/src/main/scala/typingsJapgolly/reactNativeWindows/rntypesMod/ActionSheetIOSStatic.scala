package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetIOSStatic extends StObject {
  
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
  
  inline def apply(
    showActionSheetWithOptions: (ActionSheetIOSOptions, js.Function1[/* buttonIndex */ Double, Unit]) => Callback,
    showShareActionSheetWithOptions: (ShareActionSheetIOSOptions, js.Function1[/* error */ js.Error, Unit], js.Function2[/* success */ Boolean, /* method */ String, Unit]) => Callback
  ): ActionSheetIOSStatic = {
    val __obj = js.Dynamic.literal(showActionSheetWithOptions = js.Any.fromFunction2((t0: ActionSheetIOSOptions, t1: js.Function1[/* buttonIndex */ Double, Unit]) => (showActionSheetWithOptions(t0, t1)).runNow()), showShareActionSheetWithOptions = js.Any.fromFunction3((t0: ShareActionSheetIOSOptions, t1: js.Function1[/* error */ js.Error, Unit], t2: js.Function2[/* success */ Boolean, /* method */ String, Unit]) => (showShareActionSheetWithOptions(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ActionSheetIOSStatic]
  }
  
  extension [Self <: ActionSheetIOSStatic](x: Self) {
    
    inline def setShowActionSheetWithOptions(value: (ActionSheetIOSOptions, js.Function1[/* buttonIndex */ Double, Unit]) => Callback): Self = StObject.set(x, "showActionSheetWithOptions", js.Any.fromFunction2((t0: ActionSheetIOSOptions, t1: js.Function1[/* buttonIndex */ Double, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setShowShareActionSheetWithOptions(
      value: (ShareActionSheetIOSOptions, js.Function1[/* error */ js.Error, Unit], js.Function2[/* success */ Boolean, /* method */ String, Unit]) => Callback
    ): Self = StObject.set(x, "showShareActionSheetWithOptions", js.Any.fromFunction3((t0: ShareActionSheetIOSOptions, t1: js.Function1[/* error */ js.Error, Unit], t2: js.Function2[/* success */ Boolean, /* method */ String, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
