package typingsJapgolly.apolloReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloReact.apolloProviderMod.ProviderProps
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloProvider {
  def apply(
    client: default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ],
    immutable: js.UndefOr[Boolean] = js.undefined,
    store: Store[_, AnyAction] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProviderProps, 
    typingsJapgolly.apolloReact.apolloProviderMod.default, 
    Unit, 
    ProviderProps
  ] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
      if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.apolloReact.apolloProviderMod.ProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.apolloReact.apolloProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.apolloReact.apolloProviderMod.ProviderProps])(children: _*)
  }
  @JSImport("apollo-react/lib/ApolloProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

