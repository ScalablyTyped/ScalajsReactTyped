package typingsJapgolly.bootstrapNotify

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifySettings extends js.Object {
  var allow_dismiss: js.UndefOr[Boolean] = js.undefined
  var allow_duplicates: js.UndefOr[Boolean] = js.undefined
  var animate: js.UndefOr[AnonEnter] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var icon_type: js.UndefOr[String] = js.undefined
  var mouse_over: js.UndefOr[String] = js.undefined
  var newest_on_top: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double | AnonX] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.undefined
  var onClosed: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.undefined
  var onShown: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.undefined
  var placement: js.UndefOr[AnonAlign] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showProgressbar: js.UndefOr[Boolean] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timer: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url_target: js.UndefOr[String] = js.undefined
  var z_index: js.UndefOr[Double] = js.undefined
}

object NotifySettings {
  @scala.inline
  def apply(
    allow_dismiss: js.UndefOr[Boolean] = js.undefined,
    allow_duplicates: js.UndefOr[Boolean] = js.undefined,
    animate: AnonEnter = null,
    delay: Int | Double = null,
    element: String = null,
    icon_type: String = null,
    mouse_over: String = null,
    newest_on_top: js.UndefOr[Boolean] = js.undefined,
    offset: Double | AnonX = null,
    onClose: /* $ele */ JQuery_[HTMLElement] => Callback = null,
    onClosed: /* $ele */ JQuery_[HTMLElement] => Callback = null,
    onShow: /* $ele */ JQuery_[HTMLElement] => Callback = null,
    onShown: /* $ele */ JQuery_[HTMLElement] => Callback = null,
    placement: AnonAlign = null,
    position: String = null,
    showProgressbar: js.UndefOr[Boolean] = js.undefined,
    spacing: Int | Double = null,
    template: String = null,
    timer: Int | Double = null,
    `type`: String = null,
    url_target: String = null,
    z_index: Int | Double = null
  ): NotifySettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_dismiss)) __obj.updateDynamic("allow_dismiss")(allow_dismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_duplicates)) __obj.updateDynamic("allow_duplicates")(allow_duplicates.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (icon_type != null) __obj.updateDynamic("icon_type")(icon_type.asInstanceOf[js.Any])
    if (mouse_over != null) __obj.updateDynamic("mouse_over")(mouse_over.asInstanceOf[js.Any])
    if (!js.isUndefined(newest_on_top)) __obj.updateDynamic("newest_on_top")(newest_on_top.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* $ele */ typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]) => onClose(t0).runNow()))
    if (onClosed != null) __obj.updateDynamic("onClosed")(js.Any.fromFunction1((t0: /* $ele */ typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]) => onClosed(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* $ele */ typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]) => onShow(t0).runNow()))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1((t0: /* $ele */ typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]) => onShown(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgressbar)) __obj.updateDynamic("showProgressbar")(showProgressbar.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url_target != null) __obj.updateDynamic("url_target")(url_target.asInstanceOf[js.Any])
    if (z_index != null) __obj.updateDynamic("z_index")(z_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifySettings]
  }
}

