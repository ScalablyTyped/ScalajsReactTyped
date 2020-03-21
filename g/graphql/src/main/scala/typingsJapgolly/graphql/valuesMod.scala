package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DirectiveNode
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.VariableDefinitionNode
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", JSImport.Namespace)
@js.native
object valuesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphql.AnonErrors
    - typingsJapgolly.graphql.AnonCoerced
  */
  trait CoercedVariableValues extends js.Object
  
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: DirectiveNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: DirectiveNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLField[_, _, StringDictionary[_]], node: FieldNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(
    `def`: GraphQLField[_, _, StringDictionary[_]],
    node: FieldNode,
    variableValues: Maybe[StringDictionary[_]]
  ): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: DirectiveNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode): StringDictionary[js.Any] = js.native
  def getArgumentValues(`def`: GraphQLDirective, node: FieldNode, variableValues: Maybe[StringDictionary[_]]): StringDictionary[js.Any] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: AnonDirectives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: AnonDirectives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any]
  ): CoercedVariableValues = js.native
  def getVariableValues(
    schema: GraphQLSchema,
    varDefNodes: js.Array[VariableDefinitionNode],
    inputs: StringDictionary[js.Any],
    options: AnonMaxErrors
  ): CoercedVariableValues = js.native
}

