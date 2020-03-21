package typingsJapgolly.angularRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DeprecatedLoadChildren = java.lang.String
  type DetachedRouteHandle = js.Object
  /**
    * Error handler that is invoked when a navigation error occurs.
    *
    * If the handler returns a value, the navigation promise is resolved with this value.
    * If the handler throws an exception, the navigation promise is rejected with
    * the exception.
    *
    * @publicApi
    */
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Any]
  type LoadChildren = typingsJapgolly.angularRouter.mod.LoadChildrenCallback | typingsJapgolly.angularRouter.mod.DeprecatedLoadChildren
  type LoadChildrenCallback = js.Function0[
    typingsJapgolly.angularCore.mod.Type[js.Any] | typingsJapgolly.angularCore.mod.NgModuleFactory[js.Any] | typingsJapgolly.rxjs.mod.Observable_[typingsJapgolly.angularCore.mod.Type[js.Any]] | (js.Promise[
      typingsJapgolly.angularCore.mod.NgModuleFactory[js.Any] | typingsJapgolly.angularCore.mod.Type[js.Any] | js.Any
    ])
  ]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResolveData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Routes = js.Array[typingsJapgolly.angularRouter.mod.Route]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularRouter.angularRouterStrings.pathParamsChange
    - typingsJapgolly.angularRouter.angularRouterStrings.pathParamsOrQueryParamsChange
    - typingsJapgolly.angularRouter.angularRouterStrings.paramsChange
    - typingsJapgolly.angularRouter.angularRouterStrings.paramsOrQueryParamsChange
    - typingsJapgolly.angularRouter.angularRouterStrings.always
    - js.Function2[
  / * from * / typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, 
  / * to * / typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, 
  scala.Boolean]
  */
  type RunGuardsAndResolvers = typingsJapgolly.angularRouter.mod._RunGuardsAndResolvers | (js.Function2[
    /* from */ typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, 
    /* to */ typingsJapgolly.angularRouter.mod.ActivatedRouteSnapshot, 
    scala.Boolean
  ])
  type UrlMatcher = js.Function3[
    /* segments */ js.Array[typingsJapgolly.angularRouter.mod.UrlSegment], 
    /* group */ typingsJapgolly.angularRouter.mod.UrlSegmentGroup, 
    /* route */ typingsJapgolly.angularRouter.mod.Route, 
    typingsJapgolly.angularRouter.mod.UrlMatchResult
  ]
}
