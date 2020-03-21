package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLList
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.interfacesMod.IMockOptions
import typingsJapgolly.graphqlTools.interfacesMod.IMockServer
import typingsJapgolly.graphqlTools.interfacesMod.IMockTypeFn
import typingsJapgolly.graphqlTools.interfacesMod.IMocks
import typingsJapgolly.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/mock", JSImport.Namespace)
@js.native
object mockMod extends js.Object {
  @js.native
  class MockList protected () extends js.Object {
    def this(len: js.Array[Double]) = this()
    def this(len: Double) = this()
    def this(len: js.Array[Double], wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    def this(len: Double, wrappedFunction: GraphQLFieldResolver[_, _, StringDictionary[_]]) = this()
    var len: js.Any = js.native
    var randint: js.Any = js.native
    var wrappedFunction: js.Any = js.native
    def mock(
      root: js.Any,
      args: StringDictionary[js.Any],
      context: js.Any,
      info: GraphQLResolveInfo,
      fieldType: GraphQLList[_],
      mockTypeFunc: IMockTypeFn
    ): js.Array[_] = js.native
  }
  
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): Unit = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}

