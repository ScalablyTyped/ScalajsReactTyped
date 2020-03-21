package typingsJapgolly.graphql.definitionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLInterfaceTypeConfi
import typingsJapgolly.graphql.astMod.InterfaceTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InterfaceTypeExtensionNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInterfaceType")
@js.native
class GraphQLInterfaceType protected ()
  extends GraphQLAbstractType
     with _GraphQLCompositeType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLOutputType
     with _GraphQLType {
  def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]] = js.native
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]] = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInterfaceTypeConfi = js.native
  def toJSON(): String = js.native
}

