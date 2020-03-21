package typingsJapgolly.jupyterlabFileeditor

import typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class FileEditor protected ()
    extends typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorFactory protected ()
    extends typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @js.native
  class TabSpaceStatus protected ()
    extends typingsJapgolly.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typingsJapgolly.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  
  val IEditorTracker: Token[typingsJapgolly.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  /**
    * A namespace for TabSpaceComponent statics.
    */
  @js.native
  object TabSpaceComponent extends js.Object
  
  @js.native
  object TabSpaceStatus extends js.Object {
    /**
      * A VDomModel for the TabSpace status item.
      */
    @js.native
    class Model ()
      extends typingsJapgolly.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
    
  }
  
}

