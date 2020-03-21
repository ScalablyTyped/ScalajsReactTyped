package typingsJapgolly.jupyterlabMathjax2Extension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabRendermime.tokensMod.ILatexTypesetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mathjax2-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The MathJax latexTypesetter plugin.
    */
  val default: JupyterFrontEndPlugin[ILatexTypesetter] = js.native
}

