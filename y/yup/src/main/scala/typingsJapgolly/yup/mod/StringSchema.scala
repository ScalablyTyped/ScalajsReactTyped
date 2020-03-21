package typingsJapgolly.yup.mod

import typingsJapgolly.std.Exclude
import typingsJapgolly.yup.AnonExcludeEmptyString
import typingsJapgolly.yup.AnonLength
import typingsJapgolly.yup.AnonMax
import typingsJapgolly.yup.AnonMin
import typingsJapgolly.yup.AnonRegex
import typingsJapgolly.yup.yupBooleans.`false`
import typingsJapgolly.yup.yupBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema[T /* <: js.UndefOr[String | Null] */] extends Schema[T] {
  def email(): StringSchema[T] = js.native
  def email(message: TestOptionsMessage[AnonRegex, _]): StringSchema[T] = js.native
  def ensure(): StringSchema[T] = js.native
  def length(limit: Double): StringSchema[T] = js.native
  def length(limit: Double, message: TestOptionsMessage[AnonLength, _]): StringSchema[T] = js.native
  def length(limit: Ref_): StringSchema[T] = js.native
  def length(limit: Ref_, message: TestOptionsMessage[AnonLength, _]): StringSchema[T] = js.native
  def lowercase(): StringSchema[T] = js.native
  def lowercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def matches(regex: js.RegExp): StringSchema[T] = js.native
  def matches(regex: js.RegExp, messageOrOptions: AnonExcludeEmptyString): StringSchema[T] = js.native
  def matches(regex: js.RegExp, messageOrOptions: TestOptionsMessage[AnonRegex, _]): StringSchema[T] = js.native
  def max(limit: Double): StringSchema[T] = js.native
  def max(limit: Double, message: TestOptionsMessage[AnonMax, _]): StringSchema[T] = js.native
  def max(limit: Ref_): StringSchema[T] = js.native
  def max(limit: Ref_, message: TestOptionsMessage[AnonMax, _]): StringSchema[T] = js.native
  def min(limit: Double): StringSchema[T] = js.native
  def min(limit: Double, message: TestOptionsMessage[AnonMin, _]): StringSchema[T] = js.native
  def min(limit: Ref_): StringSchema[T] = js.native
  def min(limit: Ref_, message: TestOptionsMessage[AnonMin, _]): StringSchema[T] = js.native
  def notRequired(): StringSchema[js.UndefOr[T]] = js.native
  def nullable(): StringSchema[T | Null] = js.native
  def nullable(isNullable: Boolean): StringSchema[T] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): StringSchema[Exclude[T, Null]] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): StringSchema[T | Null] = js.native
  def required(): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def required(message: TestOptionsMessage[js.Object, _]): StringSchema[Exclude[T, js.UndefOr[scala.Nothing]]] = js.native
  def trim(): StringSchema[T] = js.native
  def trim(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def uppercase(): StringSchema[T] = js.native
  def uppercase(message: TestOptionsMessage[js.Object, _]): StringSchema[T] = js.native
  def url(): StringSchema[T] = js.native
  def url(message: TestOptionsMessage[AnonRegex, _]): StringSchema[T] = js.native
}

