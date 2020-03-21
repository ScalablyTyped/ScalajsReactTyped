package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    parseOtions: typingsJapgolly.typescriptServices.TypeScript.ParseOptions
  ) = this()
}

