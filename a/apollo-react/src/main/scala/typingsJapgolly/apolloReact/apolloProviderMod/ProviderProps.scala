package typingsJapgolly.apolloReact.apolloProviderMod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var client: typingsJapgolly.apolloClient.mod.default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ]
  var immutable: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[Store[_, AnyAction]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    client: typingsJapgolly.apolloClient.mod.default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ],
    immutable: js.UndefOr[Boolean] = js.undefined,
    store: Store[_, AnyAction] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
}

