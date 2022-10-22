package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.NotebookCellOutput")
@js.native
open class NotebookCellOutput protected ()
  extends typingsJapgolly.vscode.mod.NotebookCellOutput {
  /**
    * Create new notebook output.
    *
    * @param items Notebook output items.
    * @param metadata Optional metadata.
    */
  def this(items: js.Array[typingsJapgolly.vscode.mod.NotebookCellOutputItem]) = this()
  def this(
    items: js.Array[typingsJapgolly.vscode.mod.NotebookCellOutputItem],
    metadata: StringDictionary[Any]
  ) = this()
}
