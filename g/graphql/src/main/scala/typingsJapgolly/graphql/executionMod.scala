package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.executeMod.ExecutionArgs
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.pathMod.Path
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution", JSImport.Namespace)
@js.native
object executionMod extends js.Object {
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: AnonDirectives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: AnonDirectives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def responsePathAsArray(path: Path): js.Array[String | Double] = js.native
}

