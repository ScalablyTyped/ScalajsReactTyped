package typingsJapgolly.roll.mod

import typingsJapgolly.roll.AnonQuantity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Roll extends js.Object {
  /**
    * Parse a string into a roll object
    * @throws InvalidInputError
    */
  def parse(input: String): AnonQuantity = js.native
  /**
    * Roll based on a string or roll object
    */
  def roll(input: String): RollOutput = js.native
  def roll(input: RollObject): RollOutput = js.native
  /**
    * Validate user input
    */
  def validate(input: String): Boolean = js.native
}

