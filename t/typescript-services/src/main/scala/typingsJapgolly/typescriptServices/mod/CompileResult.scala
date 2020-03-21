package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "CompileResult")
@js.native
class CompileResult ()
  extends typingsJapgolly.typescriptServices.TypeScript.CompileResult

/* static members */
@JSImport("typescript-services", "CompileResult")
@js.native
object CompileResult extends js.Object {
  def fromDiagnostics(diagnostics: js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]): typingsJapgolly.typescriptServices.TypeScript.CompileResult = js.native
  def fromOutputFiles(outputFiles: js.Array[typingsJapgolly.typescriptServices.TypeScript.OutputFile]): typingsJapgolly.typescriptServices.TypeScript.CompileResult = js.native
}

