package typingsJapgolly.jupyterlabCodemirror

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.codemirror.mod.Editor
import typingsJapgolly.jupyterlabCodeeditor.tokensMod.IEditorServices
import typingsJapgolly.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IConfig
import typingsJapgolly.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IOptions
import typingsJapgolly.jupyterlabCodemirror.modeMod.Mode.ISpec
import typingsJapgolly.jupyterlabCodemirror.modeMod.Mode.ISpecLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodeMirrorEditor protected ()
    extends typingsJapgolly.jupyterlabCodemirror.editorMod.CodeMirrorEditor {
    /**
      * Construct a CodeMirror editor.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory ()
    extends typingsJapgolly.jupyterlabCodemirror.factoryMod.CodeMirrorEditorFactory {
    def this(defaults: PartialIConfig) = this()
  }
  
  @js.native
  class CodeMirrorMimeTypeService ()
    extends typingsJapgolly.jupyterlabCodemirror.mimetypeMod.CodeMirrorMimeTypeService
  
  @js.native
  class EditorSyntaxStatus protected ()
    extends typingsJapgolly.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: typingsJapgolly.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.IOptions) = this()
  }
  
  val editorServices: IEditorServices = js.native
  @js.native
  object CodeMirrorEditor extends js.Object {
    /**
      * The default configuration options for an editor.
      */
    var defaultConfig: IConfig = js.native
    /**
      * Add a command to CodeMirror.
      *
      * @param name - The name of the command to add.
      *
      * @param command - The command function.
      */
    def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
  }
  
  @js.native
  object EditorSyntaxStatus extends js.Object {
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @js.native
    class Model ()
      extends typingsJapgolly.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.Model
    
  }
  
  @js.native
  object Mode extends js.Object {
    def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = js.native
    /**
      * Ensure a codemirror mode is available by name or Codemirror spec.
      *
      * @param mode - The mode to ensure.  If it is a string, uses [findBest]
      *   to get the appropriate spec.
      *
      * @returns A promise that resolves when the mode is available.
      */
    def ensure(mode: String): js.Promise[ISpec] = js.native
    def ensure(mode: ISpec): js.Promise[ISpec] = js.native
    /**
      * Find a codemirror mode by name or CodeMirror spec.
      */
    def findBest(mode: String): ISpec = js.native
    def findBest(mode: ISpec): ISpec = js.native
    /**
      * Find a codemirror mode by extension.
      */
    def findByExtension(ext: String): ISpec = js.native
    def findByExtension(ext: js.Array[String]): ISpec = js.native
    /**
      * Find a codemirror mode by filename.
      */
    def findByFileName(name: String): ISpec = js.native
    /**
      * Find a codemirror mode by MIME.
      */
    def findByMIME(mime: String): ISpec = js.native
    /**
      * Find a codemirror mode by name.
      */
    def findByName(name: String): ISpec = js.native
    /**
      * Get the raw list of available modes specs.
      */
    def getModeInfo(): js.Array[ISpec] = js.native
    /**
      * Running a CodeMirror mode outside of an editor.
      */
    def run(code: String, mode: String, el: HTMLElement): Unit = js.native
    def run(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
  }
  
}

