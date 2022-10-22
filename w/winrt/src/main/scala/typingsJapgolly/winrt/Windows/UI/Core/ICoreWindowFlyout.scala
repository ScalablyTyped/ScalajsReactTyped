package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowFlyout extends StObject {
  
  def backButtonCommand(command: IUICommand): Unit
  @JSName("backButtonCommand")
  var backButtonCommand_Original: UICommandInvokedHandler
  
  var commands: IVector[IUICommand]
  
  var defaultCommandIndex: Double
  
  var isInteractionDelayed: Double
  
  var maxSize: Size
  
  var minSize: Size
  
  var onshowing: Any
  
  def showAsync(): IAsyncOperation[IUICommand]
  
  var title: String
}
object ICoreWindowFlyout {
  
  inline def apply(
    backButtonCommand: /* command */ IUICommand => Callback,
    commands: IVector[IUICommand],
    defaultCommandIndex: Double,
    isInteractionDelayed: Double,
    maxSize: Size,
    minSize: Size,
    onshowing: Any,
    showAsync: CallbackTo[IAsyncOperation[IUICommand]],
    title: String
  ): ICoreWindowFlyout = {
    val __obj = js.Dynamic.literal(backButtonCommand = js.Any.fromFunction1((t0: /* command */ IUICommand) => backButtonCommand(t0).runNow()), commands = commands.asInstanceOf[js.Any], defaultCommandIndex = defaultCommandIndex.asInstanceOf[js.Any], isInteractionDelayed = isInteractionDelayed.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], showAsync = showAsync.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreWindowFlyout]
  }
  
  extension [Self <: ICoreWindowFlyout](x: Self) {
    
    inline def setBackButtonCommand(value: /* command */ IUICommand => Callback): Self = StObject.set(x, "backButtonCommand", js.Any.fromFunction1((t0: /* command */ IUICommand) => value(t0).runNow()))
    
    inline def setCommands(value: IVector[IUICommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setDefaultCommandIndex(value: Double): Self = StObject.set(x, "defaultCommandIndex", value.asInstanceOf[js.Any])
    
    inline def setIsInteractionDelayed(value: Double): Self = StObject.set(x, "isInteractionDelayed", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: Size): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setOnshowing(value: Any): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
    
    inline def setShowAsync(value: CallbackTo[IAsyncOperation[IUICommand]]): Self = StObject.set(x, "showAsync", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
