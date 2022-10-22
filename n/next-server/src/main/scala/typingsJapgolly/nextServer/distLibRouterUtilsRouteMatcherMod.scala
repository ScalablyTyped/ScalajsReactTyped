package typingsJapgolly.nextServer

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextServer.anon.Groups
import typingsJapgolly.nextServer.nextServerBooleans.`false`
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRouterUtilsRouteMatcherMod {
  
  @JSImport("next-server/dist/lib/router/utils/route-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, Groups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteMatcher")(routeRegex.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]]]
}
