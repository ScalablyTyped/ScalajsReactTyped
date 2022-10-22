package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.System.VirtualKeyModifiers
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEventArgs
  extends StObject
     with IPointerEventArgs
object PointerEventArgs {
  
  inline def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: CallbackTo[IVector[PointerPoint]],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): PointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], getIntermediatePoints = getIntermediatePoints.toJsFn, handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEventArgs]
  }
}
