package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLink {
  
  @JSImport("vscode-languageserver", "DocumentLink")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DocumentLink literal.
    */
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, target: String): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, target: String, data: LSPAny): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink]
  inline def create(range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, target: Unit, data: LSPAny): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink]
  
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean]
}
