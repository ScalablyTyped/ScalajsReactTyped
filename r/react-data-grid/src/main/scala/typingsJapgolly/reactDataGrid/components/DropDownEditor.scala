package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
import typingsJapgolly.reactDataGrid.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropDownEditor {
  def apply(
    options: js.Array[String | AnonText],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DropDownEditorProps, 
    typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor, 
    Unit, 
    DropDownEditorProps
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.Editors.DropDownEditor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps])(children: _*)
  }
  @JSGlobal("AdazzleReactDataGridPlugins.Editors.DropDownEditor")
  @js.native
  object componentImport extends js.Object
  
}

