package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverProtocol.anon.Language
  - typingsJapgolly.vscodeLanguageserverProtocol.anon.LanguagePattern
  - typingsJapgolly.vscodeLanguageserverProtocol.anon.PatternScheme
*/
trait TextDocumentFilter
  extends StObject
     with DocumentFilter
object TextDocumentFilter {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "TextDocumentFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.TextDocumentFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/common/protocol.TextDocumentFilter */ Boolean]
}
