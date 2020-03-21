package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpua extends js.Object {
  def pua_set_publish(): Double
  def pua_update_contact(): Double
}

object Typeofpua {
  @scala.inline
  def apply(pua_set_publish: CallbackTo[Double], pua_update_contact: CallbackTo[Double]): Typeofpua = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pua_set_publish")(pua_set_publish.toJsFn)
    __obj.updateDynamic("pua_update_contact")(pua_update_contact.toJsFn)
    __obj.asInstanceOf[Typeofpua]
  }
}

