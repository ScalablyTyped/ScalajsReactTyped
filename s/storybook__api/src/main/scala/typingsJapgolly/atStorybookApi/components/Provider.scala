package typingsJapgolly.atStorybookApi.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.NavigateFn
import typingsJapgolly.atStorybookApi.WindowLocation
import typingsJapgolly.atStorybookApi.atStorybookApiMod.Combo
import typingsJapgolly.atStorybookApi.atStorybookApiMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply(
    docsMode: Boolean,
    provider: typingsJapgolly.atStorybookApi.distInitDashProviderDashApiMod.Provider,
    default: js.UndefOr[Boolean] = js.undefined,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    path: String = null,
    storyId: String = null,
    uri: String = null,
    viewMode: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: (Component[js.Object, js.Object]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object]])
  ): UnmountedWithRoot[Props, typingsJapgolly.atStorybookApi.atStorybookApiMod.Provider, Unit, Props] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], docsMode = docsMode.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
  
      if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.atStorybookApi.atStorybookApiMod.Provider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookApi.atStorybookApiMod.Props])
  }
  @JSImport("@storybook/api", "Provider")
  @js.native
  object componentImport extends js.Object
  
}

