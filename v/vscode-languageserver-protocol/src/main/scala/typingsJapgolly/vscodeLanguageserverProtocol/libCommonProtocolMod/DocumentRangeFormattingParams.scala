package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverTypes.mod.FormattingOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRangeFormattingParams
  extends StObject
     with WorkDoneProgressParams {
  
  /**
    * The format options
    */
  var options: FormattingOptions
  
  /**
    * The range to format
    */
  var range: Range
  
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentRangeFormattingParams {
  
  inline def apply(options: FormattingOptions, range: Range, textDocument: TextDocumentIdentifier): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
  
  extension [Self <: DocumentRangeFormattingParams](x: Self) {
    
    inline def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
