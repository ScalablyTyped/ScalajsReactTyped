package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tokens and sentences returned from syntax analysis. */
trait SyntaxResult extends StObject {
  
  var sentences: js.UndefOr[js.Array[SentenceResult]] = js.undefined
  
  var tokens: js.UndefOr[js.Array[TokenResult]] = js.undefined
}
object SyntaxResult {
  
  inline def apply(): SyntaxResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxResult]
  }
  
  extension [Self <: SyntaxResult](x: Self) {
    
    inline def setSentences(value: js.Array[SentenceResult]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setSentencesVarargs(value: SentenceResult*): Self = StObject.set(x, "sentences", js.Array(value*))
    
    inline def setTokens(value: js.Array[TokenResult]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: TokenResult*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
