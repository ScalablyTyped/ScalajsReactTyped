package typingsJapgolly.jupyterlabCells.mod

import typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.IOptions
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
class InputArea protected ()
  extends typingsJapgolly.jupyterlabCells.inputareaMod.InputArea {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "InputArea")
@js.native
object InputArea extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
    *
    * This defaults to using an `editorFactory` based on CodeMirror.
    */
  @js.native
  /**
    * Construct a `ContentFactory`.
    */
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.ContentFactory {
    def this(options: typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.ContentFactory = js.native
  /**
    * The default editor factory singleton based on CodeMirror.
    */
  val defaultEditorFactory: Factory = js.native
  /**
    * A namespace for the input area content factory.
    */
  @js.native
  object ContentFactory extends js.Object
  
}

