package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodedTokensProvider extends js.Object {
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens
}

object EncodedTokensProvider {
  @scala.inline
  def apply(
    getInitialState: CallbackTo[IState],
    tokenizeEncoded: (String, IState) => CallbackTo[IEncodedLineTokens]
  ): EncodedTokensProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInitialState")(getInitialState.toJsFn)
    __obj.updateDynamic("tokenizeEncoded")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.monacoEditor.mod.languages.IState) => tokenizeEncoded(t0, t1).runNow()))
    __obj.asInstanceOf[EncodedTokensProvider]
  }
}

