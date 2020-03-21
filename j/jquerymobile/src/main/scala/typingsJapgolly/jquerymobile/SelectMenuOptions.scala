package typingsJapgolly.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuOptions extends js.Object {
  var corners: js.UndefOr[Boolean] = js.undefined
  var hidePlaceholderMenuItems: Boolean
  var icon: js.UndefOr[String] = js.undefined
  var iconpos: js.UndefOr[String] = js.undefined
  var iconshadow: js.UndefOr[Boolean] = js.undefined
  var initSelector: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var mini: js.UndefOr[Boolean] = js.undefined
  var nativeMenu: js.UndefOr[Boolean] = js.undefined
  var overlayTheme: js.UndefOr[String] = js.undefined
  var preventFocusZoom: js.UndefOr[Boolean] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    hidePlaceholderMenuItems: Boolean,
    corners: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    iconpos: String = null,
    iconshadow: js.UndefOr[Boolean] = js.undefined,
    initSelector: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    nativeMenu: js.UndefOr[Boolean] = js.undefined,
    overlayTheme: String = null,
    preventFocusZoom: js.UndefOr[Boolean] = js.undefined,
    shadow: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal(hidePlaceholderMenuItems = hidePlaceholderMenuItems.asInstanceOf[js.Any])
    if (!js.isUndefined(corners)) __obj.updateDynamic("corners")(corners.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconpos != null) __obj.updateDynamic("iconpos")(iconpos.asInstanceOf[js.Any])
    if (!js.isUndefined(iconshadow)) __obj.updateDynamic("iconshadow")(iconshadow.asInstanceOf[js.Any])
    if (initSelector != null) __obj.updateDynamic("initSelector")(initSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(mini)) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeMenu)) __obj.updateDynamic("nativeMenu")(nativeMenu.asInstanceOf[js.Any])
    if (overlayTheme != null) __obj.updateDynamic("overlayTheme")(overlayTheme.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusZoom)) __obj.updateDynamic("preventFocusZoom")(preventFocusZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

