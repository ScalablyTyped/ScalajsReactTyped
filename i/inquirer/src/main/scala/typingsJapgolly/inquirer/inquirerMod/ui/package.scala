package typingsJapgolly.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  import typingsJapgolly.inquirer.Anon_ChoicesDefault
  import typingsJapgolly.inquirer.inquirerMod.Answers
  import typingsJapgolly.inquirer.inquirerMod.DistinctQuestion

  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] with Anon_ChoicesDefault[T]
}
