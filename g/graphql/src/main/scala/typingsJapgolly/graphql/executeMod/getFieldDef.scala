package typingsJapgolly.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLField
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "getFieldDef")
@js.native
object getFieldDef extends js.Object {
  def apply(schema: GraphQLSchema, parentType: GraphQLObjectType[_, _, StringDictionary[_]], fieldName: String): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
}

