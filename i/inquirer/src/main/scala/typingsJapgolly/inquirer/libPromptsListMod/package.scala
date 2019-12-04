package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsListMod {
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.ListQuestionOptions

  /**
    * The question-options for the `ListPrompt<T>`.
    */
  type Question = ListQuestionOptions[Answers]
}
