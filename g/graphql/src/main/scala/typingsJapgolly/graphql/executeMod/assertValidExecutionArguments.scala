package typingsJapgolly.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "assertValidExecutionArguments")
@js.native
object assertValidExecutionArguments extends js.Object {
  def apply(schema: GraphQLSchema, document: DocumentNode, rawVariableValues: Maybe[StringDictionary[_]]): Unit = js.native
}

