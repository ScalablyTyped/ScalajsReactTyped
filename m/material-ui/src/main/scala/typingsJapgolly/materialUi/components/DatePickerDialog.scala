package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.AnonCall
import typingsJapgolly.materialUi.MaterialUI.DatePicker.DatePickerDialogProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.utils
import typingsJapgolly.materialUi.datePickerDialogMod.default
import typingsJapgolly.materialUi.materialUiStrings.`inline`
import typingsJapgolly.materialUi.materialUiStrings.dialog
import typingsJapgolly.materialUi.materialUiStrings.landscape
import typingsJapgolly.materialUi.materialUiStrings.portrait
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePickerDialog {
  def apply(
    DateTimeFormat: AnonCall = null,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: VdomNode = null,
    container: dialog | `inline` = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    initialDate: js.Date = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    okLabel: VdomNode = null,
    onAccept: /* d */ js.Date => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    shouldDisableDate: /* day */ js.Date => CallbackTo[Boolean] = null,
    style: CSSProperties = null,
    utils: utils = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DatePickerDialogProps, default, Unit, DatePickerDialogProps] = {
    val __obj = js.Dynamic.literal()
  
      if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.rawNode.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.rawNode.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* d */ js.Date) => onAccept(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1((t0: /* day */ js.Date) => shouldDisableDate(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.DatePicker.DatePickerDialogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.datePickerDialogMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.DatePicker.DatePickerDialogProps])(children: _*)
  }
  @JSImport("material-ui/DatePicker/DatePickerDialog", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

