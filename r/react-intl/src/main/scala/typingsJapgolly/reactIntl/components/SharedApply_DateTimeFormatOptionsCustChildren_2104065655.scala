package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactIntl.DateTimeFormatOptionsCustChildren
import typingsJapgolly.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DateTimeFormatOptionsCustChildren_2104065655 () {
  val componentImport: js.Any
  def apply(
    day: String = null,
    era: String = null,
    format: String = null,
    formatMatcher: String = null,
    hour: String = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    localeMatcher: String = null,
    minute: String = null,
    month: String = null,
    second: String = null,
    timeZone: String = null,
    timeZoneName: String = null,
    value: String | Double | js.Date = null,
    weekday: String = null,
    year: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[DateTimeFormatPart] => CallbackTo[Element | Null]
  ): UnmountedSimple[
    DateTimeFormatOptionsCustChildren, 
    MountedWithRawType[
      DateTimeFormatOptionsCustChildren, 
      js.Object, 
      RawMounted[DateTimeFormatOptionsCustChildren, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.std.Intl.DateTimeFormatPart]) => children(t0).runNow()))
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactIntl.DateTimeFormatOptionsCustChildren, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.DateTimeFormatOptionsCustChildren])
  }
}

