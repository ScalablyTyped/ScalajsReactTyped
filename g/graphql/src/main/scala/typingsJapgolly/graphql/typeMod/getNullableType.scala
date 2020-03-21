package typingsJapgolly.graphql.typeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLNullableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "getNullableType")
@js.native
object getNullableType extends js.Object {
  def apply(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def apply(`type`: typingsJapgolly.graphql.definitionMod.GraphQLEnumType): typingsJapgolly.graphql.definitionMod.GraphQLEnumType = js.native
  def apply(`type`: typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType): typingsJapgolly.graphql.definitionMod.GraphQLInputObjectType = js.native
  def apply(`type`: typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType): typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType = js.native
  def apply(`type`: typingsJapgolly.graphql.definitionMod.GraphQLScalarType): typingsJapgolly.graphql.definitionMod.GraphQLScalarType = js.native
  def apply(`type`: typingsJapgolly.graphql.definitionMod.GraphQLUnionType): typingsJapgolly.graphql.definitionMod.GraphQLUnionType = js.native
  def apply[T /* <: (typingsJapgolly.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typingsJapgolly.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def apply[T /* <: GraphQLNullableType */](`type`: typingsJapgolly.graphql.definitionMod.GraphQLNonNull[T]): T = js.native
}

