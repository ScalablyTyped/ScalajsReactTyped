package typingsJapgolly.reactMonacoEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.editor.IEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorOverrideServices
import typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoEditorProps extends MonacoEditorBaseProps {
  /**
    * An event emitted when the editor has been mounted (similar to componentDidMount of React).
    */
  var editorDidMount: js.UndefOr[EditorDidMount] = js.undefined
  /**
    * An event emitted before the editor mounted (similar to componentWillMount of React).
    */
  var editorWillMount: js.UndefOr[EditorWillMount] = js.undefined
  /**
    * An event emitted when the content of the current model has changed.
    */
  var onChange: js.UndefOr[ChangeHandler] = js.undefined
  /**
    * Refer to Monaco interface {monaco.editor.IEditorConstructionOptions}.
    */
  var options: js.UndefOr[IEditorConstructionOptions] = js.undefined
  /**
    * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
    */
  var overrideServices: js.UndefOr[IEditorOverrideServices] = js.undefined
  /**
    * Value of the auto created model in the editor.
    * If you specify `null` or `undefined` for this property, the component behaves in uncontrolled mode.
    * Otherwise, it behaves in controlled mode.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}

object MonacoEditorProps {
  @scala.inline
  def apply(
    context: js.Any = null,
    defaultValue: String = null,
    editorDidMount: (/* editor */ IStandaloneCodeEditor, /* monaco */ TypeofmonacoEditor) => Callback = null,
    editorWillMount: /* monaco */ TypeofmonacoEditor => CallbackTo[Unit | IEditorConstructionOptions] = null,
    height: String | Double = null,
    language: String = null,
    onChange: (/* value */ String, /* event */ IModelContentChangedEvent) => Callback = null,
    options: IEditorConstructionOptions = null,
    overrideServices: IEditorOverrideServices = null,
    theme: String = null,
    value: String = null,
    width: String | Double = null
  ): MonacoEditorProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorDidMount != null) __obj.updateDynamic("editorDidMount")(js.Any.fromFunction2((t0: /* editor */ typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor, t1: /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor) => editorDidMount(t0, t1).runNow()))
    if (editorWillMount != null) __obj.updateDynamic("editorWillMount")(js.Any.fromFunction1((t0: /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor) => editorWillMount(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* event */ typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent) => onChange(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrideServices != null) __obj.updateDynamic("overrideServices")(overrideServices.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonacoEditorProps]
  }
}

