package typingsJapgolly.graphqlReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.graphqlReact.mod.GraphQL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("graphql-react/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ssr(graphql: GraphQL, node: Element): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(graphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def ssr(graphql: GraphQL, node: Element, render: js.Function1[/* element */ Element, String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(graphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
