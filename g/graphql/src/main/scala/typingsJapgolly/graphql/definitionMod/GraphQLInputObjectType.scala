package typingsJapgolly.graphql.definitionMod

import typingsJapgolly.graphql.GraphQLInputObjectTypeCon
import typingsJapgolly.graphql.astMod.InputObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InputObjectTypeExtensionNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLType {
  def this(config: GraphQLInputObjectTypeConfig) = this()
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInputObjectTypeCon = js.native
  def toJSON(): String = js.native
}

