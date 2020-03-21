package typingsJapgolly.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.astMod.OperationTypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationRootType")
@js.native
object getOperationRootType extends js.Object {
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def apply(schema: typingsJapgolly.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
}

