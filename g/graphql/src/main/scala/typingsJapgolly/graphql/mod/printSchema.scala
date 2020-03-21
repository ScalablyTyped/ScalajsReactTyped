package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.schemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema): String = js.native
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, options: Options): String = js.native
}

