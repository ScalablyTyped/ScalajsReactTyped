package typingsJapgolly.winrt.Windows.UI.Popups

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupMenu extends js.Object {
  var commands: IVector[IUICommand] = js.native
  def showAsync(invocationPoint: Point): IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: Rect): IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[IUICommand] = js.native
}

