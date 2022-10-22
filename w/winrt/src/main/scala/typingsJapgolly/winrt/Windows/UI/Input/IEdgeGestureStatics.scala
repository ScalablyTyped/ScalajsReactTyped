package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgeGestureStatics extends StObject {
  
  def getForCurrentView(): EdgeGesture
}
object IEdgeGestureStatics {
  
  inline def apply(getForCurrentView: CallbackTo[EdgeGesture]): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
  
  extension [Self <: IEdgeGestureStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[EdgeGesture]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
