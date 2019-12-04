package typingsJapgolly.atStorybookApi.distStoreMod

import typingsJapgolly.atReachRouter.atReachRouterMod.NavigateFn
import typingsJapgolly.atStorybookApi.VersionsUnknownEntries
import typingsJapgolly.atStorybookApi.WindowLocation
import typingsJapgolly.atStorybookApi.distModulesLayoutMod.Layout
import typingsJapgolly.atStorybookApi.distModulesLayoutMod.UI
import typingsJapgolly.atStorybookApi.distModulesNotificationsMod.Notification
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Shortcuts
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.StoriesHash
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.StoryId
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.ViewMode
import typingsJapgolly.atStorybookApi.distModulesUrlMod.QueryParams
import typingsJapgolly.atStorybookTheming.distTypesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/api.@storybook/api.State> */
trait Patch extends js.Object {
  var customQueryParams: js.UndefOr[QueryParams] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var dismissedVersionNotification: js.UndefOr[String] = js.undefined
  var lastVersionCheck: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[Layout] = js.undefined
  var location: js.UndefOr[WindowLocation] = js.undefined
  var navigate: js.UndefOr[NavigateFn] = js.undefined
  var notifications: js.UndefOr[js.Array[Notification]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var selectedPanel: js.UndefOr[String] = js.undefined
  var shortcuts: js.UndefOr[Shortcuts] = js.undefined
  var storiesConfigured: js.UndefOr[Boolean] = js.undefined
  var storiesHash: js.UndefOr[StoriesHash] = js.undefined
  var storyId: js.UndefOr[StoryId] = js.undefined
  var theme: js.UndefOr[ThemeVars] = js.undefined
  var ui: js.UndefOr[UI] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var versions: js.UndefOr[VersionsUnknownEntries] = js.undefined
  var viewMode: js.UndefOr[ViewMode] = js.undefined
}

object Patch {
  @scala.inline
  def apply(
    customQueryParams: QueryParams = null,
    default: js.UndefOr[Boolean] = js.undefined,
    dismissedVersionNotification: String = null,
    lastVersionCheck: Int | Double = null,
    layout: Layout = null,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    notifications: js.Array[Notification] = null,
    path: String = null,
    selectedPanel: String = null,
    shortcuts: Shortcuts = null,
    storiesConfigured: js.UndefOr[Boolean] = js.undefined,
    storiesHash: StoriesHash = null,
    storyId: StoryId = null,
    theme: ThemeVars = null,
    ui: UI = null,
    uri: String = null,
    versions: VersionsUnknownEntries = null,
    viewMode: ViewMode = null
  ): Patch = {
    val __obj = js.Dynamic.literal()
    if (customQueryParams != null) __obj.updateDynamic("customQueryParams")(customQueryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dismissedVersionNotification != null) __obj.updateDynamic("dismissedVersionNotification")(dismissedVersionNotification.asInstanceOf[js.Any])
    if (lastVersionCheck != null) __obj.updateDynamic("lastVersionCheck")(lastVersionCheck.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(storiesConfigured)) __obj.updateDynamic("storiesConfigured")(storiesConfigured.asInstanceOf[js.Any])
    if (storiesHash != null) __obj.updateDynamic("storiesHash")(storiesHash.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
}

