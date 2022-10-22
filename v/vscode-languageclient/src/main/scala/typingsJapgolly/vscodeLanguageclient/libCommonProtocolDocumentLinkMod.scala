package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.DocumentLink
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDocumentLinkMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolDocumentLink", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolDocumentLink {
    def this(range: Range) = this()
    def this(range: Range, target: Uri) = this()
  }
  
  @js.native
  trait ProtocolDocumentLink extends DocumentLink {
    
    var data: Any = js.native
  }
}
