package typingsJapgolly.inquirer.libPromptsCheckboxMod

import typingsJapgolly.inquirer.inquirerMod.Answers
import typingsJapgolly.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt which provides a set of choices to check.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/checkbox", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected () extends CheckboxPrompt[TQuestion] {
  /**
    * Initializes a new instance of the `CheckboxPrompt<T>` class.
    *
    * @param question
    * The question to prompt the user to answer.
    *
    * @param readLine
    * An object for performing read from and write to the console.
    *
    * @param answers
    * The answer-object.
    */
  def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
}

