package typingsJapgolly.graphqlTools.interfacesMod

import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeWithResolvers extends js.Object {
  var resolvers: js.UndefOr[IResolvers[_, _]] = js.undefined
  var `type`: GraphQLNamedType
}

object TypeWithResolvers {
  @scala.inline
  def apply(`type`: GraphQLNamedType, resolvers: IResolvers[_, _] = null): TypeWithResolvers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeWithResolvers]
  }
}

