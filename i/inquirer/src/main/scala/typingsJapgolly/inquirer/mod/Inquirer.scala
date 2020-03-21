package typingsJapgolly.inquirer.mod

import typingsJapgolly.inquirer.AnonBottomBar
import typingsJapgolly.inquirer.AnonUi
import typingsJapgolly.inquirer.TypeofSeparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inquirer extends PromptModuleBase {
  /**
    * Represents a choice-item separator.
    */
  var Separator: TypeofSeparator = js.native
  /**
    * The default prompt-module.
    */
  @JSName("prompt")
  var prompt_Original: PromptModule = js.native
  /**
    * Provides ui-components.
    */
  var ui: AnonBottomBar = js.native
  /**
    * Creates a prompt-module.
    *
    * @param opt
    * The streams for the prompt-module.
    *
    * @returns
    * The new prompt-module.
    */
  def createPromptModule(): PromptModule = js.native
  def createPromptModule(opt: StreamOptions): PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  /**
    * The default prompt-module.
    */
  def prompt[T](questions: QuestionCollection[T]): js.Promise[T] with AnonUi = js.native
}

