package typingsJapgolly.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  /**
    * Creates a new Diagnostic literal.
    */
  def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, message: String): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Double,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = js.native
}

