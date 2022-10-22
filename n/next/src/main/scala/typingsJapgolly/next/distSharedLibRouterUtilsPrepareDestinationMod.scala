package typingsJapgolly.next

import typingsJapgolly.next.anon.AppendParamsToQuery
import typingsJapgolly.next.anon.DestQuery
import typingsJapgolly.next.distLibLoadCustomRoutesMod.RouteHas
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distSharedLibRouterUtilsRouteMatcherMod.Params
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsPrepareDestinationMod {
  
  @JSImport("next/dist/shared/lib/router/utils/prepare-destination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileNonPath(value: String, params: Params): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compileNonPath")(value.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def matchHas(req: BaseNextRequest[Any], has: js.Array[RouteHas], query: Params): `false` | Params = (^.asInstanceOf[js.Dynamic].applyDynamic("matchHas")(req.asInstanceOf[js.Any], has.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[`false` | Params]
  inline def matchHas(req: IncomingMessage, has: js.Array[RouteHas], query: Params): `false` | Params = (^.asInstanceOf[js.Dynamic].applyDynamic("matchHas")(req.asInstanceOf[js.Any], has.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[`false` | Params]
  
  inline def prepareDestination(args: AppendParamsToQuery): DestQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareDestination")(args.asInstanceOf[js.Any]).asInstanceOf[DestQuery]
}
