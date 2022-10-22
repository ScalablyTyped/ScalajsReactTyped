package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.NotebookCellData")
@js.native
open class NotebookCellData protected ()
  extends typingsJapgolly.vscode.mod.NotebookCellData {
  /**
    * Create new cell data. Minimal cell data specifies its kind, its source value, and the
    * language identifier of its source.
    *
    * @param kind The kind.
    * @param value The source value.
    * @param languageId The language identifier of the source value.
    */
  def this(kind: typingsJapgolly.vscode.mod.NotebookCellKind, value: String, languageId: String) = this()
}
