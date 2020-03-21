package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.DocumentLink
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolDocumentLink", JSImport.Namespace)
@js.native
object protocolDocumentLinkMod extends js.Object {
  @js.native
  trait ProtocolDocumentLink extends DocumentLink {
    var data: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProtocolDocumentLink {
    def this(range: Range) = this()
    def this(range: Range, target: Uri) = this()
  }
  
}

