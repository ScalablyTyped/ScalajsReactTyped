package typingsJapgolly.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  /**
    * Represents a fetched answer.
    *
    * @template T
    * The type of the answers.
    */
  type FetchedQuestion[T /* <: typingsJapgolly.inquirer.mod.Answers */] = typingsJapgolly.inquirer.mod.DistinctQuestion[T] with typingsJapgolly.inquirer.AnonDefault[T]
}
