package typingsJapgolly.jsprintmanager.mod.JSPM

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPrinter extends js.Object {
  var Id: js.Any
  def serialize(): js.Any
}

object IClientPrinter {
  @scala.inline
  def apply(Id: js.Any, serialize: CallbackTo[js.Any]): IClientPrinter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.updateDynamic("serialize")(serialize.toJsFn)
    __obj.asInstanceOf[IClientPrinter]
  }
}

