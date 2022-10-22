package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueText {
  
  @JSImport("vscode-languageclient", "InlineValueText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueText literal.
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, text: String): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueText = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueText]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean]
}
