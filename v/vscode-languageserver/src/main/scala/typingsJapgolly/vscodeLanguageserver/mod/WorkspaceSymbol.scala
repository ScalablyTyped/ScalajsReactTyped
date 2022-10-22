package typingsJapgolly.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbol {
  
  @JSImport("vscode-languageserver", "WorkspaceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a new workspace symbol.
    *
    * @param name The name of the symbol.
    * @param kind The kind of the symbol.
    * @param uri The resource of the location of the symbol.
    * @param range An options range of the location.
    * @returns A WorkspaceSymbol.
    */
  inline def create(
    name: String,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolKind,
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol]
  inline def create(
    name: String,
    kind: typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolKind,
    uri: typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentUri,
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol]
}
