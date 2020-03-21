package typingsJapgolly.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "createSourceEventStream")
@js.native
object createSourceEventStream extends js.Object {
  def apply[TData](schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
}

