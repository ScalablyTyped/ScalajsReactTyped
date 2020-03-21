package typingsJapgolly.apolloReactCommon.apolloConsumerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloConsumerProps extends js.Object {
  def children(client: default[js.Object]): ReactChild | Null
}

object ApolloConsumerProps {
  @scala.inline
  def apply(children: default[js.Object] => CallbackTo[ReactChild | Null]): ApolloConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.apolloClient.mod.default[js.Object]) => children(t0).runNow()))
    __obj.asInstanceOf[ApolloConsumerProps]
  }
}

