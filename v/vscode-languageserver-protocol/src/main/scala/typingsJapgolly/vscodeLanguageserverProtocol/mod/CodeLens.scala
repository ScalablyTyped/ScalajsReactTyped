package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLens {
  
  @JSImport("vscode-languageserver-protocol", "CodeLens")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeLens literal.
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens]
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, data: LSPAny): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens]
  
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean]
}
