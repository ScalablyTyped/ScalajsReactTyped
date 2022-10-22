package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectSyntaxItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  
  /**
    * The syntax tokens for the words in the document, one token for each word.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.undefined
}
object BatchDetectSyntaxItemResult {
  
  inline def apply(): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
  
  extension [Self <: BatchDetectSyntaxItemResult](x: Self) {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    inline def setSyntaxTokens(value: ListOfSyntaxTokens): Self = StObject.set(x, "SyntaxTokens", value.asInstanceOf[js.Any])
    
    inline def setSyntaxTokensUndefined: Self = StObject.set(x, "SyntaxTokens", js.undefined)
    
    inline def setSyntaxTokensVarargs(value: SyntaxToken*): Self = StObject.set(x, "SyntaxTokens", js.Array(value*))
  }
}
