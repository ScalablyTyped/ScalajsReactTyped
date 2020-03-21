package typingsJapgolly.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLObjectType
import typingsJapgolly.graphql.mod.GraphQLScalarType
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/info", JSImport.Namespace)
@js.native
object infoMod extends js.Object {
  def addPath(prev: js.Any, key: js.Any): AnonKey = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: String): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: DocumentNode): GraphQLResolveInfo = js.native
  def buildInfo(rootFieldName: String, operation: Operation, schema: GraphQLSchema, info: GraphQLResolveInfo): GraphQLResolveInfo = js.native
  def buildInfoForAllScalars(rootFieldName: String, schema: GraphQLSchema, operation: Operation): GraphQLResolveInfo = js.native
  def buildInfoFromFragment(rootFieldName: String, schema: GraphQLSchema, operation: Operation, query: String): GraphQLResolveInfo = js.native
  def getDeepType(`type`: GraphQLOutputType): (GraphQLObjectType[_, _, StringDictionary[_]]) | GraphQLScalarType = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String): GraphQLResolveInfo | Null = js.native
  def makeSubInfo(info: GraphQLResolveInfo, path: String, fragment: String): GraphQLResolveInfo | Null = js.native
}

