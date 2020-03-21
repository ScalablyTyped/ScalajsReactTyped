package typingsJapgolly.apolloReact.apolloProviderMod

import typingsJapgolly.apolloReact.AnonStore
import typingsJapgolly.react.mod.Component
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider
  extends Component[ProviderProps, js.Any, js.Any] {
  var client: typingsJapgolly.apolloClient.mod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: Store[_, AnyAction] = js.native
  def getChildContext(): AnonStore = js.native
}

