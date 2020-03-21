package typingsJapgolly.nextServer

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextServer.nextServerBooleans.`false`
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/router/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def getRouteMatcher(routeRegex: ReturnType[js.Function1[/* normalizedRoute */ String, AnonGroups]]): js.Function1[/* pathname */ js.UndefOr[String], `false` | StringDictionary[String]] = js.native
  def getRouteRegex(normalizedRoute: String): AnonGroups = js.native
  def getSortedRoutes(normalizedPages: js.Array[String]): js.Array[String] = js.native
  def isDynamicRoute(route: String): Boolean = js.native
}

