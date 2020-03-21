package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashGO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait goAction[T /* <: Double */] extends Action[ROUTERSlashGO] {
  var payload: T
}

object goAction {
  @scala.inline
  def apply[T /* <: Double */](payload: T, `type`: ROUTERSlashGO): goAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[goAction[T]]
  }
}

