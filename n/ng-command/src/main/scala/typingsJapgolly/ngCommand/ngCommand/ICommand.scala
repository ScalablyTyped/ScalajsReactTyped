package typingsJapgolly.ngCommand.ngCommand

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	* Command proxy object.
	*/
trait ICommand extends js.Object {
  /**
  		* Determines whether the command can execute or not.
  		*/
  var canExecute: Boolean
  /**
  		* Determines whether the command is currently executing.
  		*/
  var isExecuting: Boolean
  /**
  		* Executes the command function.
  		*/
  def execute(): js.Any
}

object ICommand {
  @scala.inline
  def apply(canExecute: Boolean, execute: CallbackTo[js.Any], isExecuting: Boolean): ICommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], isExecuting = isExecuting.asInstanceOf[js.Any])
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.asInstanceOf[ICommand]
  }
}

