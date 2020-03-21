package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonCheckedData
import typingsJapgolly.primereact.rowCheckboxMod.RowCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowCheckbox {
  def apply(
    onClick: /* e */ AnonCheckedData => Callback = null,
    rowData: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RowCheckboxProps, 
    typingsJapgolly.primereact.rowCheckboxMod.RowCheckbox, 
    Unit, 
    RowCheckboxProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonCheckedData) => onClick(t0).runNow()))
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.rowCheckboxMod.RowCheckboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.rowCheckboxMod.RowCheckbox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.rowCheckboxMod.RowCheckboxProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/RowCheckbox", "RowCheckbox")
  @js.native
  object componentImport extends js.Object
  
}

