package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The completion context. This is only available it the client specifies
    * to send this using the client capability `textDocument.completion.contextSupport === true`
    */
  var context: js.UndefOr[CompletionContext] = js.undefined
}
object CompletionParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): CompletionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionParams]
  }
  
  extension [Self <: CompletionParams](x: Self) {
    
    inline def setContext(value: CompletionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
