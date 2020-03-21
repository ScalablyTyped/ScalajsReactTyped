package typingsJapgolly.jupyterlabImageviewerExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabImageviewer.tokensMod.IImageTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The image file handler extension.
    */
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
}

