package typingsJapgolly.vscodeLanguageclient.foldingRangeMod

import typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsJapgolly.vscodeLanguageclient.clientMod.TextDocumentFeature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/foldingRange", "FoldingRangeFeature")
@js.native
class FoldingRangeFeature protected () extends TextDocumentFeature[TextDocumentRegistrationOptions] {
  def this(client: BaseLanguageClient) = this()
  var asFoldingRangeKind: js.Any = js.native
  var asFoldingRanges: js.Any = js.native
}

