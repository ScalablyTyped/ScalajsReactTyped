package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueVariableLookup {
  
  @JSImport("vscode-languageserver", "InlineValueVariableLookup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueText literal.
    */
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    variableName: String,
    caseSensitiveLookup: Boolean
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], variableName.asInstanceOf[js.Any], caseSensitiveLookup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup]
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    variableName: Unit,
    caseSensitiveLookup: Boolean
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], variableName.asInstanceOf[js.Any], caseSensitiveLookup.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean]
}
