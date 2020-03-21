package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/addSchemaLevelResolveFunction", JSImport.Namespace)
@js.native
object addSchemaLevelResolveFunctionMod extends js.Object {
  def default(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
}

