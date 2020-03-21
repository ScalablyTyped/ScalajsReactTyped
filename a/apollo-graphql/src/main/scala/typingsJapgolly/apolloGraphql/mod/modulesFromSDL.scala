package typingsJapgolly.apolloGraphql.mod

import typingsJapgolly.apolloGraphql.buildSchemaFromSDLMod.GraphQLSchemaModule
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "modulesFromSDL")
@js.native
object modulesFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
  def apply(modulesOrSDL: DocumentNode): js.Array[GraphQLSchemaModule] = js.native
}

