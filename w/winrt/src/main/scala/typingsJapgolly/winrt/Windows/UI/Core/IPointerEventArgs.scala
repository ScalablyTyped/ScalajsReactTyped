package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.System.VirtualKeyModifiers
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerEventArgs extends ICoreWindowEventArgs {
  var currentPoint: PointerPoint
  var keyModifiers: VirtualKeyModifiers
  def getIntermediatePoints(): IVector[PointerPoint]
}

object IPointerEventArgs {
  @scala.inline
  def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: CallbackTo[IVector[PointerPoint]],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("getIntermediatePoints")(getIntermediatePoints.toJsFn)
    __obj.asInstanceOf[IPointerEventArgs]
  }
}

