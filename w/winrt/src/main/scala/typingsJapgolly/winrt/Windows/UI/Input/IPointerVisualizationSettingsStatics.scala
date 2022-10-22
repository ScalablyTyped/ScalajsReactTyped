package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerVisualizationSettingsStatics extends StObject {
  
  def getForCurrentView(): PointerVisualizationSettings
}
object IPointerVisualizationSettingsStatics {
  
  inline def apply(getForCurrentView: CallbackTo[PointerVisualizationSettings]): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
  
  extension [Self <: IPointerVisualizationSettingsStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[PointerVisualizationSettings]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
