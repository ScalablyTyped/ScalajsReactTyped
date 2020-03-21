package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridFeatureChooser
  extends /**
	 * Option for igGridFeatureChooser
	 */
/* optionName */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var dropDownWidth: js.UndefOr[js.Any] = js.undefined
  var featureChooserDropDownOpened: js.UndefOr[FeatureChooserDropDownOpenedEvent] = js.undefined
  var featureChooserDropDownOpening: js.UndefOr[FeatureChooserDropDownOpeningEvent] = js.undefined
  var featureChooserRendered: js.UndefOr[FeatureChooserRenderedEvent] = js.undefined
  var featureChooserRendering: js.UndefOr[FeatureChooserRenderingEvent] = js.undefined
  var featureToggled: js.UndefOr[FeatureToggledEvent] = js.undefined
  var featureToggling: js.UndefOr[FeatureTogglingEvent] = js.undefined
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
  var menuToggling: js.UndefOr[MenuTogglingEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}

object IgGridFeatureChooser {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridFeatureChooser
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    dropDownWidth: js.Any = null,
    featureChooserDropDownOpened: (/* event */ Event_, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Callback = null,
    featureChooserDropDownOpening: (/* event */ Event_, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Callback = null,
    featureChooserRendered: (/* event */ Event_, /* ui */ FeatureChooserRenderedEventUIParam) => Callback = null,
    featureChooserRendering: (/* event */ Event_, /* ui */ FeatureChooserRenderingEventUIParam) => Callback = null,
    featureToggled: (/* event */ Event_, /* ui */ FeatureToggledEventUIParam) => Callback = null,
    featureToggling: (/* event */ Event_, /* ui */ FeatureTogglingEventUIParam) => Callback = null,
    language: String = null,
    locale: js.Any = null,
    menuToggling: (/* event */ Event_, /* ui */ MenuTogglingEventUIParam) => Callback = null,
    regional: String | js.Object = null
  ): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth.asInstanceOf[js.Any])
    if (featureChooserDropDownOpened != null) __obj.updateDynamic("featureChooserDropDownOpened")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureChooserDropDownOpenedEventUIParam) => featureChooserDropDownOpened(t0, t1).runNow()))
    if (featureChooserDropDownOpening != null) __obj.updateDynamic("featureChooserDropDownOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureChooserDropDownOpeningEventUIParam) => featureChooserDropDownOpening(t0, t1).runNow()))
    if (featureChooserRendered != null) __obj.updateDynamic("featureChooserRendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureChooserRenderedEventUIParam) => featureChooserRendered(t0, t1).runNow()))
    if (featureChooserRendering != null) __obj.updateDynamic("featureChooserRendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureChooserRenderingEventUIParam) => featureChooserRendering(t0, t1).runNow()))
    if (featureToggled != null) __obj.updateDynamic("featureToggled")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureToggledEventUIParam) => featureToggled(t0, t1).runNow()))
    if (featureToggling != null) __obj.updateDynamic("featureToggling")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.FeatureTogglingEventUIParam) => featureToggling(t0, t1).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (menuToggling != null) __obj.updateDynamic("menuToggling")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MenuTogglingEventUIParam) => menuToggling(t0, t1).runNow()))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
}

