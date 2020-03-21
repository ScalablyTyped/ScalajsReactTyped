package typingsJapgolly.vscodeLanguageclient.implementationMod

import typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsJapgolly.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
@js.native
class ImplementationFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

