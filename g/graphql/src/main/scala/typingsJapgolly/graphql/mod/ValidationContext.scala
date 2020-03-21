package typingsJapgolly.graphql.mod

import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "ValidationContext")
@js.native
class ValidationContext protected ()
  extends typingsJapgolly.graphql.validationMod.ValidationContext {
  def this(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo
  ) = this()
  def this(
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    ast: DocumentNode,
    typeInfo: typingsJapgolly.graphql.typeInfoMod.TypeInfo,
    onError: js.Function1[/* err */ typingsJapgolly.graphql.graphQLErrorMod.GraphQLError, Unit]
  ) = this()
}

