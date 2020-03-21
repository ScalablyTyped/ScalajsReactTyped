package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder that caches the semantic diagnostics for the program and handles the changed files and affected files
  */
@js.native
trait SemanticDiagnosticsBuilderProgram extends BuilderProgram {
  /**
    * Gets the semantic diagnostics from the program for the next affected file and caches it
    * Returns undefined if the iteration is complete
    */
  def getSemanticDiagnosticsOfNextAffectedFile(): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(cancellationToken: CancellationToken): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(
    cancellationToken: CancellationToken,
    ignoreSourceFile: js.Function1[/* sourceFile */ SourceFile, Boolean]
  ): AffectedFileResult[js.Array[Diagnostic]] = js.native
}

