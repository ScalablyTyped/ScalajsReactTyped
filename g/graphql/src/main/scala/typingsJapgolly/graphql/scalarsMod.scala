package typingsJapgolly.graphql

import typingsJapgolly.graphql.definitionMod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/scalars", JSImport.Namespace)
@js.native
object scalarsMod extends js.Object {
  val GraphQLBoolean: GraphQLScalarType = js.native
  val GraphQLFloat: GraphQLScalarType = js.native
  val GraphQLID: GraphQLScalarType = js.native
  val GraphQLInt: GraphQLScalarType = js.native
  val GraphQLString: GraphQLScalarType = js.native
  val specifiedScalarTypes: js.Array[GraphQLScalarType] = js.native
  def isSpecifiedScalarType(`type`: js.Any): Boolean = js.native
}

