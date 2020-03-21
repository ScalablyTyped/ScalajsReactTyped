package typingsJapgolly.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "buildExecutionContext")
@js.native
object buildExecutionContext extends js.Object {
  def apply(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Array[GraphQLError] | ExecutionContext = js.native
  def apply(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]],
    typeResolver: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  ): js.Array[GraphQLError] | ExecutionContext = js.native
}

