package typingsJapgolly.inquirer.inquirerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.inquirer.inquirerMod.prompts.PromptConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides prompts for answering questions.
  */
trait PromptModuleBase extends js.Object {
  /**
    * Registers a new prompt-type.
    *
    * @param name
    * The name of the prompt.
    *
    * @param prompt
    * The constructor of the prompt.
    */
  def registerPrompt(name: String, prompt: PromptConstructor): Unit
  /**
    * Registers the default prompts.
    */
  def restoreDefaultPrompts(): Unit
}

object PromptModuleBase {
  @scala.inline
  def apply(registerPrompt: (String, PromptConstructor) => Callback, restoreDefaultPrompts: Callback): PromptModuleBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerPrompt")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.inquirer.inquirerMod.prompts.PromptConstructor) => registerPrompt(t0, t1).runNow()))
    __obj.updateDynamic("restoreDefaultPrompts")(restoreDefaultPrompts.toJsFn)
    __obj.asInstanceOf[PromptModuleBase]
  }
}

