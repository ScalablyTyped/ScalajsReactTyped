package typingsJapgolly.slickgrid

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelCurrentEdit extends js.Object {
  def cancelCurrentEdit(): Boolean
  def commitCurrentEdit(): Boolean
}

object AnonCancelCurrentEdit {
  @scala.inline
  def apply(cancelCurrentEdit: CallbackTo[Boolean], commitCurrentEdit: CallbackTo[Boolean]): AnonCancelCurrentEdit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelCurrentEdit")(cancelCurrentEdit.toJsFn)
    __obj.updateDynamic("commitCurrentEdit")(commitCurrentEdit.toJsFn)
    __obj.asInstanceOf[AnonCancelCurrentEdit]
  }
}

