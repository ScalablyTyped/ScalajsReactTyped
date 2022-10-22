package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.UI.Popups.IUICommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreWindowDialog
  extends StObject
     with ICoreWindowDialog
object CoreWindowDialog {
  
  inline def apply(
    backButtonCommand: /* command */ IUICommand => Callback,
    cancelCommandIndex: Double,
    commands: IVector[IUICommand],
    defaultCommandIndex: Double,
    isInteractionDelayed: Double,
    maxSize: Size,
    minSize: Size,
    onshowing: Any,
    showAsync: CallbackTo[IAsyncOperation[IUICommand]],
    title: String
  ): CoreWindowDialog = {
    val __obj = js.Dynamic.literal(backButtonCommand = js.Any.fromFunction1((t0: /* command */ IUICommand) => backButtonCommand(t0).runNow()), cancelCommandIndex = cancelCommandIndex.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], isInteractionDelayed = isInteractionDelayed.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], showAsync = showAsync.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreWindowDialog]
  }
}
