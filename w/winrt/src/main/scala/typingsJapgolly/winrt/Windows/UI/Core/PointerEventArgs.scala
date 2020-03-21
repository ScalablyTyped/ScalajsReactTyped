package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.System.VirtualKeyModifiers
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.PointerEventArgs")
@js.native
class PointerEventArgs () extends IPointerEventArgs {
  /* CompleteClass */
  override var currentPoint: PointerPoint = js.native
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyModifiers: VirtualKeyModifiers = js.native
  /* CompleteClass */
  override def getIntermediatePoints(): IVector[PointerPoint] = js.native
}

