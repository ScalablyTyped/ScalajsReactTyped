package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonDataObject
import typingsJapgolly.primereact.rowRadioButtonMod.RowRadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowRadioButton {
  def apply(
    onClick: /* e */ AnonDataObject => Callback = null,
    rowData: js.Object = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RowRadioButtonProps, 
    typingsJapgolly.primereact.rowRadioButtonMod.RowRadioButton, 
    Unit, 
    RowRadioButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDataObject) => onClick(t0).runNow()))
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.rowRadioButtonMod.RowRadioButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.rowRadioButtonMod.RowRadioButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.rowRadioButtonMod.RowRadioButtonProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/RowRadioButton", "RowRadioButton")
  @js.native
  object componentImport extends js.Object
  
}

