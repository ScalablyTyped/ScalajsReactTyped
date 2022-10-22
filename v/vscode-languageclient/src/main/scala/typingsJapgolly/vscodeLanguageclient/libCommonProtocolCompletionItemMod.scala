package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CompletionItem
import typingsJapgolly.vscode.mod.CompletionItemLabel
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItemKind
import typingsJapgolly.vscodeLanguageserverTypes.mod.InsertTextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolCompletionItemMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolCompletionItem", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolCompletionItem {
    def this(label: String) = this()
    def this(label: CompletionItemLabel) = this()
  }
  
  @js.native
  trait ProtocolCompletionItem extends CompletionItem {
    
    var data: Any = js.native
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var documentationFormat: js.UndefOr[String] = js.native
    
    var fromEdit: js.UndefOr[Boolean] = js.native
    
    var insertTextMode: js.UndefOr[InsertTextMode] = js.native
    
    var originalItemKind: js.UndefOr[CompletionItemKind] = js.native
  }
}
