package typingsJapgolly.apolloServerCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLDirective
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.AnonArgs
import typingsJapgolly.graphqlTools.mod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi extends Instantiable1[/* config */ AnonArgs, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsJapgolly.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsJapgolly.graphqlTools.TypeofSchemaDirectiveVisi]
  ): StringDictionary[js.Array[typingsJapgolly.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[typingsJapgolly.graphqlTools.TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typingsJapgolly.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

