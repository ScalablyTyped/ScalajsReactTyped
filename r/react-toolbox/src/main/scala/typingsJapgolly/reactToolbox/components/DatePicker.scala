package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToolbox.libDatePickerDatePickerMod.DatePickerLocale
import typingsJapgolly.reactToolbox.libDatePickerDatePickerMod.DatePickerProps
import typingsJapgolly.reactToolbox.libDatePickerDatePickerMod.DatePickerTheme
import typingsJapgolly.reactToolbox.libDatePickerMod.default
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-cn`
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-hk`
import typingsJapgolly.reactToolbox.reactToolboxStrings.`zh-tw`
import typingsJapgolly.reactToolbox.reactToolboxStrings.af
import typingsJapgolly.reactToolbox.reactToolboxStrings.ar
import typingsJapgolly.reactToolbox.reactToolboxStrings.be
import typingsJapgolly.reactToolbox.reactToolboxStrings.bg
import typingsJapgolly.reactToolbox.reactToolboxStrings.bn
import typingsJapgolly.reactToolbox.reactToolboxStrings.bo
import typingsJapgolly.reactToolbox.reactToolboxStrings.br
import typingsJapgolly.reactToolbox.reactToolboxStrings.bs
import typingsJapgolly.reactToolbox.reactToolboxStrings.ca
import typingsJapgolly.reactToolbox.reactToolboxStrings.de
import typingsJapgolly.reactToolbox.reactToolboxStrings.en
import typingsJapgolly.reactToolbox.reactToolboxStrings.es
import typingsJapgolly.reactToolbox.reactToolboxStrings.eu
import typingsJapgolly.reactToolbox.reactToolboxStrings.fr
import typingsJapgolly.reactToolbox.reactToolboxStrings.gl
import typingsJapgolly.reactToolbox.reactToolboxStrings.it
import typingsJapgolly.reactToolbox.reactToolboxStrings.no
import typingsJapgolly.reactToolbox.reactToolboxStrings.pt
import typingsJapgolly.reactToolbox.reactToolboxStrings.ru
import typingsJapgolly.reactToolbox.reactToolboxStrings.ua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    className: String = null,
    disabledDates: js.Array[js.Date] = null,
    enabledDates: js.Array[js.Date] = null,
    error: String = null,
    icon: VdomNode = null,
    inputClassName: String = null,
    inputFormat: js.Function = null,
    label: String = null,
    locale: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    name: String = null,
    okLabel: String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDismiss: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onOverlayClick: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.undefined,
    theme: DatePickerTheme = null,
    value: js.Date | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DatePickerProps, default, Unit, DatePickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd.asInstanceOf[js.Any])
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter.asInstanceOf[js.Any])
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit.asInstanceOf[js.Any])
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter.asInstanceOf[js.Any])
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove.asInstanceOf[js.Any])
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut.asInstanceOf[js.Any])
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver.asInstanceOf[js.Any])
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(sundayFirstDayOfWeek)) __obj.updateDynamic("sundayFirstDayOfWeek")(sundayFirstDayOfWeek.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToolbox.libDatePickerDatePickerMod.DatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactToolbox.libDatePickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToolbox.libDatePickerDatePickerMod.DatePickerProps])(children: _*)
  }
  @JSImport("react-toolbox/lib/date_picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

