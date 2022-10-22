package typingsJapgolly.octokitPluginPaginateRest

import typingsJapgolly.octokitCore.mod.Octokit
import typingsJapgolly.octokitPluginPaginateRest.anon.AsyncIterator
import typingsJapgolly.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typingsJapgolly.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typingsJapgolly.octokitTypes.distTypesRouteMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIteratorMod {
  
  @JSImport("@octokit/plugin-paginate-rest/dist-types/iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterator(octokit: Octokit, route: RequestInterface[js.Object]): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: RequestInterface[js.Object], parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: Route): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
  inline def iterator(octokit: Octokit, route: Route, parameters: RequestParameters): AsyncIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(octokit.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator]
}
