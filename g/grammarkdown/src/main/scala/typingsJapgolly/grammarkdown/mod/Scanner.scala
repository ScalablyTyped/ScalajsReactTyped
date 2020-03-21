package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Scanner")
@js.native
class Scanner protected ()
  extends typingsJapgolly.grammarkdown.scannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typingsJapgolly.grammarkdown.diagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typingsJapgolly.grammarkdown.diagnosticsMod.DiagnosticMessages,
    cancellationToken: CancellationToken
  ) = this()
}

