package typingsJapgolly.apolloGraphql.buildSchemaFromSDLMod

import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/buildSchemaFromSDL", "modulesFromSDL")
@js.native
object modulesFromSDL extends js.Object {
  def apply(modulesOrSDL: js.Array[GraphQLSchemaModule | DocumentNode]): js.Array[GraphQLSchemaModule] = js.native
  def apply(modulesOrSDL: DocumentNode): js.Array[GraphQLSchemaModule] = js.native
}

