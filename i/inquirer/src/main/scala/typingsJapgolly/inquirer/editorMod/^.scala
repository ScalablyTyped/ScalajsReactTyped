package typingsJapgolly.inquirer.editorMod

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt which provides a text-editor.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/editor", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected () extends EditorPrompt[TQuestion] {
  /**
    * Initializes a new instance of the `EditorPrompt<T>` class.
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

