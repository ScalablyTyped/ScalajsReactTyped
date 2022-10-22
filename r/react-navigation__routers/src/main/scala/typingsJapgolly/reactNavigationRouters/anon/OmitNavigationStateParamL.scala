package typingsJapgolly.reactNavigationRouters.anon

import typingsJapgolly.reactNavigationRouters.libTypescriptSrcCommonActionsMod._ResetState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typingsJapgolly.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typingsJapgolly.reactNavigationRouters.reactNavigationRoutersStrings.key
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>, 'routes'> & {  routes :std.Array<std.Omit<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.Route<string, object | undefined>, 'key'>>} */
trait OmitNavigationStateParamL
  extends StObject
     with _ResetState {
  
  var history: js.UndefOr[js.Array[Any]] = js.undefined
  
  var index: Double
  
  var key: String
  
  var routeNames: js.Array[
    Extract[
      /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
      String
    ]
  ]
  
  var routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]]
  
  var stale: `false`
  
  var `type`: String
}
object OmitNavigationStateParamL {
  
  inline def apply(
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
  ): OmitNavigationStateParamL = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitNavigationStateParamL]
  }
  
  extension [Self <: OmitNavigationStateParamL](x: Self) {
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesVarargs(
      value: (Extract[
          /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
          String
        ])*
    ): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRoutes(value: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: (Omit[Route[String, js.UndefOr[js.Object]], key])*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
