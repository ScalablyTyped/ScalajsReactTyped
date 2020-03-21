package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.UI.Popups.IUICommand
import typingsJapgolly.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreWindowDialog extends js.Object {
  @JSName("backButtonCommand")
  var backButtonCommand_Original: UICommandInvokedHandler = js.native
  var cancelCommandIndex: Double = js.native
  var commands: IVector[IUICommand] = js.native
  var defaultCommandIndex: Double = js.native
  var isInteractionDelayed: Double = js.native
  var maxSize: Size = js.native
  var minSize: Size = js.native
  var onshowing: js.Any = js.native
  var title: String = js.native
  def backButtonCommand(command: IUICommand): Unit = js.native
  def showAsync(): IAsyncOperation[IUICommand] = js.native
}

