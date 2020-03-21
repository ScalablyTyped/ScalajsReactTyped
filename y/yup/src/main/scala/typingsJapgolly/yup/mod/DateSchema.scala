package typingsJapgolly.yup.mod

import typingsJapgolly.std.Date
import typingsJapgolly.std.Exclude
import typingsJapgolly.yup.Anon0
import typingsJapgolly.yup.Anon1
import typingsJapgolly.yup.yupBooleans.`false`
import typingsJapgolly.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema[T /* <: js.UndefOr[js.Date | Null] */] extends Schema[T] {
  def max(limit: String): DateSchema[T] = js.native
  def max(limit: String, message: TestOptionsMessage[Anon1, _]): DateSchema[T] = js.native
  def max(limit: Date): DateSchema[T] = js.native
  def max(limit: Date, message: TestOptionsMessage[Anon1, _]): DateSchema[T] = js.native
  def max(limit: Ref_): DateSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[Anon1, _]): DateSchema[T] = js.native
  def min(limit: String): DateSchema[T] = js.native
  def min(limit: String, message: TestOptionsMessage[Anon0, _]): DateSchema[T] = js.native
  def min(limit: Date): DateSchema[T] = js.native
  def min(limit: Date, message: TestOptionsMessage[Anon0, _]): DateSchema[T] = js.native
  def min(limit: Ref_): DateSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[Anon0, _]): DateSchema[T] = js.native
  def notRequired(): DateSchema[js.UndefOr[T]] = js.native
  def nullable(): DateSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): DateSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): DateSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): DateSchema[T | Null] = js.native
  def required(): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): DateSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

