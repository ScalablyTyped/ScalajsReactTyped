package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.LocationDescriptorObject
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.history.mod.Path
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashPUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pushAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashPUSH] {
  var payload: T
}

object pushAction {
  @scala.inline
  def apply[T /* <: Path | LocationDescriptorObject[LocationState] */](payload: T, `type`: ROUTERSlashPUSH): pushAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pushAction[T]]
  }
}

