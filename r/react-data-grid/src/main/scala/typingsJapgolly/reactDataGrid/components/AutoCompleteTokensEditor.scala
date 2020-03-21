package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
import typingsJapgolly.reactDataGrid.AnonCaption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoCompleteTokensEditor {
  def apply(
    options: js.Array[String | AnonCaption],
    column: ExcelColumn = null,
    value: js.Array[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AutoCompleteTokensEditorProps, 
    typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor, 
    Unit, 
    AutoCompleteTokensEditorProps
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps])(children: _*)
  }
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoCompleteTokensEditor")
  @js.native
  object componentImport extends js.Object
  
}

