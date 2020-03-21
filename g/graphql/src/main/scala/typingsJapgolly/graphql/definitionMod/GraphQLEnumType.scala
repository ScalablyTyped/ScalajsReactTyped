package typingsJapgolly.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLEnumTypeConfigexte
import typingsJapgolly.graphql.astMod.EnumTypeDefinitionNode
import typingsJapgolly.graphql.astMod.EnumTypeExtensionNode
import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLEnumType")
@js.native
class GraphQLEnumType protected ()
  extends GraphQLLeafType
     with _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLEnumTypeConfig) = this()
  var astNode: Maybe[EnumTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  def getValue(name: String): Maybe[GraphQLEnumValue] = js.native
  def getValues(): js.Array[GraphQLEnumValue] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, _variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[String] = js.native
  def toConfig(): GraphQLEnumTypeConfigexte = js.native
  def toJSON(): String = js.native
}

