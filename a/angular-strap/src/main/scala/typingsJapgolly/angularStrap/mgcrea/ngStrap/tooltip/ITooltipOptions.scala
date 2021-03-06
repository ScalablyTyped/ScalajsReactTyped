package typingsJapgolly.angularStrap.mgcrea.ngStrap.tooltip

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angularStrap.AnonHide
import typingsJapgolly.angularStrap.AnonPadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var prefixEvent: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTemplate: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[String | AnonPadding] = js.undefined
}

object ITooltipOptions {
  @scala.inline
  def apply(
    animation: String = null,
    container: String | Boolean = null,
    delay: Double | AnonHide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onBeforeHide: /* tooltip */ ITooltip => Callback = null,
    onBeforeShow: /* tooltip */ ITooltip => Callback = null,
    onHide: /* tooltip */ ITooltip => Callback = null,
    onShow: /* tooltip */ ITooltip => Callback = null,
    placement: String = null,
    prefixEvent: String = null,
    target: String | IAugmentedJQuery | Boolean = null,
    template: String = null,
    templateUrl: String = null,
    title: String = null,
    titleTemplate: String = null,
    trigger: String = null,
    viewport: String | AnonPadding = null
  ): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1((t0: /* tooltip */ typingsJapgolly.angularStrap.mgcrea.ngStrap.tooltip.ITooltip) => onBeforeHide(t0).runNow()))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1((t0: /* tooltip */ typingsJapgolly.angularStrap.mgcrea.ngStrap.tooltip.ITooltip) => onBeforeShow(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* tooltip */ typingsJapgolly.angularStrap.mgcrea.ngStrap.tooltip.ITooltip) => onHide(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* tooltip */ typingsJapgolly.angularStrap.mgcrea.ngStrap.tooltip.ITooltip) => onShow(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixEvent != null) __obj.updateDynamic("prefixEvent")(prefixEvent.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipOptions]
  }
}

