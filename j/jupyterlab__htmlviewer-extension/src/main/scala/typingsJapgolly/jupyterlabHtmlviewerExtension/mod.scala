package typingsJapgolly.jupyterlabHtmlviewerExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabHtmlviewer.mod.IHTMLViewerTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/htmlviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The HTML file handler extension.
    */
  val default: JupyterFrontEndPlugin[IHTMLViewerTracker] = js.native
}

