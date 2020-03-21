package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prompts {
  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.inquirer.mod.prompts.PromptConstructor]
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: typingsJapgolly.inquirer.mod.Question[typingsJapgolly.inquirer.mod.Answers] */] = T with typingsJapgolly.inquirer.AnonChoices
  /**
    * Represents the state of a prompt.
    */
  type PromptState = typingsJapgolly.inquirer.mod.LiteralUnion[
    typingsJapgolly.inquirer.inquirerStrings.pending | typingsJapgolly.inquirer.inquirerStrings.idle | typingsJapgolly.inquirer.inquirerStrings.loading | typingsJapgolly.inquirer.inquirerStrings.answered | typingsJapgolly.inquirer.inquirerStrings.done, 
    java.lang.String
  ]
}
