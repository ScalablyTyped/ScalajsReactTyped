package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsInputMod {
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.InputQuestionOptions

  /**
    * The question-options for the `InputPrompt<T>`.
    */
  type Question = InputQuestionOptions[Answers]
}
