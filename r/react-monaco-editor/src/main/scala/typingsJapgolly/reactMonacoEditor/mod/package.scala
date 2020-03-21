package typingsJapgolly.reactMonacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChangeHandler = js.Function2[
    /* value */ java.lang.String, 
    /* event */ typingsJapgolly.monacoEditor.mod.editor.IModelContentChangedEvent, 
    scala.Unit
  ]
  type DiffChangeHandler = typingsJapgolly.reactMonacoEditor.mod.ChangeHandler
  type DiffEditorDidMount = js.Function2[
    /* editor */ typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor, 
    /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type DiffEditorWillMount = js.Function1[/* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor, scala.Unit]
  type EditorDidMount = js.Function2[
    /* editor */ typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor, 
    /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit
  ]
  type EditorWillMount = js.Function1[
    /* monaco */ typingsJapgolly.reactMonacoEditor.TypeofmonacoEditor, 
    scala.Unit | typingsJapgolly.monacoEditor.mod.editor.IEditorConstructionOptions
  ]
}
