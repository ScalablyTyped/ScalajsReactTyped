package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.InlayHint
import typingsJapgolly.vscode.mod.InlayHintKind
import typingsJapgolly.vscode.mod.InlayHintLabelPart
import typingsJapgolly.vscode.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolInlayHintMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolInlayHint", JSImport.Default)
  @js.native
  open class default protected () extends ProtocolInlayHint {
    def this(position: Position, label: String) = this()
    def this(position: Position, label: js.Array[InlayHintLabelPart]) = this()
    def this(position: Position, label: String, kind: InlayHintKind) = this()
    def this(position: Position, label: js.Array[InlayHintLabelPart], kind: InlayHintKind) = this()
  }
  
  @js.native
  trait ProtocolInlayHint extends InlayHint {
    
    var data: Any = js.native
  }
}
