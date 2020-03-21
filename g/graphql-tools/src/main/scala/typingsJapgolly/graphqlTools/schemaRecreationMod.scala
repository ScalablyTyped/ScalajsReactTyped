package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLArgument
import typingsJapgolly.graphql.definitionMod.GraphQLArgumentConfig
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfig
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLInputField
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldConfig
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphql.mod.GraphQLDirective
import typingsJapgolly.graphqlTools.interfacesMod.ResolveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/schemaRecreation", JSImport.Namespace)
@js.native
object schemaRecreationMod extends js.Object {
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument], resolveType: ResolveType[_]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(argument: GraphQLArgument, resolveType: ResolveType[_]): (js.Tuple2[String, GraphQLArgumentConfig]) | Null = js.native
  def createResolveType(getType: js.Function2[/* name */ String, /* type */ GraphQLType, GraphQLType | Null]): ResolveType[_] = js.native
  def fieldMapToFieldConfigMap(
    fields: GraphQLFieldMap[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfigMap[_, _, StringDictionary[_]] = js.native
  def fieldToFieldConfig(
    field: GraphQLField[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def inputFieldMapToFieldConfigMap(fields: GraphQLInputFieldMap, resolveType: ResolveType[_]): GraphQLInputFieldConfigMap = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField, resolveType: ResolveType[_]): GraphQLInputFieldConfig = js.native
  def recreateDirective(directive: GraphQLDirective, resolveType: ResolveType[_]): GraphQLDirective = js.native
  def recreateType(`type`: GraphQLNamedType, resolveType: ResolveType[_], keepResolvers: Boolean): GraphQLNamedType = js.native
}

