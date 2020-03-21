package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.interfaceMod.RouteEntry
import typingsJapgolly.ionicCore.interfaceMod.RouteID
import typingsJapgolly.ionicCore.interfaceMod.RouteRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/matching", JSImport.Namespace)
@js.native
object matchingMod extends js.Object {
  @js.native
  class RouterSegments protected () extends js.Object {
    def this(path: js.Array[String]) = this()
    var path: js.Any = js.native
    def next(): String = js.native
  }
  
  def computePriority(chain: js.Array[RouteEntry]): Double = js.native
  def matchesIDs(ids: js.Array[String], chain: js.Array[RouteEntry]): Double = js.native
  def matchesPath(inputPath: js.Array[String], chain: js.Array[RouteEntry]): js.Array[RouteEntry] | Null = js.native
  def matchesRedirect(input: js.Array[String], route: RouteRedirect): /* is @ionic/core.@ionic/core/dist/types/components/router/utils/interface.RouteRedirect */ Boolean = js.native
  def mergeParams(a: js.Any, b: js.Any): js.Any = js.native
  def routeRedirect(path: js.Array[String], routes: js.Array[RouteRedirect]): js.UndefOr[RouteRedirect] = js.native
  def routerIDsToChain(ids: js.Array[RouteID], chains: js.Array[js.Array[RouteEntry]]): js.Array[RouteEntry] | Null = js.native
  def routerPathToChain(path: js.Array[String], chains: js.Array[js.Array[RouteEntry]]): js.Array[RouteEntry] | Null = js.native
}

