package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Diagnostic")
@js.native
class Diagnostic protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Diagnostic {
  def this(
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String
  ) = this()
  def this(
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_]
  ) = this()
  def this(
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    start: Double,
    length: Double,
    diagnosticKey: String,
    _arguments: js.Array[_],
    additionalLocations: js.Array[typingsJapgolly.typescriptServices.TypeScript.Location]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Diagnostic")
@js.native
object Diagnostic extends js.Object {
  def equals(
    diagnostic1: typingsJapgolly.typescriptServices.TypeScript.Diagnostic,
    diagnostic2: typingsJapgolly.typescriptServices.TypeScript.Diagnostic
  ): Boolean = js.native
}

