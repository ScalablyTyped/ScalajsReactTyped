package typingsJapgolly.jupyterlabApputilsExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabApputils.tokensMod.IThemeManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils-extension/lib/themeplugins", JSImport.Namespace)
@js.native
object themepluginsMod extends js.Object {
  val themesPaletteMenuPlugin: JupyterFrontEndPlugin[Unit] = js.native
  val themesPlugin: JupyterFrontEndPlugin[IThemeManager] = js.native
}

