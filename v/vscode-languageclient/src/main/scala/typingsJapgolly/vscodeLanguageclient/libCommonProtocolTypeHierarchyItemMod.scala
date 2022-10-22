package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.SymbolKind
import typingsJapgolly.vscode.mod.TypeHierarchyItem
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolTypeHierarchyItemMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolTypeHierarchyItem", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolTypeHierarchyItem {
    def this(kind: SymbolKind, name: String, detail: String, uri: Uri, range: Range, selectionRange: Range) = this()
    def this(
      kind: SymbolKind,
      name: String,
      detail: String,
      uri: Uri,
      range: Range,
      selectionRange: Range,
      data: LSPAny
    ) = this()
  }
  
  @js.native
  trait ProtocolTypeHierarchyItem extends TypeHierarchyItem {
    
    var data: js.UndefOr[LSPAny] = js.native
  }
}
