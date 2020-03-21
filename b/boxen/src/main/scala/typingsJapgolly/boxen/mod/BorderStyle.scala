package typingsJapgolly.boxen.mod

import typingsJapgolly.boxen.boxenStrings.bold
import typingsJapgolly.boxen.boxenStrings.classic
import typingsJapgolly.boxen.boxenStrings.double
import typingsJapgolly.boxen.boxenStrings.doubleSingle
import typingsJapgolly.boxen.boxenStrings.round
import typingsJapgolly.boxen.boxenStrings.single
import typingsJapgolly.boxen.boxenStrings.singleDouble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.boxen.boxenStrings.single
  - typingsJapgolly.boxen.boxenStrings.double
  - typingsJapgolly.boxen.boxenStrings.round
  - typingsJapgolly.boxen.boxenStrings.bold
  - typingsJapgolly.boxen.boxenStrings.singleDouble
  - typingsJapgolly.boxen.boxenStrings.doubleSingle
  - typingsJapgolly.boxen.boxenStrings.classic
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  def Bold: bold = this.cast("bold")
  @scala.inline
  def Classic: classic = this.cast("classic")
  @scala.inline
  def Double: double = this.cast("double")
  @scala.inline
  def DoubleSingle: doubleSingle = this.cast("doubleSingle")
  @scala.inline
  def Round: round = this.cast("round")
  @scala.inline
  def Single: single = this.cast("single")
  @scala.inline
  def SingleDouble: singleDouble = this.cast("singleDouble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

