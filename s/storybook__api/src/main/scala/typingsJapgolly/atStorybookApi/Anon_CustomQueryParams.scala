package typingsJapgolly.atStorybookApi

import typingsJapgolly.atReachRouter.atReachRouterMod.NavigateFn
import typingsJapgolly.atStorybookApi.distModulesLayoutMod.Layout
import typingsJapgolly.atStorybookApi.distModulesLayoutMod.UI
import typingsJapgolly.atStorybookApi.distModulesNotificationsMod.Notification
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.StoriesHash
import typingsJapgolly.atStorybookApi.distModulesUrlMod.QueryParams
import typingsJapgolly.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomQueryParams extends js.Object {
  var customQueryParams: QueryParams
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: String
  var lastVersionCheck: Double
  var layout: Layout
  var location: WindowLocation
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var notifications: js.Array[Notification]
  var path: String
  var selectedPanel: String
  var shortcuts: Shortcuts
  var storiesConfigured: Boolean
  var storiesHash: StoriesHash
  var storyId: String
  var theme: ThemeVars
  var ui: UI
  var uri: js.UndefOr[String] = js.undefined
  var versions: VersionsUnknownEntries
  var viewMode: String
}

object Anon_CustomQueryParams {
  @scala.inline
  def apply(
    customQueryParams: QueryParams,
    dismissedVersionNotification: String,
    lastVersionCheck: Double,
    layout: Layout,
    location: WindowLocation,
    notifications: js.Array[Notification],
    path: String,
    selectedPanel: String,
    shortcuts: Shortcuts,
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: String,
    theme: ThemeVars,
    ui: UI,
    versions: VersionsUnknownEntries,
    viewMode: String,
    default: js.UndefOr[Boolean] = js.undefined,
    navigate: NavigateFn = null,
    uri: String = null
  ): Anon_CustomQueryParams = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], dismissedVersionNotification = dismissedVersionNotification.asInstanceOf[js.Any], lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomQueryParams]
  }
}

