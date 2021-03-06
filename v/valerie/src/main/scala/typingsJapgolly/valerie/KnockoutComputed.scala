package typingsJapgolly.valerie

import typingsJapgolly.valerie.Valerie_.PropertyValidationState
import typingsJapgolly.valerie.Valerie_.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputed[T] extends js.Object {
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutComputed[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutComputed[T]] = js.native
}

