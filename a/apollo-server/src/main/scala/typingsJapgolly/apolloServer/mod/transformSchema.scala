package typingsJapgolly.apolloServer.mod

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.GraphQLSchematransformsAr
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

