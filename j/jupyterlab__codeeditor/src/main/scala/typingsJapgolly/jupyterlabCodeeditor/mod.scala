package typingsJapgolly.jupyterlabCodeeditor

import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typingsJapgolly.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodeEditorWrapper protected ()
    extends typingsJapgolly.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JSONEditor protected ()
    extends typingsJapgolly.jupyterlabCodeeditor.jsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typingsJapgolly.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions) = this()
  }
  
  val IEditorServices: Token[typingsJapgolly.jupyterlabCodeeditor.tokensMod.IEditorServices] = js.native
  @js.native
  object CodeEditor extends js.Object {
    /**
      * The default implementation of the editor model.
      */
    @js.native
    /**
      * Construct a new Model.
      */
    class Model ()
      extends typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Model {
      def this(options: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    var defaultConfig: IConfig = js.native
    /**
      * The default selection style.
      */
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @js.native
  object IEditorMimeTypeService extends js.Object {
    /**
      * The default mime type.
      */
    val defaultMimeType: String = js.native
  }
  
}

