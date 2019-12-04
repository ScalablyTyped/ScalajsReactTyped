package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsNumberMod {
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.NumberQuestionOptions

  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: Question */] = typingsJapgolly.inquirer.libPromptsInputMod.^[TQuestion]
  /**
    * The question for the `NumberPrompt<T>`.
    */
  type Question = NumberQuestionOptions[Answers]
}
