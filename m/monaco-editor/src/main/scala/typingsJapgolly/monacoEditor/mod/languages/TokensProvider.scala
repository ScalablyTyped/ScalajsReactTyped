package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensProvider extends js.Object {
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
  @scala.inline
  def apply(getInitialState: CallbackTo[IState], tokenize: (String, IState) => CallbackTo[ILineTokens]): TokensProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInitialState")(getInitialState.toJsFn)
    __obj.updateDynamic("tokenize")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.monacoEditor.mod.languages.IState) => tokenize(t0, t1).runNow()))
    __obj.asInstanceOf[TokensProvider]
  }
}

