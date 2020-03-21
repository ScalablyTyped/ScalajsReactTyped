package typingsJapgolly.inquirer.baseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.prompts.PromptBase
import typingsJapgolly.inquirer.mod.prompts.PromptEventPipes
import typingsJapgolly.inquirer.mod.prompts.PromptOptions
import typingsJapgolly.inquirer.mod.prompts.PromptState
import typingsJapgolly.node.readlineMod.Interface
import typingsJapgolly.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt.
  *
  * @template TQuestion
  * The options for the question.
  */
trait Prompt[TQuestion /* <: Question */] extends PromptBase {
  /**
    * Gets or sets an object which contains the answers.
    */
  var answers: Answers
  /**
    * Gets or sets the options of the prompt.
    */
  var opt: PromptOptions[TQuestion]
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Gets or sets an object for managing the console-screen.
    */
  var screen: typingsJapgolly.inquirer.screenManagerMod.^
  /**
    * Runs the prompt.
    *
    * @param callback
    * The callback for resolving the result.
    */
  /* protected */ def _run(callback: js.Function1[/* callback */ js.Any, Unit]): Unit
  /**
    * Releases all unmanaged resources.
    */
  /* protected */ def close(): Unit
  /**
    * Generates the question-string.
    *
    * @returns
    * The question-string.
    */
  /* protected */ def getQuestion(): String
  /**
    * Handles the submit-event.
    *
    * @param observable
    * The observable submit-event flow.
    */
  /* protected */ def handleSubmitEvents[T](observable: Observable_[T]): PromptEventPipes[T]
  /**
    * Throws an error for a missing param.
    *
    * @param name
    * The name of the missing param.
    */
  /* protected */ def throwParamError(name: String): Unit
}

object Prompt {
  @scala.inline
  def apply[TQuestion /* <: Question */](
    _run: js.Function1[/* callback */ js.Any, Unit] => Callback,
    answers: Answers,
    close: Callback,
    getQuestion: CallbackTo[String],
    handleSubmitEvents: Observable_[js.Any] => CallbackTo[PromptEventPipes[js.Any]],
    opt: PromptOptions[TQuestion],
    rl: Interface,
    run: CallbackTo[js.Promise[js.Any]],
    screen: typingsJapgolly.inquirer.screenManagerMod.^,
    status: PromptState,
    throwParamError: String => Callback
  ): Prompt[TQuestion] = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any], rl = rl.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("_run")(js.Any.fromFunction1((t0: js.Function1[/* callback */ js.Any, scala.Unit]) => _run(t0).runNow()))
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getQuestion")(getQuestion.toJsFn)
    __obj.updateDynamic("handleSubmitEvents")(js.Any.fromFunction1((t0: typingsJapgolly.rxjs.mod.Observable_[js.Any]) => handleSubmitEvents(t0).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("throwParamError")(js.Any.fromFunction1((t0: java.lang.String) => throwParamError(t0).runNow()))
    __obj.asInstanceOf[Prompt[TQuestion]]
  }
}

