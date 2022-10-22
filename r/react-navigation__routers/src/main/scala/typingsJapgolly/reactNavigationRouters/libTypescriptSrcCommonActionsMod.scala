package typingsJapgolly.reactNavigationRouters

import typingsJapgolly.reactNavigationRouters.anon.Key
import typingsJapgolly.reactNavigationRouters.anon.Merge
import typingsJapgolly.reactNavigationRouters.anon.Params
import typingsJapgolly.reactNavigationRouters.anon.Path
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.PartialRoute
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typingsJapgolly.reactNavigationRouters.reactNavigationRoutersStrings.key
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcCommonActionsMod {
  
  @JSImport("@react-navigation/routers/lib/typescript/src/CommonActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
  
  inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def navigate(options: Merge): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(options.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(options: Path): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(options.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
  inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigationRouters.anon.Source
    - typingsJapgolly.reactNavigationRouters.anon.Payload
    - typingsJapgolly.reactNavigationRouters.anon.Target
    - typingsJapgolly.reactNavigationRouters.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    inline def Payload(payload: Key | Merge): typingsJapgolly.reactNavigationRouters.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.Payload]
    }
    
    inline def Source(): typingsJapgolly.reactNavigationRouters.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("GO_BACK")
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.Source]
    }
    
    inline def Target(): typingsJapgolly.reactNavigationRouters.anon.Target = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET")
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.Target]
    }
    
    inline def Type(payload: Params): typingsJapgolly.reactNavigationRouters.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_PARAMS")
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigationRouters.anon.PartialStateNavigationSta
    - typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState[typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase]
    - typingsJapgolly.reactNavigationRouters.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    inline def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      `type`: String
    ): typingsJapgolly.reactNavigationRouters.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.OmitNavigationStateParamL]
    }
    
    inline def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typingsJapgolly.reactNavigationRouters.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactNavigationRouters.anon.PartialStateNavigationSta]
    }
  }
}
