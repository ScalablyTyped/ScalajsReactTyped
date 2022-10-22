package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToManagerStatics extends StObject {
  
  def getForCurrentView(): PlayToManager
  
  def showPlayToUI(): Unit
}
object IPlayToManagerStatics {
  
  inline def apply(getForCurrentView: CallbackTo[PlayToManager], showPlayToUI: Callback): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn, showPlayToUI = showPlayToUI.toJsFn)
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
  
  extension [Self <: IPlayToManagerStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[PlayToManager]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
    
    inline def setShowPlayToUI(value: Callback): Self = StObject.set(x, "showPlayToUI", value.toJsFn)
  }
}
