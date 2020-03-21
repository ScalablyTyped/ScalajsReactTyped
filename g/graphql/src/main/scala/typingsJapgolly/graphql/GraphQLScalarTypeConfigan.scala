package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.ScalarTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ScalarTypeExtensionNode
import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.definitionMod.GraphQLScalarLiteralParser
import typingsJapgolly.graphql.definitionMod.GraphQLScalarSerializer
import typingsJapgolly.graphql.definitionMod.GraphQLScalarValueParser
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLScalarTypeConfig<any, any> & {  serialize  :graphql.graphql/type/definition.GraphQLScalarSerializer<any>,   parseValue  :graphql.graphql/type/definition.GraphQLScalarValueParser<any>,   parseLiteral  :graphql.graphql/type/definition.GraphQLScalarLiteralParser<any>,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.ScalarTypeExtensionNode>} */
@js.native
trait GraphQLScalarTypeConfigan extends js.Object {
  var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]] with js.Array[ScalarTypeExtensionNode]] = js.native
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.native
  var name: String = js.native
  // Parses an externally provided literal value to use as an input.
  @JSName("parseLiteral")
  var parseLiteral_Original: js.UndefOr[GraphQLScalarLiteralParser[_]] = js.native
  // Parses an externally provided value to use as an input.
  @JSName("parseValue")
  var parseValue_Original: js.UndefOr[GraphQLScalarValueParser[_]] = js.native
  // Serializes an internal value to include in a response.
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  // Serializes an internal value to include in a response.
  def serialize(value: js.Any): Maybe[_] = js.native
}

