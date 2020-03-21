package typingsJapgolly.graphqlTools

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLSchemaConfigtypesA
import typingsJapgolly.graphql.astMod.SchemaDefinitionNode
import typingsJapgolly.graphql.astMod.SchemaExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchemaConfig
import typingsJapgolly.graphql.schemaMod.TypeMap
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLSchema & {  transforms  :std.Array<graphql-tools.graphql-tools/dist/transforms/transforms.Transform>} */
trait GraphQLSchematransformsAr extends js.Object {
  var astNode: Maybe[SchemaDefinitionNode]
  var extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var transforms: js.Array[Transform]
  def getDirective(name: String): Maybe[GraphQLDirective]
  def getDirectives(): js.Array[GraphQLDirective]
  def getMutationType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getPossibleTypes(abstractType: GraphQLAbstractType): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getQueryType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getSubscriptionType(): Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  def getType(name: String): Maybe[GraphQLNamedType]
  def getTypeMap(): TypeMap
  def isPossibleType(abstractType: GraphQLAbstractType, possibleType: GraphQLObjectType[_, _, StringDictionary[_]]): Boolean
  def toConfig(): GraphQLSchemaConfigtypesA
}

object GraphQLSchematransformsAr {
  @scala.inline
  def apply(
    getDirective: String => CallbackTo[Maybe[GraphQLDirective]],
    getDirectives: CallbackTo[js.Array[GraphQLDirective]],
    getMutationType: CallbackTo[Maybe[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]]],
    getPossibleTypes: GraphQLAbstractType => CallbackTo[js.Array[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]]],
    getQueryType: CallbackTo[Maybe[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]]],
    getSubscriptionType: CallbackTo[Maybe[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]]],
    getType: String => CallbackTo[Maybe[GraphQLNamedType]],
    getTypeMap: CallbackTo[TypeMap],
    isPossibleType: (GraphQLAbstractType, GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) => CallbackTo[Boolean],
    toConfig: CallbackTo[GraphQLSchemaConfigtypesA],
    transforms: js.Array[Transform],
    astNode: Maybe[SchemaDefinitionNode] = null,
    extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLSchematransformsAr = {
    val __obj = js.Dynamic.literal(transforms = transforms.asInstanceOf[js.Any])
    __obj.updateDynamic("getDirective")(js.Any.fromFunction1((t0: java.lang.String) => getDirective(t0).runNow()))
    __obj.updateDynamic("getDirectives")(getDirectives.toJsFn)
    __obj.updateDynamic("getMutationType")(getMutationType.toJsFn)
    __obj.updateDynamic("getPossibleTypes")(js.Any.fromFunction1((t0: typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => getPossibleTypes(t0).runNow()))
    __obj.updateDynamic("getQueryType")(getQueryType.toJsFn)
    __obj.updateDynamic("getSubscriptionType")(getSubscriptionType.toJsFn)
    __obj.updateDynamic("getType")(js.Any.fromFunction1((t0: java.lang.String) => getType(t0).runNow()))
    __obj.updateDynamic("getTypeMap")(getTypeMap.toJsFn)
    __obj.updateDynamic("isPossibleType")(js.Any.fromFunction2((t0: typingsJapgolly.graphql.definitionMod.GraphQLAbstractType, t1: typingsJapgolly.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) => isPossibleType(t0, t1).runNow()))
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchematransformsAr]
  }
}

