package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.PartialRoute
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-navigation/routers.@react-navigation/routers.PartialState<@react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>>, 'stale'> */
trait OmitPartialStateNavigatio extends StObject {
  
  var history: js.UndefOr[js.Array[Any]] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var routeNames: js.UndefOr[
    js.Array[
      Extract[
        /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
        String
      ]
    ]
  ] = js.undefined
  
  var routes: js.Array[
    PartialRoute[
      typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ]
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OmitPartialStateNavigatio {
  
  inline def apply(
    routes: js.Array[
      PartialRoute[
        typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
          js.UndefOr[js.Object]
        ]
      ]
    ]
  ): OmitPartialStateNavigatio = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPartialStateNavigatio]
  }
  
  extension [Self <: OmitPartialStateNavigatio](x: Self) {
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRouteNames(
      value: js.Array[
          Extract[
            /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
            String
          ]
        ]
    ): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    inline def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    inline def setRouteNamesVarargs(
      value: (Extract[
          /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
          String
        ])*
    ): Self = StObject.set(x, "routeNames", js.Array(value*))
    
    inline def setRoutes(
      value: js.Array[
          PartialRoute[
            typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: (PartialRoute[
          typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route[
            /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, string>>[number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
