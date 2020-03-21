package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import typingsJapgolly.reactDataGrid.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete {
  def apply(
    column: ExcelColumn = null,
    editorDisplayValue: (/* column */ ExcelColumn, /* value */ js.Any) => CallbackTo[String] = null,
    height: Int | Double = null,
    label: js.Any = null,
    onCommit: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[Callback] = js.undefined,
    options: js.Array[AnonId] = null,
    resultIdentifier: String = null,
    search: String = null,
    value: js.Any = null,
    valueParams: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AutoCompleteEditorProps, 
    typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete, 
    Unit, 
    AutoCompleteEditorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (editorDisplayValue != null) __obj.updateDynamic("editorDisplayValue")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn, t1: /* value */ js.Any) => editorDisplayValue(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    onCommit.foreach(p => __obj.updateDynamic("onCommit")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onKeyDown.foreach(p => __obj.updateDynamic("onKeyDown")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resultIdentifier != null) __obj.updateDynamic("resultIdentifier")(resultIdentifier.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueParams != null) __obj.updateDynamic("valueParams")(valueParams.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.AutoComplete](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps])(children: _*)
  }
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.AutoComplete")
  @js.native
  object componentImport extends js.Object
  
}

