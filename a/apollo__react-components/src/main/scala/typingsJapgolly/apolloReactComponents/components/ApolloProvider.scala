package typingsJapgolly.apolloReactComponents.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloProvider {
  def apply(
    client: default[js.Any],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | js.Array[Node] = null
  ): UnmountedSimple[
    ApolloProviderProps[js.Any], 
    MountedWithRawType[
      ApolloProviderProps[js.Any], 
      js.Object, 
      RawMounted[ApolloProviderProps[js.Any], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps[js.Any], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.apolloReactCommon.apolloProviderMod.ApolloProviderProps[js.Any]])
  }
  @JSImport("@apollo/react-components", "ApolloProvider")
  @js.native
  object componentImport extends js.Object
  
}

