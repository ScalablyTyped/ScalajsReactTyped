package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedTokensProvider extends StObject {
  
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  var tokenize: js.UndefOr[js.Function2[/* line */ String, /* state */ IState, ILineTokens]] = js.undefined
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens
}
object EncodedTokensProvider {
  
  inline def apply(getInitialState: CallbackTo[IState], tokenizeEncoded: (String, IState) => IEncodedLineTokens): EncodedTokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = getInitialState.toJsFn, tokenizeEncoded = js.Any.fromFunction2(tokenizeEncoded))
    __obj.asInstanceOf[EncodedTokensProvider]
  }
  
  extension [Self <: EncodedTokensProvider](x: Self) {
    
    inline def setGetInitialState(value: CallbackTo[IState]): Self = StObject.set(x, "getInitialState", value.toJsFn)
    
    inline def setTokenize(value: (/* line */ String, /* state */ IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
    
    inline def setTokenizeEncoded(value: (String, IState) => IEncodedLineTokens): Self = StObject.set(x, "tokenizeEncoded", js.Any.fromFunction2(value))
    
    inline def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
  }
}
