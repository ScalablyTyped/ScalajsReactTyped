package typingsJapgolly.physijs.Physijs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  def getDefinition(): js.Any
}

object Constraint {
  @scala.inline
  def apply(getDefinition: CallbackTo[js.Any]): Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefinition")(getDefinition.toJsFn)
    __obj.asInstanceOf[Constraint]
  }
}

