package typingsJapgolly.durandal.binderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingInstruction extends js.Object {
  var applyBindings: Boolean
}

object BindingInstruction {
  @scala.inline
  def apply(applyBindings: Boolean): BindingInstruction = {
    val __obj = js.Dynamic.literal(applyBindings = applyBindings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BindingInstruction]
  }
}

