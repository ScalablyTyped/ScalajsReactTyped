package typingsJapgolly.graphqlTools

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IDirectiveResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/attachDirectiveResolvers", JSImport.Namespace)
@js.native
object attachDirectiveResolversMod extends js.Object {
  def default(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): Unit = js.native
}

