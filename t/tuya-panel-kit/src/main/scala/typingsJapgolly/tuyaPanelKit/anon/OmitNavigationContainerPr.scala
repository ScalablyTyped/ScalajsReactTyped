package typingsJapgolly.tuyaPanelKit.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.InitialState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<tuya-panel-kit.tuya-panel-kit/@react-navigation/native.NavigationContainerProps, 'children'> */
trait OmitNavigationContainerPr extends StObject {
  
  var independent: js.UndefOr[Boolean] = js.undefined
  
  var initialState: js.UndefOr[InitialState] = js.undefined
  
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.undefined
  
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.undefined
}
object OmitNavigationContainerPr {
  
  inline def apply(): OmitNavigationContainerPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitNavigationContainerPr]
  }
  
  extension [Self <: OmitNavigationContainerPr](x: Self) {
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Callback): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1((t0: /* state */ js.UndefOr[NavigationState[ParamListBase]]) => value(t0).runNow()))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setOnUnhandledAction(value: /* action */ NavigationAction => Callback): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1((t0: /* action */ NavigationAction) => value(t0).runNow()))
    
    inline def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
  }
}
