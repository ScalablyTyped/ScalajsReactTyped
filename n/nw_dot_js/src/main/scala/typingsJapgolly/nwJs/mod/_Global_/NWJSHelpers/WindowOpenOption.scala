package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOpenOption extends WindowOption {
  /**
    * (Optional) The script to be injected before document unloaded.
    */
  var inject_js_end: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The script to be injected before document loaded.
    */
  var inject_js_start: js.UndefOr[String] = js.undefined
  /**
    * (Optional) Whether to open a new window in a separate render process.
    */
  var new_instance: js.UndefOr[Boolean] = js.undefined
}

object WindowOpenOption {
  @scala.inline
  def apply(
    always_on_top: js.UndefOr[Boolean] = js.undefined,
    as_desktop: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icon: String = null,
    id: String = null,
    inject_js_end: String = null,
    inject_js_start: String = null,
    kiosk: js.UndefOr[Boolean] = js.undefined,
    max_height: Int | Double = null,
    max_width: Int | Double = null,
    min_height: Int | Double = null,
    min_width: Int | Double = null,
    new_instance: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    show_in_taskbar: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible_on_all_workspaces: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): WindowOpenOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_on_top)) __obj.updateDynamic("always_on_top")(always_on_top.asInstanceOf[js.Any])
    if (!js.isUndefined(as_desktop)) __obj.updateDynamic("as_desktop")(as_desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inject_js_end != null) __obj.updateDynamic("inject_js_end")(inject_js_end.asInstanceOf[js.Any])
    if (inject_js_start != null) __obj.updateDynamic("inject_js_start")(inject_js_start.asInstanceOf[js.Any])
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk.asInstanceOf[js.Any])
    if (max_height != null) __obj.updateDynamic("max_height")(max_height.asInstanceOf[js.Any])
    if (max_width != null) __obj.updateDynamic("max_width")(max_width.asInstanceOf[js.Any])
    if (min_height != null) __obj.updateDynamic("min_height")(min_height.asInstanceOf[js.Any])
    if (min_width != null) __obj.updateDynamic("min_width")(min_width.asInstanceOf[js.Any])
    if (!js.isUndefined(new_instance)) __obj.updateDynamic("new_instance")(new_instance.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(show_in_taskbar)) __obj.updateDynamic("show_in_taskbar")(show_in_taskbar.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible_on_all_workspaces)) __obj.updateDynamic("visible_on_all_workspaces")(visible_on_all_workspaces.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenOption]
  }
}

