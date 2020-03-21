package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLObjectType
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import typingsJapgolly.graphqlTools.interfacesMod.Operation
import typingsJapgolly.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/resolvers", JSImport.Namespace)
@js.native
object resolversMod extends js.Object {
  def generateMappingFromObjectType(`type`: GraphQLObjectType[_, _, StringDictionary[_]], operation: Operation): StringDictionary[AnonName] = js.native
  def generateProxyingResolvers(targetSchema: GraphQLSchema, transforms: js.Array[Transform], mapping: Mapping): IResolvers[_, _] = js.native
  def generateSimpleMapping(targetSchema: GraphQLSchema): Mapping = js.native
  type Mapping = StringDictionary[StringDictionary[AnonName]]
}

