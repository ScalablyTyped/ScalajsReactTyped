package typingsJapgolly.vscodeLanguageserverTypes.mod

import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
import typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`1`
  - typingsJapgolly.vscodeLanguageserverTypes.vscodeLanguageserverTypesInts.`2`
*/
trait DiagnosticTag extends StObject
object DiagnosticTag {
  
  /**
    * Deprecated or obsolete code.
    *
    * Clients are allowed to rendered diagnostics with this tag strike through.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticTag.Deprecated")
  @js.native
  val Deprecated: `2` = js.native
  
  /**
    * Unused or unnecessary code.
    *
    * Clients are allowed to render diagnostics with this tag faded out instead of having
    * an error squiggle.
    */
  @JSImport("vscode-languageserver-types", "DiagnosticTag.Unnecessary")
  @js.native
  val Unnecessary: `1` = js.native
}
