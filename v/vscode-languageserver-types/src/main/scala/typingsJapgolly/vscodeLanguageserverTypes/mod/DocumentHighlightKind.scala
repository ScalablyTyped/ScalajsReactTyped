package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
*/
trait DocumentHighlightKind extends js.Object

@JSImport("vscode-languageserver-types", "DocumentHighlightKind")
@js.native
object DocumentHighlightKind extends js.Object {
  /**
    * Read-access of a symbol, like reading a variable.
    */
  val Read: `2` = js.native
  /**
    * A textual occurrence.
    */
  val Text: `1` = js.native
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  val Write: `3` = js.native
}

