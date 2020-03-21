package typingsJapgolly.commangular.commangular

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultCommand extends ICommand {
  /**
  		 * Is executed when the executed method ends with an error. Can receive the error throw by the execute method.
  		 * @param error The error that occured during execution
  		 */
  def onError(error: js.Error): Unit
  /**
  		 * Is executed after the execute method and the interception chain and can receive
  		 * the result from the execute method of the same command.
  		 *
  		 * @param result Value/object returned by the execution.
  		 */
  def onResult(result: js.Any): Unit
}

object IResultCommand {
  @scala.inline
  def apply(execute: CallbackTo[js.Any], onError: js.Error => Callback, onResult: js.Any => Callback): IResultCommand = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onResult")(js.Any.fromFunction1((t0: js.Any) => onResult(t0).runNow()))
    __obj.asInstanceOf[IResultCommand]
  }
}

