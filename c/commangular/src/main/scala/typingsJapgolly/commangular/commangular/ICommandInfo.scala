package typingsJapgolly.commangular.commangular

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Object type expected to be passed into the callback function
	 * of the dispatch() function
	 */
trait ICommandInfo extends js.Object {
  /**
  		 * Indicates if the command execution was cancelled.
  		 */
  def canceled(): Boolean
  /**
  		 * Indicates if the command was executed????
  		 */
  def commandExecuted(): Boolean
  /**
  		 * The data that was passed into the command
  		 * @param key The property name that is in the object that was passed
  		 */
  def dataPassed(key: String): js.Any
  /**
  		 * The data that was returned by the command
  		 * @param key The result key that was defined in the command. If no result
  		 * 		was defined use 'lastResult' as the key
  		 */
  def resultKey(key: String): js.Any
}

object ICommandInfo {
  @scala.inline
  def apply(
    canceled: CallbackTo[Boolean],
    commandExecuted: CallbackTo[Boolean],
    dataPassed: String => CallbackTo[js.Any],
    resultKey: String => CallbackTo[js.Any]
  ): ICommandInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canceled")(canceled.toJsFn)
    __obj.updateDynamic("commandExecuted")(commandExecuted.toJsFn)
    __obj.updateDynamic("dataPassed")(js.Any.fromFunction1((t0: java.lang.String) => dataPassed(t0).runNow()))
    __obj.updateDynamic("resultKey")(js.Any.fromFunction1((t0: java.lang.String) => resultKey(t0).runNow()))
    __obj.asInstanceOf[ICommandInfo]
  }
}

