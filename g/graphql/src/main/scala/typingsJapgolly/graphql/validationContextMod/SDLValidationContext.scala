package typingsJapgolly.graphql.validationContextMod

import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "SDLValidationContext")
@js.native
class SDLValidationContext protected () extends ASTValidationContext {
  def this(ast: DocumentNode, schema: Maybe[GraphQLSchema]) = this()
  def this(
    ast: DocumentNode,
    schema: Maybe[GraphQLSchema],
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getSchema(): Maybe[GraphQLSchema] = js.native
}

