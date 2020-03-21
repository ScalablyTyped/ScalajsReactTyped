package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CodeLens
import typingsJapgolly.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolCodeLens", JSImport.Namespace)
@js.native
object protocolCodeLensMod extends js.Object {
  @js.native
  trait ProtocolCodeLens extends CodeLens {
    var data: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProtocolCodeLens {
    def this(range: Range) = this()
  }
  
}

