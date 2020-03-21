package typingsJapgolly.graphqlTools

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/transformSchema", JSImport.Namespace)
@js.native
object transformSchemaMod extends js.Object {
  def default(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

