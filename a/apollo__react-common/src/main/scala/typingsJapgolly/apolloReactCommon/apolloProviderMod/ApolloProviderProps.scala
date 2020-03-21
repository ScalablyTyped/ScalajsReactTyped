package typingsJapgolly.apolloReactCommon.apolloProviderMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloProviderProps[TCache] extends js.Object {
  var children: Node | js.Array[Node] | Null
  var client: default[TCache]
}

object ApolloProviderProps {
  @scala.inline
  def apply[TCache](client: default[TCache], children: Node | js.Array[Node] = null): ApolloProviderProps[TCache] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloProviderProps[TCache]]
  }
}

