package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`3`
*/
trait DocumentHighlightKind extends StObject
object DocumentHighlightKind {
  
  /**
    * Read-access of a symbol, like reading a variable.
    */
  @JSImport("vscode-languageserver-types", "DocumentHighlightKind.Read")
  @js.native
  val Read: `2` = js.native
  
  /**
    * A textual occurrence.
    */
  @JSImport("vscode-languageserver-types", "DocumentHighlightKind.Text")
  @js.native
  val Text: `1` = js.native
  
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  @JSImport("vscode-languageserver-types", "DocumentHighlightKind.Write")
  @js.native
  val Write: `3` = js.native
}
