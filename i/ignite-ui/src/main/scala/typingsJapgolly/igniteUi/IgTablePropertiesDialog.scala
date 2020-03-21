package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTablePropertiesDialog
  extends /**
	 * Option for igTablePropertiesDialog
	 */
/* optionName */ StringDictionary[js.Any] {
  @JSName("apply")
  var apply: js.UndefOr[ApplyEvent] = js.undefined
  var cancel: js.UndefOr[CancelEvent] = js.undefined
  var hide: js.UndefOr[HideEvent] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  var show: js.UndefOr[ShowEvent] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
}

object IgTablePropertiesDialog {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTablePropertiesDialog
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    apply: (/* event */ Event_, /* ui */ ApplyEventUIParam) => Callback = null,
    cancel: (/* event */ Event_, /* ui */ CancelEventUIParam) => Callback = null,
    hide: (/* event */ Event_, /* ui */ HideEventUIParam) => Callback = null,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    item: js.Any = null,
    language: String = null,
    locale: js.Any = null,
    regional: String | js.Object = null,
    show: (/* event */ Event_, /* ui */ ShowEventUIParam) => Callback = null,
    target: js.Any = null
  ): IgTablePropertiesDialog = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ApplyEventUIParam) => apply(t0, t1).runNow()))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CancelEventUIParam) => cancel(t0, t1).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.HideEventUIParam) => hide(t0, t1).runNow()))
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ShowEventUIParam) => show(t0, t1).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTablePropertiesDialog]
  }
}

