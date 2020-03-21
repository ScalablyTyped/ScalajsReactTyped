package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.OperationDefinitionNode
import typingsJapgolly.graphql.astMod.OperationTypeDefinitionNode
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationRootType", JSImport.Namespace)
@js.native
object getOperationRootTypeMod extends js.Object {
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
}

