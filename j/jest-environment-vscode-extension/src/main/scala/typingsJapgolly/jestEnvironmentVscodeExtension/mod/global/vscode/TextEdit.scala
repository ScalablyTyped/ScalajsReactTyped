package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TextEdit")
@js.native
open class TextEdit protected ()
  extends typingsJapgolly.vscode.mod.TextEdit {
  /**
    * Create a new TextEdit.
    *
    * @param range A range.
    * @param newText A string.
    */
  def this(range: typingsJapgolly.vscode.mod.Range, newText: String) = this()
}
/* static members */
object TextEdit {
  
  @JSGlobal("vscode.TextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility to create a delete edit.
    *
    * @param range A range.
    * @return A new text edit object.
    */
  inline def delete(range: typingsJapgolly.vscode.mod.Range): typingsJapgolly.vscode.mod.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.TextEdit]
  
  /**
    * Utility to create an insert edit.
    *
    * @param position A position, will become an empty range.
    * @param newText A string.
    * @return A new text edit object.
    */
  inline def insert(position: typingsJapgolly.vscode.mod.Position, newText: String): typingsJapgolly.vscode.mod.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.TextEdit]
  
  /**
    * Utility to create a replace edit.
    *
    * @param range A range.
    * @param newText A string.
    * @return A new text edit object.
    */
  inline def replace(range: typingsJapgolly.vscode.mod.Range, newText: String): typingsJapgolly.vscode.mod.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.TextEdit]
  
  /**
    * Utility to create an eol-edit.
    *
    * @param eol An eol-sequence
    * @return A new text edit object.
    */
  inline def setEndOfLine(eol: typingsJapgolly.vscode.mod.EndOfLine): typingsJapgolly.vscode.mod.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEndOfLine")(eol.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.TextEdit]
}
