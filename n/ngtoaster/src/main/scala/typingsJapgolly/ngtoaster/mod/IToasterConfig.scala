package typingsJapgolly.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToasterConfig extends js.Object {
  /**
    * Options include:
    * '', 'trustedHtml', 'template', 'templateWithData'
    */
  var `body-output-type`: js.UndefOr[String] = js.undefined
  var `body-template`: js.UndefOr[String] = js.undefined
  var `close-button`: js.UndefOr[Boolean] = js.undefined
  var `close-html`: js.UndefOr[String] = js.undefined
  var `icon-class`: js.UndefOr[String] = js.undefined
  var `icon-classes`: js.UndefOr[IIconClasses] = js.undefined
  /**
    * limits max number of toasts
    */
  var limit: js.UndefOr[Double] = js.undefined
  var `message-class`: js.UndefOr[String] = js.undefined
  /**
    * stop timeout on mouseover and restart timer on mouseout
    */
  var `mouseover-timer-stop`: js.UndefOr[Boolean] = js.undefined
  var `newest-on-top`: js.UndefOr[Boolean] = js.undefined
  /**
    * Options include:
    * 'toast-top-full-width', 'toast-bottom-full-width', 'toast-center',
    * 'toast-top-left', 'toast-top-center', 'toast-top-rigt',
    * 'toast-bottom-left', 'toast-bottom-center', 'toast-bottom-rigt',
    */
  var `position-class`: js.UndefOr[String] = js.undefined
  var `prevent-duplicates`: js.UndefOr[Boolean] = js.undefined
  var `tap-to-dismiss`: js.UndefOr[Boolean] = js.undefined
  var `time-out`: js.UndefOr[Double] = js.undefined
  var `title-class`: js.UndefOr[String] = js.undefined
}

object IToasterConfig {
  @scala.inline
  def apply(
    `body-output-type`: String = null,
    `body-template`: String = null,
    `close-button`: js.UndefOr[Boolean] = js.undefined,
    `close-html`: String = null,
    `icon-class`: String = null,
    `icon-classes`: IIconClasses = null,
    limit: Int | Double = null,
    `message-class`: String = null,
    `mouseover-timer-stop`: js.UndefOr[Boolean] = js.undefined,
    `newest-on-top`: js.UndefOr[Boolean] = js.undefined,
    `position-class`: String = null,
    `prevent-duplicates`: js.UndefOr[Boolean] = js.undefined,
    `tap-to-dismiss`: js.UndefOr[Boolean] = js.undefined,
    `time-out`: Int | Double = null,
    `title-class`: String = null
  ): IToasterConfig = {
    val __obj = js.Dynamic.literal()
    if (`body-output-type` != null) __obj.updateDynamic("body-output-type")(`body-output-type`.asInstanceOf[js.Any])
    if (`body-template` != null) __obj.updateDynamic("body-template")(`body-template`.asInstanceOf[js.Any])
    if (!js.isUndefined(`close-button`)) __obj.updateDynamic("close-button")(`close-button`.asInstanceOf[js.Any])
    if (`close-html` != null) __obj.updateDynamic("close-html")(`close-html`.asInstanceOf[js.Any])
    if (`icon-class` != null) __obj.updateDynamic("icon-class")(`icon-class`.asInstanceOf[js.Any])
    if (`icon-classes` != null) __obj.updateDynamic("icon-classes")(`icon-classes`.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`message-class` != null) __obj.updateDynamic("message-class")(`message-class`.asInstanceOf[js.Any])
    if (!js.isUndefined(`mouseover-timer-stop`)) __obj.updateDynamic("mouseover-timer-stop")(`mouseover-timer-stop`.asInstanceOf[js.Any])
    if (!js.isUndefined(`newest-on-top`)) __obj.updateDynamic("newest-on-top")(`newest-on-top`.asInstanceOf[js.Any])
    if (`position-class` != null) __obj.updateDynamic("position-class")(`position-class`.asInstanceOf[js.Any])
    if (!js.isUndefined(`prevent-duplicates`)) __obj.updateDynamic("prevent-duplicates")(`prevent-duplicates`.asInstanceOf[js.Any])
    if (!js.isUndefined(`tap-to-dismiss`)) __obj.updateDynamic("tap-to-dismiss")(`tap-to-dismiss`.asInstanceOf[js.Any])
    if (`time-out` != null) __obj.updateDynamic("time-out")(`time-out`.asInstanceOf[js.Any])
    if (`title-class` != null) __obj.updateDynamic("title-class")(`title-class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToasterConfig]
  }
}

