package typingsJapgolly.jupyterlabRendermime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/latex", JSImport.Namespace)
@js.native
object latexMod extends js.Object {
  def removeMath(text: String): AnonMath = js.native
  def replaceMath(text: String, math: js.Array[String]): String = js.native
}

