package typingsJapgolly.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLUnionTypeConfigany
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLUnionType")
@js.native
class GraphQLUnionType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  var astNode: Maybe[UnionTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLUnionTypeConfigany = js.native
  def toJSON(): String = js.native
}

