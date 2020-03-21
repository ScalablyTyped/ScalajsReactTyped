package typingsJapgolly.jupyterlabRendermimeExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A plugin providing a rendermime registry.
    */
  val default: JupyterFrontEndPlugin[IRenderMimeRegistry] = js.native
}

