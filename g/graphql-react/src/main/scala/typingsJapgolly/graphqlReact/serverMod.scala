package typingsJapgolly.graphqlReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.graphqlReact.mod.GraphQL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def ssr(graphql: GraphQL, node: Element): js.Promise[String] = js.native
  def ssr(graphql: GraphQL, node: Element, render: js.Function1[/* element */ Element, String]): js.Promise[String] = js.native
}

