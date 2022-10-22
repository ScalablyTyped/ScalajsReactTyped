package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertReplaceEdit {
  
  @JSImport("vscode-languageserver-protocol", "InsertReplaceEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new insert / replace edit
    */
  inline def create(
    newText: String,
    insert: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    replace: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InsertReplaceEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(newText.asInstanceOf[js.Any], insert.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InsertReplaceEdit]
  
  inline def is(value: typingsJapgolly.vscodeLanguageserverTypes.mod.InsertReplaceEdit): /* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean]
  /**
    * Checks whether the given literal conforms to the [InsertReplaceEdit](#InsertReplaceEdit) interface.
    */
  inline def is(value: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit): /* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InsertReplaceEdit */ Boolean]
}
