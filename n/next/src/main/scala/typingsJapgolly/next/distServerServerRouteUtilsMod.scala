package typingsJapgolly.next

import typingsJapgolly.next.anon.RestrictedRedirectPathsArray
import typingsJapgolly.next.anon.RestrictedRedirectPathsRule
import typingsJapgolly.next.anon.RestrictedRedirectPathsRuleType
import typingsJapgolly.next.anon.Rule
import typingsJapgolly.next.anon.RuleType
import typingsJapgolly.next.distLibLoadCustomRoutesMod.Header
import typingsJapgolly.next.distLibLoadCustomRoutesMod.Redirect
import typingsJapgolly.next.distLibLoadCustomRoutesMod.Rewrite
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distServerRouterMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerServerRouteUtilsMod {
  
  @JSImport("next/dist/server/server-route-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHeaderRoute(hasRuleRestrictedRedirectPaths: Rule): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeaderRoute")(hasRuleRestrictedRedirectPaths.asInstanceOf[js.Any]).asInstanceOf[Route]
  
  inline def createRedirectRoute(hasRuleRestrictedRedirectPaths: RestrictedRedirectPathsRule): Route = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectRoute")(hasRuleRestrictedRedirectPaths.asInstanceOf[js.Any]).asInstanceOf[Route]
  
  inline def getCustomRoute(params: RestrictedRedirectPathsArray): Route & Redirect = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Redirect]
  inline def getCustomRoute(params: RestrictedRedirectPathsRuleType): Route & Rewrite = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Rewrite]
  inline def getCustomRoute(params: RuleType): Route & Header = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomRoute")(params.asInstanceOf[js.Any]).asInstanceOf[Route & Header]
  
  inline def stringifyQuery(
    req: BaseNextRequest[Any],
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(req.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
}
