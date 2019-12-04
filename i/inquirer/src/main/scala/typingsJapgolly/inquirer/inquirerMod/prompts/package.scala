package typingsJapgolly.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prompts {
  import typingsJapgolly.inquirer.Anon_Choices
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.LiteralUnion
  import typingsJapgolly.inquirer.inquirerMod.Question
  import typingsJapgolly.inquirer.inquirerStrings.answered
  import typingsJapgolly.inquirer.inquirerStrings.done
  import typingsJapgolly.inquirer.inquirerStrings.idle
  import typingsJapgolly.inquirer.inquirerStrings.loading
  import typingsJapgolly.inquirer.inquirerStrings.pending
  import typingsJapgolly.std.Record

  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = Record[String, PromptConstructor]
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: Question[Answers] */] = T with Anon_Choices
  /**
    * Represents the state of a prompt.
    */
  type PromptState = LiteralUnion[pending | idle | loading | answered | done, String]
}
