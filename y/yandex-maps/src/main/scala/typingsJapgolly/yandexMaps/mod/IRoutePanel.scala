package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.mod.multiRouter.MultiRoute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRoutePanel extends StObject {
  
  def getRoute(): MultiRoute
  
  var options: IOptionManager
  
  var state: IDataManager
  
  def switchPoints(): Unit
}
object IRoutePanel {
  
  inline def apply(
    getRoute: CallbackTo[MultiRoute],
    options: IOptionManager,
    state: IDataManager,
    switchPoints: Callback
  ): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = getRoute.toJsFn, options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = switchPoints.toJsFn)
    __obj.asInstanceOf[IRoutePanel]
  }
  
  extension [Self <: IRoutePanel](x: Self) {
    
    inline def setGetRoute(value: CallbackTo[MultiRoute]): Self = StObject.set(x, "getRoute", value.toJsFn)
    
    inline def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: IDataManager): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSwitchPoints(value: Callback): Self = StObject.set(x, "switchPoints", value.toJsFn)
  }
}
