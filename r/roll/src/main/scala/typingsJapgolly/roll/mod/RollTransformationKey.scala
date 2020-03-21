package typingsJapgolly.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.roll.rollStrings.sum
  - typingsJapgolly.roll.rollStrings.add
  - typingsJapgolly.roll.rollStrings.subtract
  - typingsJapgolly.roll.rollStrings.multiply
  - typingsJapgolly.roll.rollStrings.divide
  - typingsJapgolly.roll.rollStrings.`best-of`
  - typingsJapgolly.roll.rollStrings.`worst-of`
*/
trait RollTransformationKey extends js.Object

object RollTransformationKey {
  @scala.inline
  def add: typingsJapgolly.roll.rollStrings.add = this.cast("add")
  @scala.inline
  def `best-of`: typingsJapgolly.roll.rollStrings.`best-of` = this.cast("best-of")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def divide: typingsJapgolly.roll.rollStrings.divide = this.cast("divide")
  @scala.inline
  def multiply: typingsJapgolly.roll.rollStrings.multiply = this.cast("multiply")
  @scala.inline
  def subtract: typingsJapgolly.roll.rollStrings.subtract = this.cast("subtract")
  @scala.inline
  def sum: typingsJapgolly.roll.rollStrings.sum = this.cast("sum")
  @scala.inline
  def `worst-of`: typingsJapgolly.roll.rollStrings.`worst-of` = this.cast("worst-of")
}

