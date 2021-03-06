package typingsJapgolly.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ParameterInformation")
@js.native
object ParameterInformation extends js.Object {
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: String, documentation: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double]): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
  def create(label: js.Tuple2[Double, Double], documentation: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = js.native
}

