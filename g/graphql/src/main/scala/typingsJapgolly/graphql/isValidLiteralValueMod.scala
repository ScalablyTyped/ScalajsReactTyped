package typingsJapgolly.graphql

import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.graphQLErrorMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/isValidLiteralValue", JSImport.Namespace)
@js.native
object isValidLiteralValueMod extends js.Object {
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[GraphQLError] = js.native
}

