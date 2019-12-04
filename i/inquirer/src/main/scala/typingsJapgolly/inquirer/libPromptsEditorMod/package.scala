package typingsJapgolly.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsEditorMod {
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.EditorQuestionOptions

  /**
    * The question-options for the `EditorPrompt<T>`.
    */
  type Question = EditorQuestionOptions[Answers]
}
