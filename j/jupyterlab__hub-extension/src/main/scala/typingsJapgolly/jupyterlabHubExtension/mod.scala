package typingsJapgolly.jupyterlabHubExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.phosphorApplication.mod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/hub-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], js.Any]] = js.native
  @js.native
  object CommandIDs extends js.Object {
    val controlPanel: String = js.native
    val logout: String = js.native
    val restart: String = js.native
  }
  
}

