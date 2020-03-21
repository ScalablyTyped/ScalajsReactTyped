package typingsJapgolly.vscodeLanguageclient.typeDefinitionMod

import typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsJapgolly.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/typeDefinition", "TypeDefinitionFeature")
@js.native
class TypeDefinitionFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
}

