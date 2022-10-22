package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostic {
  
  @JSImport("vscode-languageserver", "Diagnostic")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Diagnostic literal.
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, message: String): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: String,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: Unit,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: String,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: Unit,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: String,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    message: String,
    severity: typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticSeverity,
    code: typingsJapgolly.vscodeLanguageserverTypes.mod.integer,
    source: Unit,
    relatedInformation: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticRelatedInformation]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], message.asInstanceOf[js.Any], severity.asInstanceOf[js.Any], code.asInstanceOf[js.Any], source.asInstanceOf[js.Any], relatedInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]
  
  /**
    * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Diagnostic */ Boolean]
}
