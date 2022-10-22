package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Diagnostic")
@js.native
open class Diagnostic protected ()
  extends typingsJapgolly.vscode.mod.Diagnostic {
  /**
    * Creates a new diagnostic object.
    *
    * @param range The range to which this diagnostic applies.
    * @param message The human-readable message.
    * @param severity The severity, default is {@link DiagnosticSeverity.Error error}.
    */
  def this(range: typingsJapgolly.vscode.mod.Range, message: String) = this()
  def this(
    range: typingsJapgolly.vscode.mod.Range,
    message: String,
    severity: typingsJapgolly.vscode.mod.DiagnosticSeverity
  ) = this()
}
