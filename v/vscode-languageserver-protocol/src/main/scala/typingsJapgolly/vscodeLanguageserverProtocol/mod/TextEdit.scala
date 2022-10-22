package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEdit {
  
  @JSImport("vscode-languageserver-protocol", "TextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a delete text edit.
    * @param range The range of text to be deleted.
    */
  inline def del(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  
  /**
    * Creates an insert text edit.
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    */
  inline def insert(position: typingsJapgolly.vscodeLanguageserverTypes.mod.Position, newText: String): typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextEdit */ Boolean]
  
  /**
    * Creates a replace text edit.
    * @param range The range of text to be replaced.
    * @param newText The new text.
    */
  inline def replace(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, newText: String): typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]
}
