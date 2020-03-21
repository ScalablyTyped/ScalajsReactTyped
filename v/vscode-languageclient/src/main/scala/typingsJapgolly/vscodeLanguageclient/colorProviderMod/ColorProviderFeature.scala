package typingsJapgolly.vscodeLanguageclient.colorProviderMod

import typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsJapgolly.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/colorProvider", "ColorProviderFeature")
@js.native
class ColorProviderFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
  var asColor: js.Any = js.native
  var asColorInformations: js.Any = js.native
  var asColorPresentations: js.Any = js.native
}

