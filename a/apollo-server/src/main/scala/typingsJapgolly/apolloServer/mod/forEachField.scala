package typingsJapgolly.apolloServer.mod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "forEachField")
@js.native
object forEachField extends js.Object {
  def apply(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

