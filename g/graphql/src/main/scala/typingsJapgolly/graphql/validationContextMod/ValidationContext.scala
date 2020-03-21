package typingsJapgolly.graphql.validationContextMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLArgument
import typingsJapgolly.graphql.definitionMod.GraphQLCompositeType
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import typingsJapgolly.graphql.typeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ValidationContext")
@js.native
class ValidationContext protected () extends ASTValidationContext {
  def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
  def this(
    schema: GraphQLSchema,
    ast: DocumentNode,
    typeInfo: TypeInfo,
    onError: js.Function1[/* err */ GraphQLError, Unit]
  ) = this()
  def getArgument(): Maybe[GraphQLArgument] = js.native
  def getDirective(): Maybe[GraphQLDirective] = js.native
  def getFieldDef(): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
  def getInputType(): Maybe[GraphQLInputType] = js.native
  def getParentInputType(): Maybe[GraphQLInputType] = js.native
  def getParentType(): Maybe[GraphQLCompositeType] = js.native
  def getSchema(): GraphQLSchema = js.native
  def getType(): Maybe[GraphQLOutputType] = js.native
  def getVariableUsages(node: NodeWithSelectionSet): js.Array[VariableUsage] = js.native
}

