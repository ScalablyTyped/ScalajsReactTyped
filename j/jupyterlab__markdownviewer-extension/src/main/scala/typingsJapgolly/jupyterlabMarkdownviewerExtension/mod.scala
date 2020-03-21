package typingsJapgolly.jupyterlabMarkdownviewerExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabMarkdownviewer.tokensMod.IMarkdownViewerTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The markdown viewer plugin.
    */
  val default: JupyterFrontEndPlugin[IMarkdownViewerTracker] = js.native
}

