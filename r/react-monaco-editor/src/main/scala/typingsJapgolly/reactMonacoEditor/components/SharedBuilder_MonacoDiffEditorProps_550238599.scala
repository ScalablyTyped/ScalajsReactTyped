package typingsJapgolly.reactMonacoEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorOverrideServices
import typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsJapgolly.reactMonacoEditor.anon.TypeofmonacoEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MonacoDiffEditorProps_550238599[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def classNameNull: this.type = set("className", null)
  
  inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def editorDidMount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Callback): this.type = set("editorDidMount", js.Any.fromFunction2((t0: /* editor */ IStandaloneDiffEditor, t1: /* monaco */ TypeofmonacoEditor) => (value(t0, t1)).runNow()))
  
  inline def editorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IStandaloneEditorConstructionOptions): this.type = set("editorWillMount", js.Any.fromFunction1(value))
  
  inline def editorWillUnmount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Callback): this.type = set("editorWillUnmount", js.Any.fromFunction2((t0: /* editor */ IStandaloneDiffEditor, t1: /* monaco */ TypeofmonacoEditor) => (value(t0, t1)).runNow()))
  
  inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
  
  inline def onChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ String, t1: /* event */ IModelContentChangedEvent) => (value(t0, t1)).runNow()))
  
  inline def options(value: IDiffEditorConstructionOptions): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def original(value: String): this.type = set("original", value.asInstanceOf[js.Any])
  
  inline def overrideServices(value: IEditorOverrideServices): this.type = set("overrideServices", value.asInstanceOf[js.Any])
  
  inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def themeNull: this.type = set("theme", null)
  
  inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
}
