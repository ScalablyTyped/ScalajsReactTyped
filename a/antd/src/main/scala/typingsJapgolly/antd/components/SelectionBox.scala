package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxChangeEvent
import typingsJapgolly.antd.libRadioInterfaceMod.RadioChangeEvent
import typingsJapgolly.antd.libTableCreateStoreMod.Store
import typingsJapgolly.antd.libTableInterfaceMod.RowSelectionType
import typingsJapgolly.antd.libTableInterfaceMod.SelectionBoxProps
import typingsJapgolly.antd.libTableSelectionBoxMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectionBox {
  def apply(
    defaultSelection: js.Array[String],
    rowIndex: String,
    store: Store,
    onChange: CheckboxChangeEvent | RadioChangeEvent => Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    `type`: RowSelectionType = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectionBoxProps, default, Unit, SelectionBoxProps] = {
    val __obj = js.Dynamic.literal(defaultSelection = defaultSelection.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libCheckboxCheckboxMod.CheckboxChangeEvent | typingsJapgolly.antd.libRadioInterfaceMod.RadioChangeEvent) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableInterfaceMod.SelectionBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTableSelectionBoxMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableInterfaceMod.SelectionBoxProps])(children: _*)
  }
  @JSImport("antd/lib/table/SelectionBox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

