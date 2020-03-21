package typingsJapgolly.graphqlTools

import typingsJapgolly.graphql.mod.GraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectTypeGraphQLInputObjectType extends js.Object {
  var objectType: GraphQLInputObjectType
}

object AnonObjectTypeGraphQLInputObjectType {
  @scala.inline
  def apply(objectType: GraphQLInputObjectType): AnonObjectTypeGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonObjectTypeGraphQLInputObjectType]
  }
}

