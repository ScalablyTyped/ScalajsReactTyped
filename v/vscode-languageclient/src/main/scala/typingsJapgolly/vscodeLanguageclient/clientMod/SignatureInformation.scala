package typingsJapgolly.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  def create(
    label: String,
    documentation: String,
    parameters: typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}

