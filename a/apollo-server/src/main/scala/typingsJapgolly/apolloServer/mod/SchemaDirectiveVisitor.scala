package typingsJapgolly.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLDirective
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.AnonArgs
import typingsJapgolly.graphqlTools.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends typingsJapgolly.apolloServer.exportsMod.SchemaDirectiveVisitor {
  protected def this(config: AnonArgs) = this()
}

/* static members */
@JSImport("apollo-server", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[js.Array[typingsJapgolly.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[typingsJapgolly.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}

