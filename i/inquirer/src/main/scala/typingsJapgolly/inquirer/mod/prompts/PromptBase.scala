package typingsJapgolly.inquirer.mod.prompts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  */
trait PromptBase extends js.Object {
  /**
    * Gets or sets a string which represents the state of the prompt.
    */
  var status: PromptState
  /**
    * Runs the prompt.
    *
    * @returns
    * The result of the prompt.
    */
  def run(): js.Promise[_]
}

object PromptBase {
  @scala.inline
  def apply(run: CallbackTo[js.Promise[js.Any]], status: PromptState): PromptBase = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[PromptBase]
  }
}

