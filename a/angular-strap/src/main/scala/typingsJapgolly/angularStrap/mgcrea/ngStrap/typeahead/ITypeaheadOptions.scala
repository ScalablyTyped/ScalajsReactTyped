package typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularStrap.AnonHide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeaheadOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  var comparator: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var trimValue: js.UndefOr[Boolean] = js.undefined
  var watchOptions: js.UndefOr[Boolean] = js.undefined
}

object ITypeaheadOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    comparator: String = null,
    container: String | Boolean = null,
    delay: Double | AnonHide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    limit: Int | Double = null,
    minLength: Int | Double = null,
    onBeforeHide: /* typeahead */ ITypeahead => Callback = null,
    onBeforeShow: /* typeahead */ ITypeahead => Callback = null,
    onHide: /* typeahead */ ITypeahead => Callback = null,
    onSelect: /* typeahead */ ITypeahead => Callback = null,
    onShow: /* typeahead */ ITypeahead => Callback = null,
    placement: String = null,
    template: String = null,
    trigger: String = null,
    trimValue: js.UndefOr[Boolean] = js.undefined,
    watchOptions: js.UndefOr[Boolean] = js.undefined
  ): ITypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1((t0: /* typeahead */ typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead) => onBeforeHide(t0).runNow()))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1((t0: /* typeahead */ typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead) => onBeforeShow(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* typeahead */ typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead) => onHide(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* typeahead */ typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead) => onSelect(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* typeahead */ typingsJapgolly.angularStrap.mgcrea.ngStrap.typeahead.ITypeahead) => onShow(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(trimValue)) __obj.updateDynamic("trimValue")(trimValue.asInstanceOf[js.Any])
    if (!js.isUndefined(watchOptions)) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypeaheadOptions]
  }
}

