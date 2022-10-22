package typingsJapgolly.tuyaPanelKit

import typingsJapgolly.std.Extract
import typingsJapgolly.std.Omit
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialRoute
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route
import typingsJapgolly.tuyaPanelKit.anon.Key
import typingsJapgolly.tuyaPanelKit.anon.KeyMerge
import typingsJapgolly.tuyaPanelKit.anon.Merge
import typingsJapgolly.tuyaPanelKit.anon.Params
import typingsJapgolly.tuyaPanelKit.anon.`0`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationRoutersCommonActionsMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
  
  inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def navigate(route: Key): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(route: Params): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
  inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tuyaPanelKit.anon.Source
    - typingsJapgolly.tuyaPanelKit.anon.Payload
    - typingsJapgolly.tuyaPanelKit.anon.PayloadSourceTarget
    - typingsJapgolly.tuyaPanelKit.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    inline def Payload(payload: Merge | KeyMerge): typingsJapgolly.tuyaPanelKit.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.Payload]
    }
    
    inline def PayloadSourceTarget(): typingsJapgolly.tuyaPanelKit.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET")
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.PayloadSourceTarget]
    }
    
    inline def Source(): typingsJapgolly.tuyaPanelKit.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("GO_BACK")
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.Source]
    }
    
    inline def Type(payload: `0`): typingsJapgolly.tuyaPanelKit.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_PARAMS")
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.Type]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tuyaPanelKit.anon.PartialStateNavigationSta
    - typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState[typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase]
    - typingsJapgolly.tuyaPanelKit.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    inline def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      `type`: String
    ): typingsJapgolly.tuyaPanelKit.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.OmitNavigationStateParamL]
    }
    
    inline def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typingsJapgolly.tuyaPanelKit.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.PartialStateNavigationSta]
    }
  }
}
