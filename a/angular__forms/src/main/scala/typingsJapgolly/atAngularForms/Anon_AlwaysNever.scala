package typingsJapgolly.atAngularForms

import typingsJapgolly.atAngularForms.atAngularFormsStrings.always
import typingsJapgolly.atAngularForms.atAngularFormsStrings.never
import typingsJapgolly.atAngularForms.atAngularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysNever extends js.Object {
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always
}

object Anon_AlwaysNever {
  @scala.inline
  def apply(warnOnNgModelWithFormControl: never | once | always): Anon_AlwaysNever = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlwaysNever]
  }
}

