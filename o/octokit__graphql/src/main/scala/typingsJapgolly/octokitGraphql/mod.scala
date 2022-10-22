package typingsJapgolly.octokitGraphql

import typingsJapgolly.octokitGraphql.distTypesErrorMod.ServerResponseData
import typingsJapgolly.octokitGraphql.distTypesTypesMod.GraphQlEndpointOptions
import typingsJapgolly.octokitTypes.distTypesRequestInterfaceMod.RequestInterface
import typingsJapgolly.octokitTypes.distTypesResponseHeadersMod.ResponseHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/graphql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@octokit/graphql", "GraphqlResponseError")
  @js.native
  open class GraphqlResponseError[ResponseData] protected ()
    extends typingsJapgolly.octokitGraphql.distTypesErrorMod.GraphqlResponseError[ResponseData] {
    def this(
      request: GraphQlEndpointOptions,
      headers: ResponseHeaders,
      response: ServerResponseData[ResponseData]
    ) = this()
  }
  
  @JSImport("@octokit/graphql", "graphql")
  @js.native
  val graphql: typingsJapgolly.octokitGraphql.distTypesTypesMod.graphql = js.native
  
  inline def withCustomRequest(customRequest: RequestInterface[js.Object]): typingsJapgolly.octokitGraphql.distTypesTypesMod.graphql = ^.asInstanceOf[js.Dynamic].applyDynamic("withCustomRequest")(customRequest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.octokitGraphql.distTypesTypesMod.graphql]
}
