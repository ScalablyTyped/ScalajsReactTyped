package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
*/
trait DiagnosticTag extends js.Object

@JSImport("vscode-languageserver-types", "DiagnosticTag")
@js.native
object DiagnosticTag extends js.Object {
  /**
    * Deprecated or obsolete code.
    *
    * Clients are allowed to rendered diagnostics with this tag strike through.
    */
  val Deprecated: `2` = js.native
  /**
    * Unused or unnecessary code.
    *
    * Clients are allowed to render diagnostics with this tag faded out instead of having
    * an error squiggle.
    */
  val Unnecessary: `1` = js.native
}

