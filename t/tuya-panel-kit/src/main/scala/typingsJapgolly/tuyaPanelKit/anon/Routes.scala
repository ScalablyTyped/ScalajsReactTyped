package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialRoute
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Routes[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  // tslint:disable-next-line array-type
  var routes: js.Array[
    PartialRoute[
      typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[
        /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
        js.UndefOr[js.Object]
      ]
    ]
  ]
  
  var stale: js.UndefOr[`true`] = js.undefined
}
object Routes {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](
    routes: js.Array[
      PartialRoute[
        typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[
          /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
          js.UndefOr[js.Object]
        ]
      ]
    ]
  ): Routes[State] = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Routes[State]]
  }
  
  extension [Self <: Routes[?], State /* <: NavigationState[ParamListBase] */](x: Self & Routes[State]) {
    
    inline def setRoutes(
      value: js.Array[
          PartialRoute[
            typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[
              /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(
      value: (PartialRoute[
          typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route[
            /* import warning: importer.ImportType#apply Failed type conversion: State['routeNames'][number] */ js.Any, 
            js.UndefOr[js.Object]
          ]
        ])*
    ): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
