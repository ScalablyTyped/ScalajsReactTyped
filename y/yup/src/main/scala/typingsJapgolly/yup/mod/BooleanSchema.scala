package typingsJapgolly.yup.mod

import typingsJapgolly.std.Exclude
import typingsJapgolly.yup.yupBooleans.`false`
import typingsJapgolly.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanSchema[T /* <: js.UndefOr[Boolean | Null] */] extends Schema[T] {
  def notRequired(): BooleanSchema[js.UndefOr[T]] = js.native
  def nullable(): BooleanSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): BooleanSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): BooleanSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): BooleanSchema[T | Null] = js.native
  def required(): BooleanSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): BooleanSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
}

