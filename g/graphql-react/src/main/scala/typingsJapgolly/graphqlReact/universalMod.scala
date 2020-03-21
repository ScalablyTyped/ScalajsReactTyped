package typingsJapgolly.graphqlReact

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.graphqlReact.mod.GraphQLOperationStatus
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  @js.native
  class GraphQL ()
    extends typingsJapgolly.graphqlReact.mod.GraphQL {
    def this(options: AnonCache) = this()
  }
  
  val GraphQLContext: Context[typingsJapgolly.graphqlReact.mod.GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: typingsJapgolly.graphqlReact.mod.GraphQL, node: Node): Unit = js.native
  def ssr(
    grapphql: typingsJapgolly.graphqlReact.mod.GraphQL,
    node: Node,
    render: js.Function1[/* element */ Node, String]
  ): Unit = js.native
  def useGraphQL[T, V](options: AnonLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

