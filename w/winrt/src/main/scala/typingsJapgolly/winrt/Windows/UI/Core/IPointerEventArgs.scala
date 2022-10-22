package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.System.VirtualKeyModifiers
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var currentPoint: PointerPoint
  
  def getIntermediatePoints(): IVector[PointerPoint]
  
  var keyModifiers: VirtualKeyModifiers
}
object IPointerEventArgs {
  
  inline def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: CallbackTo[IVector[PointerPoint]],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], getIntermediatePoints = getIntermediatePoints.toJsFn, handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerEventArgs]
  }
  
  extension [Self <: IPointerEventArgs](x: Self) {
    
    inline def setCurrentPoint(value: PointerPoint): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
    
    inline def setGetIntermediatePoints(value: CallbackTo[IVector[PointerPoint]]): Self = StObject.set(x, "getIntermediatePoints", value.toJsFn)
    
    inline def setKeyModifiers(value: VirtualKeyModifiers): Self = StObject.set(x, "keyModifiers", value.asInstanceOf[js.Any])
  }
}
