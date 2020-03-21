package typingsJapgolly.jupyterlabCodeeditor.editorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeEditor {
  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[
    /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions, 
    typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
  ]
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[
    /* instance */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor, 
    /* event */ org.scalajs.dom.raw.KeyboardEvent, 
    scala.Boolean
  ]
  type Model = typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Model_
}
