package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.esfxCancelable.mod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Scanner")
@js.native
open class Scanner protected ()
  extends typingsJapgolly.grammarkdown.distScannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typingsJapgolly.grammarkdown.distDiagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typingsJapgolly.grammarkdown.distDiagnosticsMod.DiagnosticMessages,
    cancelable: Cancelable
  ) = this()
}
