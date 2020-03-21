package typingsJapgolly.formstate

import typingsJapgolly.formstate.formStateMod.ValidatableMapOrArray
import typingsJapgolly.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasErrorValue[TValue /* <: ValidatableMapOrArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object AnonHasErrorValue {
  @scala.inline
  def apply[TValue /* <: ValidatableMapOrArray */](hasError: `false`, value: TValue): AnonHasErrorValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHasErrorValue[TValue]]
  }
}

