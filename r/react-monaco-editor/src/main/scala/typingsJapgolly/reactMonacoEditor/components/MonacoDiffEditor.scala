package typingsJapgolly.reactMonacoEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorOverrideServices
import typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor
import typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MonacoDiffEditor {
  def apply(
    context: js.Any = null,
    defaultValue: String = null,
    editorDidMount: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Callback = null,
    editorWillMount: /* monaco */ TypeofmonacoEditor => Callback = null,
    height: String | Double = null,
    language: String = null,
    onChange: (/* value */ String, /* event */ IModelContentChangedEvent) => Callback = null,
    options: IDiffEditorConstructionOptions = null,
    original: String = null,
    overrideServices: IEditorOverrideServices = null,
    theme: String = null,
    value: String = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MonacoDiffEditorProps, 
    typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor, 
    Unit, 
    MonacoDiffEditorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorDidMount != null) __obj.updateDynamic("editorDidMount")(js.Any.fromFunction2((t0: /* editor */ typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor, t1: /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor) => editorDidMount(t0, t1).runNow()))
    if (editorWillMount != null) __obj.updateDynamic("editorWillMount")(js.Any.fromFunction1((t0: /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor) => editorWillMount(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* event */ typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent) => onChange(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (overrideServices != null) __obj.updateDynamic("overrideServices")(overrideServices.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditorProps])(children: _*)
  }
  @JSImport("react-monaco-editor", "MonacoDiffEditor")
  @js.native
  object componentImport extends js.Object
  
}

