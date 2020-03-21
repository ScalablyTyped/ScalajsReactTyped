package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsDatetime.blueprintjsDatetimeBooleans.`true`
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsJapgolly.blueprintjsDatetime.shortcutsMod.IShortcutsProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Shortcuts {
  def apply(
    allowSingleDayRange: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    shortcuts: js.Array[IDateRangeShortcut] | `true`,
    timePrecision: TimePrecision,
    onShortcutClick: (IDateRangeShortcut, Double) => Callback,
    selectedShortcutIndex: Int | Double = null,
    useSingleDateShortcuts: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IShortcutsProps, 
    typingsJapgolly.blueprintjsDatetime.shortcutsMod.Shortcuts, 
    Unit, 
    IShortcutsProps
  ] = {
    val __obj = js.Dynamic.literal(allowSingleDayRange = allowSingleDayRange.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], timePrecision = timePrecision.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onShortcutClick")(js.Any.fromFunction2((t0: typingsJapgolly.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut, t1: scala.Double) => onShortcutClick(t0, t1).runNow()))
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useSingleDateShortcuts)) __obj.updateDynamic("useSingleDateShortcuts")(useSingleDateShortcuts.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.shortcutsMod.IShortcutsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.shortcutsMod.Shortcuts](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.shortcutsMod.IShortcutsProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime/lib/esm/shortcuts", "Shortcuts")
  @js.native
  object componentImport extends js.Object
  
}

