package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverNumbers.`1`
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DiagnosticTag")
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

