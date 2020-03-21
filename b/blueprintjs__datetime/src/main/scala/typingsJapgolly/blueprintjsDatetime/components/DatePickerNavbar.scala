package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsDatetime.datePickerNavbarMod.IDatePickerNavbarProps
import typingsJapgolly.reactDayPicker.AnonNextMonth
import typingsJapgolly.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerNavbar {
  def apply(
    className: String,
    classNames: ClassNames,
    labels: AnonNextMonth,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    maxDate: js.Date,
    minDate: js.Date,
    month: js.Date,
    nextMonth: js.Date,
    previousMonth: js.Date,
    showNextButton: Boolean,
    showPreviousButton: Boolean,
    onNextClick: js.UndefOr[js.Function0[Unit]] => Callback,
    onPreviousClick: js.UndefOr[js.Function0[Unit]] => Callback,
    dir: String = null,
    hideLeftNavButton: js.UndefOr[Boolean] = js.undefined,
    hideRightNavButton: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDatePickerNavbarProps, 
    typingsJapgolly.blueprintjsDatetime.datePickerNavbarMod.DatePickerNavbar, 
    Unit, 
    IDatePickerNavbarProps
  ] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], showNextButton = showNextButton.asInstanceOf[js.Any], showPreviousButton = showPreviousButton.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: js.UndefOr[js.Function0[scala.Unit]]) => onNextClick(t0).runNow()))
    __obj.updateDynamic("onPreviousClick")(js.Any.fromFunction1((t0: js.UndefOr[js.Function0[scala.Unit]]) => onPreviousClick(t0).runNow()))
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLeftNavButton)) __obj.updateDynamic("hideLeftNavButton")(hideLeftNavButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRightNavButton)) __obj.updateDynamic("hideRightNavButton")(hideRightNavButton.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.datePickerNavbarMod.IDatePickerNavbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.datePickerNavbarMod.DatePickerNavbar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.datePickerNavbarMod.IDatePickerNavbarProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  object componentImport extends js.Object
  
}

