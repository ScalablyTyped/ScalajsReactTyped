package typingsJapgolly.chai.Chai_

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericComparison extends js.Object {
  @JSName("above")
  var above_Original: NumberComparer = js.native
  @JSName("below")
  var below_Original: NumberComparer = js.native
  @JSName("greaterThan")
  var greaterThan_Original: NumberComparer = js.native
  @JSName("gt")
  var gt_Original: NumberComparer = js.native
  @JSName("gte")
  var gte_Original: NumberComparer = js.native
  @JSName("least")
  var least_Original: NumberComparer = js.native
  @JSName("lessThan")
  var lessThan_Original: NumberComparer = js.native
  @JSName("lt")
  var lt_Original: NumberComparer = js.native
  @JSName("lte")
  var lte_Original: NumberComparer = js.native
  @JSName("most")
  var most_Original: NumberComparer = js.native
  def above(value: Double): Assertion = js.native
  def above(value: Double, message: String): Assertion = js.native
  def above(value: Date): Assertion = js.native
  def above(value: Date, message: String): Assertion = js.native
  def below(value: Double): Assertion = js.native
  def below(value: Double, message: String): Assertion = js.native
  def below(value: Date): Assertion = js.native
  def below(value: Date, message: String): Assertion = js.native
  def greaterThan(value: Double): Assertion = js.native
  def greaterThan(value: Double, message: String): Assertion = js.native
  def greaterThan(value: Date): Assertion = js.native
  def greaterThan(value: Date, message: String): Assertion = js.native
  def gt(value: Double): Assertion = js.native
  def gt(value: Double, message: String): Assertion = js.native
  def gt(value: Date): Assertion = js.native
  def gt(value: Date, message: String): Assertion = js.native
  def gte(value: Double): Assertion = js.native
  def gte(value: Double, message: String): Assertion = js.native
  def gte(value: Date): Assertion = js.native
  def gte(value: Date, message: String): Assertion = js.native
  def least(value: Double): Assertion = js.native
  def least(value: Double, message: String): Assertion = js.native
  def least(value: Date): Assertion = js.native
  def least(value: Date, message: String): Assertion = js.native
  def lessThan(value: Double): Assertion = js.native
  def lessThan(value: Double, message: String): Assertion = js.native
  def lessThan(value: Date): Assertion = js.native
  def lessThan(value: Date, message: String): Assertion = js.native
  def lt(value: Double): Assertion = js.native
  def lt(value: Double, message: String): Assertion = js.native
  def lt(value: Date): Assertion = js.native
  def lt(value: Date, message: String): Assertion = js.native
  def lte(value: Double): Assertion = js.native
  def lte(value: Double, message: String): Assertion = js.native
  def lte(value: Date): Assertion = js.native
  def lte(value: Date, message: String): Assertion = js.native
  def most(value: Double): Assertion = js.native
  def most(value: Double, message: String): Assertion = js.native
  def most(value: Date): Assertion = js.native
  def most(value: Date, message: String): Assertion = js.native
  def within(start: Double, finish: Double): Assertion = js.native
  def within(start: Double, finish: Double, message: String): Assertion = js.native
  def within(start: Date, finish: Date): Assertion = js.native
  def within(start: Date, finish: Date, message: String): Assertion = js.native
}

