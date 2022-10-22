package typingsJapgolly.jupyterlabCodeeditor

import typingsJapgolly.jupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typingsJapgolly.jupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typingsJapgolly.jupyterlabCodeeditor.libEditorMod.CodeEditor.Model.IOptions
import typingsJapgolly.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CodeEditor {
    
    /**
      * The default implementation of the editor model.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.Model")
    @js.native
    /**
      * Construct a new Model.
      */
    open class Model ()
      extends typingsJapgolly.jupyterlabCodeeditor.libEditorMod.CodeEditor.Model {
      def this(options: IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
    
    /**
      * The default selection style.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultSelectionStyle")
    @js.native
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "CodeEditorWrapper")
  @js.native
  open class CodeEditorWrapper protected ()
    extends typingsJapgolly.jupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: typingsJapgolly.jupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions) = this()
  }
  
  object IEditorMimeTypeService {
    
    /**
      * The default mime type.
      */
    @JSImport("@jupyterlab/codeeditor", "IEditorMimeTypeService.defaultMimeType")
    @js.native
    val defaultMimeType: String = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "IEditorServices")
  @js.native
  val IEditorServices: Token[typingsJapgolly.jupyterlabCodeeditor.libTokensMod.IEditorServices] = js.native
  
  @JSImport("@jupyterlab/codeeditor", "JSONEditor")
  @js.native
  open class JSONEditor protected ()
    extends typingsJapgolly.jupyterlabCodeeditor.libJsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typingsJapgolly.jupyterlabCodeeditor.libJsoneditorMod.JSONEditor.IOptions) = this()
  }
}
