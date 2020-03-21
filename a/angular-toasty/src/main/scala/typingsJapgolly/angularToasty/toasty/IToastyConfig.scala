package typingsJapgolly.angularToasty.toasty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastyConfig extends js.Object {
  /**
    * Whether clicking the toast closes it.
    */
  var clickToClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether HTML is allowed in toasts.
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /**
    * The toast's message.
    */
  var msg: js.UndefOr[String] = js.undefined
  /**
    * Add event handler.
    */
  var onAdd: js.UndefOr[js.Function] = js.undefined
  /**
    * Click event handler.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Remove event handler.
    */
  var onRemove: js.UndefOr[js.Function] = js.undefined
  /**
    * Whether to shake the toasts.
    */
  var shake: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the 'X' icon to close the toast.
    */
  var showClose: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to play a sound when a toast is added.
    */
  var sound: js.UndefOr[Boolean] = js.undefined
  /**
    * What theme to use.
    * - 'default'
    * - 'material'
    * - 'bootstrap'
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * How long (in milliseconds) the toast shows before it's removed. Set to false to disable.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * The toast's title.
    */
  var title: String
  /**
    * The toast's type:
    * - 'default'
    * - 'info'
    * - 'success'
    * - 'wait'
    * - 'error'
    * - 'warning'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IToastyConfig {
  @scala.inline
  def apply(
    title: String,
    clickToClose: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    msg: String = null,
    onAdd: js.Function = null,
    onClick: js.Function = null,
    onRemove: js.Function = null,
    shake: js.UndefOr[Boolean] = js.undefined,
    showClose: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    timeout: Int | Double = null,
    `type`: String = null
  ): IToastyConfig = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToClose)) __obj.updateDynamic("clickToClose")(clickToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(shake)) __obj.updateDynamic("shake")(shake.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastyConfig]
  }
}

