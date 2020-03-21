package typingsJapgolly.jupyterlabLauncherExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabLauncher.mod.ILauncher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A service providing an interface to the the launcher.
    */
  val default: JupyterFrontEndPlugin[ILauncher] = js.native
}

