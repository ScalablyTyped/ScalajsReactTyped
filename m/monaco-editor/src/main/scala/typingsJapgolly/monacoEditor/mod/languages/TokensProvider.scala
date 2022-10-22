package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokensProvider extends StObject {
  
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenize(line: String, state: IState): ILineTokens
}
object TokensProvider {
  
  inline def apply(getInitialState: CallbackTo[IState], tokenize: (String, IState) => ILineTokens): TokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = getInitialState.toJsFn, tokenize = js.Any.fromFunction2(tokenize))
    __obj.asInstanceOf[TokensProvider]
  }
  
  extension [Self <: TokensProvider](x: Self) {
    
    inline def setGetInitialState(value: CallbackTo[IState]): Self = StObject.set(x, "getInitialState", value.toJsFn)
    
    inline def setTokenize(value: (String, IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
  }
}
