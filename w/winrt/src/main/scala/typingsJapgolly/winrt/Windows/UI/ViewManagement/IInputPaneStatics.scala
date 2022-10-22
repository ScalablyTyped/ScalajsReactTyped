package typingsJapgolly.winrt.Windows.UI.ViewManagement

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputPaneStatics extends StObject {
  
  def getForCurrentView(): InputPane
}
object IInputPaneStatics {
  
  inline def apply(getForCurrentView: CallbackTo[InputPane]): IInputPaneStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[IInputPaneStatics]
  }
  
  extension [Self <: IInputPaneStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[InputPane]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
