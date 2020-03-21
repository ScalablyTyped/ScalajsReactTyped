package typingsJapgolly.jupyterlabMarkdownviewer

import typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IConfig
import typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MarkdownDocument ()
    extends typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownDocument
  
  @js.native
  class MarkdownViewer protected ()
    extends typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer {
    /**
      * Construct a new markdown viewer widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MarkdownViewerFactory protected ()
    extends typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory {
    /**
      * Construct a new mimetype widget factory.
      */
    def this(options: typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions) = this()
  }
  
  val IMarkdownViewerTracker: Token[typingsJapgolly.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker] = js.native
  @js.native
  object MarkdownViewer extends js.Object {
    /**
      * The default configuration options for an editor.
      */
    val defaultConfig: IConfig = js.native
  }
  
}

