package typingsJapgolly.graphqlQueryComplexity.queryComplexityMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.astMod.FragmentDefinitionNode
import typingsJapgolly.graphql.astMod.InlineFragmentNode
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphql.mod.GraphQLInterfaceType
import typingsJapgolly.graphql.mod.GraphQLObjectType
import typingsJapgolly.graphql.mod.GraphQLUnionType
import typingsJapgolly.graphql.mod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexity extends js.Object {
  var OperationDefinition: js.Object = js.native
  var complexity: Double = js.native
  var context: ValidationContext = js.native
  var estimators: js.Array[ComplexityEstimator] = js.native
  var options: QueryComplexityOptions = js.native
  def createError(): GraphQLError = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]], complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: FragmentDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: InlineFragmentNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLObjectType[_, _, StringDictionary[_]]): Double = js.native
  def nodeComplexity(
    node: OperationDefinitionNode,
    typeDef: GraphQLObjectType[_, _, StringDictionary[_]],
    complexity: Double
  ): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def onOperationDefinitionEnter(operation: OperationDefinitionNode): Unit = js.native
  def onOperationDefinitionLeave(): js.UndefOr[GraphQLError] = js.native
}

