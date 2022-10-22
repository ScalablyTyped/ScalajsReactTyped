package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentFilter
  - typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookCellTextDocumentFilter
*/
trait DocumentFilter extends StObject
object DocumentFilter {
  
  inline def Language(language: String): typingsJapgolly.vscodeLanguageserverProtocol.anon.Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.anon.Language]
  }
  
  inline def LanguagePattern(scheme: String): typingsJapgolly.vscodeLanguageserverProtocol.anon.LanguagePattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.anon.LanguagePattern]
  }
  
  inline def NotebookCellTextDocumentFilter(notebook: String | NotebookDocumentFilter): typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookCellTextDocumentFilter = {
    val __obj = js.Dynamic.literal(notebook = notebook.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookCellTextDocumentFilter]
  }
  
  inline def PatternScheme(pattern: String): typingsJapgolly.vscodeLanguageserverProtocol.anon.PatternScheme = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverProtocol.anon.PatternScheme]
  }
}
