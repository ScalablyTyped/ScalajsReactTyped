package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLDirective
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlTools.schemaVisitorMod.SchemaDirectiveVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSchemaDirectiveVisi extends Instantiable1[/* config */ AnonArgs, SchemaDirectiveVisitor] {
  /* protected */ def getDeclaredDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ]
  ): StringDictionary[GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: GraphQLSchema,
    directiveVisitors: StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof SchemaDirectiveVisitor */ js.Any
    ],
    context: StringDictionary[js.Any]
  ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
}

