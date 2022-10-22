package typingsJapgolly.graphqlReact

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.graphqlReact.anon.Cache
import typingsJapgolly.graphqlReact.anon.LoadOnMount
import typingsJapgolly.graphqlReact.mod.GraphQLOperationStatus
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object universalMod {
  
  @JSImport("graphql-react/universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("graphql-react/universal", "GraphQL")
  @js.native
  open class GraphQL ()
    extends typingsJapgolly.graphqlReact.mod.GraphQL {
    def this(options: Cache) = this()
  }
  
  @JSImport("graphql-react/universal", "GraphQLContext")
  @js.native
  val GraphQLContext: Context[typingsJapgolly.graphqlReact.mod.GraphQL] = js.native
  
  inline def reportCacheErrors(event: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportCacheErrors")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ssr(grapphql: typingsJapgolly.graphqlReact.mod.GraphQL, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(grapphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ssr(
    grapphql: typingsJapgolly.graphqlReact.mod.GraphQL,
    node: Node,
    render: js.Function1[/* element */ Node, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(grapphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraphQL")(options.asInstanceOf[js.Any]).asInstanceOf[GraphQLOperationStatus[T]]
}
