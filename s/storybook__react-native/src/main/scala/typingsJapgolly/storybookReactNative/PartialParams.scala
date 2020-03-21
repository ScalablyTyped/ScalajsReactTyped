package typingsJapgolly.storybookReactNative

import typingsJapgolly.storybookReactNative.previewMod.AsyncStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/react-native.@storybook/react-native/dist/preview.Params> */
trait PartialParams extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage] = js.undefined
  var disableWebsockets: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var initialSelection: js.UndefOr[js.Any] = js.undefined
  var isUIHidden: js.UndefOr[Boolean] = js.undefined
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
  var onDeviceUI: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var resetStorybook: js.UndefOr[Boolean] = js.undefined
  var secured: js.UndefOr[Boolean] = js.undefined
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
  var shouldPersistSelection: js.UndefOr[Boolean] = js.undefined
  var tabOpen: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[AnonBackgroundColor] = js.undefined
}

object PartialParams {
  @scala.inline
  def apply(
    asyncStorage: AsyncStorage = null,
    disableWebsockets: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    initialSelection: js.Any = null,
    isUIHidden: js.UndefOr[Boolean] = js.undefined,
    keyboardAvoidingViewVerticalOffset: Int | Double = null,
    onDeviceUI: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    query: String = null,
    resetStorybook: js.UndefOr[Boolean] = js.undefined,
    secured: js.UndefOr[Boolean] = js.undefined,
    shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined,
    shouldPersistSelection: js.UndefOr[Boolean] = js.undefined,
    tabOpen: Int | Double = null,
    theme: AnonBackgroundColor = null
  ): PartialParams = {
    val __obj = js.Dynamic.literal()
    if (asyncStorage != null) __obj.updateDynamic("asyncStorage")(asyncStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebsockets)) __obj.updateDynamic("disableWebsockets")(disableWebsockets.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (initialSelection != null) __obj.updateDynamic("initialSelection")(initialSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(isUIHidden)) __obj.updateDynamic("isUIHidden")(isUIHidden.asInstanceOf[js.Any])
    if (keyboardAvoidingViewVerticalOffset != null) __obj.updateDynamic("keyboardAvoidingViewVerticalOffset")(keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(onDeviceUI)) __obj.updateDynamic("onDeviceUI")(onDeviceUI.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetStorybook)) __obj.updateDynamic("resetStorybook")(resetStorybook.asInstanceOf[js.Any])
    if (!js.isUndefined(secured)) __obj.updateDynamic("secured")(secured.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDisableKeyboardAvoidingView)) __obj.updateDynamic("shouldDisableKeyboardAvoidingView")(shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldPersistSelection)) __obj.updateDynamic("shouldPersistSelection")(shouldPersistSelection.asInstanceOf[js.Any])
    if (tabOpen != null) __obj.updateDynamic("tabOpen")(tabOpen.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParams]
  }
}

