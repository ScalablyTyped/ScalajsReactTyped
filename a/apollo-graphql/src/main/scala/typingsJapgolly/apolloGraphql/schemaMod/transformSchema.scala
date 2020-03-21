package typingsJapgolly.apolloGraphql.schemaMod

import typingsJapgolly.apolloGraphql.transformSchemaMod.TypeTransformer
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(schema: GraphQLSchema, transformType: TypeTransformer): GraphQLSchema = js.native
}

