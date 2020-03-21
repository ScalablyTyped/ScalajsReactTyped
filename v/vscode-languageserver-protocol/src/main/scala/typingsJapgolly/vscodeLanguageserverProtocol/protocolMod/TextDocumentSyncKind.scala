package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`0`
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`0`
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
*/
trait TextDocumentSyncKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "TextDocumentSyncKind")
@js.native
object TextDocumentSyncKind extends js.Object {
  /**
    * Documents are synced by always sending the full content
    * of the document.
    */
  val Full: `1` = js.native
  /**
    * Documents are synced by sending the full content on open.
    * After that only incremental updates to the document are
    * send.
    */
  val Incremental: `2` = js.native
  /**
    * Documents should not be synced at all.
    */
  val None: `0` = js.native
}

