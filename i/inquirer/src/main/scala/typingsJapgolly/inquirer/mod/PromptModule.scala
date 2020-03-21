package typingsJapgolly.inquirer.mod

import typingsJapgolly.inquirer.AnonUi
import typingsJapgolly.inquirer.mod.prompts.PromptCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to prompt questions to the user.
  */
@js.native
trait PromptModule extends PromptModuleBase {
  /**
    * The prompts of the prompt-module.
    */
  var prompts: PromptCollection = js.native
  /**
    * Prompts the questions to the user.
    */
  def apply[T](questions: QuestionCollection[T]): js.Promise[T] with AnonUi = js.native
}

