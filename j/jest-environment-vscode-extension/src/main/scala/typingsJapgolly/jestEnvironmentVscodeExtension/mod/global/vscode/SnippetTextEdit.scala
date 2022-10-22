package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.SnippetTextEdit")
@js.native
open class SnippetTextEdit protected ()
  extends typingsJapgolly.vscode.mod.SnippetTextEdit {
  /**
    * Create a new snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    */
  def this(range: typingsJapgolly.vscode.mod.Range, snippet: typingsJapgolly.vscode.mod.SnippetString) = this()
}
/* static members */
object SnippetTextEdit {
  
  @JSGlobal("vscode.SnippetTextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Utility to create an insert snippet edit.
    *
    * @param position A position, will become an empty range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def insert(position: typingsJapgolly.vscode.mod.Position, snippet: typingsJapgolly.vscode.mod.SnippetString): typingsJapgolly.vscode.mod.SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.SnippetTextEdit]
  
  /**
    * Utility to create a replace snippet edit.
    *
    * @param range A range.
    * @param snippet A snippet string.
    * @return A new snippet edit object.
    */
  inline def replace(range: typingsJapgolly.vscode.mod.Range, snippet: typingsJapgolly.vscode.mod.SnippetString): typingsJapgolly.vscode.mod.SnippetTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], snippet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.SnippetTextEdit]
}
