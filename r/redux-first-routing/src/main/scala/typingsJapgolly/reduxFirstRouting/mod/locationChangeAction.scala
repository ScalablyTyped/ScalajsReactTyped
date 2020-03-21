package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.Hash
import typingsJapgolly.history.mod.Pathname
import typingsJapgolly.history.mod.Search
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxFirstRouting.AnonHash
import typingsJapgolly.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashLOCATION_CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait locationChangeAction[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */] extends Action[ROUTERSlashLOCATION_CHANGE] {
  var payload: AnonHash[P, S, H]
}

object locationChangeAction {
  @scala.inline
  def apply[P /* <: Pathname */, S /* <: Search */, H /* <: Hash */](payload: AnonHash[P, S, H], `type`: ROUTERSlashLOCATION_CHANGE): locationChangeAction[P, S, H] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationChangeAction[P, S, H]]
  }
}

