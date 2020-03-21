package typingsJapgolly.yup.mod

import typingsJapgolly.std.Exclude
import typingsJapgolly.yup.AnonLess
import typingsJapgolly.yup.AnonMax
import typingsJapgolly.yup.AnonMin
import typingsJapgolly.yup.AnonMore
import typingsJapgolly.yup.yupBooleans.`false`
import typingsJapgolly.yup.yupBooleans.`true`
import typingsJapgolly.yup.yupStrings.ceil
import typingsJapgolly.yup.yupStrings.floor
import typingsJapgolly.yup.yupStrings.round
import typingsJapgolly.yup.yupStrings.trunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSchema[T /* <: js.UndefOr[Double | Null] */] extends Schema[T] {
  def integer(): NumberSchema[T] = js.native
  def integer(message: TestOptionsMessage[js.Object, _]): NumberSchema[T] = js.native
  def lessThan(limit: Double): NumberSchema[T] = js.native
  def lessThan(limit: Double, message: TestOptionsMessage[AnonLess, _]): NumberSchema[T] = js.native
  def lessThan(limit: Ref_): NumberSchema[T] = js.native
  def lessThan(limit: Ref_, message: TestOptionsMessage[AnonLess, _]): NumberSchema[T] = js.native
  def max(limit: Double): NumberSchema[T] = js.native
  def max(limit: Double, message: TestOptionsMessage[AnonMax, _]): NumberSchema[T] = js.native
  def max(limit: Ref_): NumberSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[AnonMax, _]): NumberSchema[T] = js.native
  def min(limit: Double): NumberSchema[T] = js.native
  def min(limit: Double, message: TestOptionsMessage[AnonMin, _]): NumberSchema[T] = js.native
  def min(limit: Ref_): NumberSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[AnonMin, _]): NumberSchema[T] = js.native
  def moreThan(limit: Double): NumberSchema[T] = js.native
  def moreThan(limit: Double, message: TestOptionsMessage[AnonMore, _]): NumberSchema[T] = js.native
  def moreThan(limit: Ref_): NumberSchema[T] = js.native
  def moreThan(limit: Ref_, message: TestOptionsMessage[AnonMore, _]): NumberSchema[T] = js.native
  def negative(): NumberSchema[T] = js.native
  def negative(message: TestOptionsMessage[AnonLess, _]): NumberSchema[T] = js.native
  def notRequired(): NumberSchema[js.UndefOr[T]] = js.native
  def nullable(): NumberSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): NumberSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): NumberSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): NumberSchema[T | Null] = js.native
  def positive(): NumberSchema[T] = js.native
  def positive(message: TestOptionsMessage[AnonMore, _]): NumberSchema[T] = js.native
  def required(): NumberSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): NumberSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  @JSName("round")
  def round_ceil(`type`: ceil): NumberSchema[T] = js.native
  @JSName("round")
  def round_floor(`type`: floor): NumberSchema[T] = js.native
  @JSName("round")
  def round_round(`type`: round): NumberSchema[T] = js.native
  @JSName("round")
  def round_trunc(`type`: trunc): NumberSchema[T] = js.native
  def truncate(): NumberSchema[T] = js.native
}

