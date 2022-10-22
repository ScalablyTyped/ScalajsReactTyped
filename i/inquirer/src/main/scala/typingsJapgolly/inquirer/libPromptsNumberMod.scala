package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.NumberQuestionOptions
import typingsJapgolly.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsNumberMod {
  
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/number", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected ()
    extends typingsJapgolly.inquirer.libPromptsInputMod.default[TQuestion] {
    /**
      * Initializes a new instance of the {@link NumberPrompt `NumberPrompt<TQuestion>`} class.
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
  
  /**
    * Provides a prompt which allows the user to type a number as answer.
    *
    * @template TQuestion
    * The options for the question.
    */
  type NumberPrompt[TQuestion /* <: Question */] = typingsJapgolly.inquirer.libPromptsInputMod.default[TQuestion]
  
  /**
    * The question for the {@link NumberPrompt `NumberPrompt<TQuestion>`}.
    */
  type Question = NumberQuestionOptions[Answers]
}
