package typingsJapgolly.mongorito.mod

import typingsJapgolly.mongorito.AnonArgs
import typingsJapgolly.mongorito.mod.ActionTypes.CALL
import typingsJapgolly.mongorito.mod.ActionTypes.CREATE
import typingsJapgolly.mongorito.mod.ActionTypes.CREATED
import typingsJapgolly.mongorito.mod.ActionTypes.CREATE_INDEX
import typingsJapgolly.mongorito.mod.ActionTypes.DROP_INDEX
import typingsJapgolly.mongorito.mod.ActionTypes.GET
import typingsJapgolly.mongorito.mod.ActionTypes.INCREMENT
import typingsJapgolly.mongorito.mod.ActionTypes.LIST_INDEXES
import typingsJapgolly.mongorito.mod.ActionTypes.QUERY
import typingsJapgolly.mongorito.mod.ActionTypes.REFRESH
import typingsJapgolly.mongorito.mod.ActionTypes.REFRESHED
import typingsJapgolly.mongorito.mod.ActionTypes.REMOVE
import typingsJapgolly.mongorito.mod.ActionTypes.REMOVED
import typingsJapgolly.mongorito.mod.ActionTypes.SAVE
import typingsJapgolly.mongorito.mod.ActionTypes.SET
import typingsJapgolly.mongorito.mod.ActionTypes.UNSET
import typingsJapgolly.mongorito.mod.ActionTypes.UPDATE
import typingsJapgolly.mongorito.mod.ActionTypes.UPDATED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongorito.mod.GetAction
  - typingsJapgolly.mongorito.mod.SetAction
  - typingsJapgolly.mongorito.mod.UnsetAction
  - typingsJapgolly.mongorito.mod.RefreshAction
  - typingsJapgolly.mongorito.mod.RefreshedAction
  - typingsJapgolly.mongorito.mod.SaveAction
  - typingsJapgolly.mongorito.mod.CreateAction
  - typingsJapgolly.mongorito.mod.CreatedAction
  - typingsJapgolly.mongorito.mod.UpdateAction
  - typingsJapgolly.mongorito.mod.UpdatedAction
  - typingsJapgolly.mongorito.mod.RemoveAction
  - typingsJapgolly.mongorito.mod.RemovedAction
  - typingsJapgolly.mongorito.mod.IncrementAction
  - typingsJapgolly.mongorito.mod.CreateIndexAction
  - typingsJapgolly.mongorito.mod.DropIndexAction
  - typingsJapgolly.mongorito.mod.ListIndexesAction
  - typingsJapgolly.mongorito.mod.QueryAction
  - typingsJapgolly.mongorito.mod.CallAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def DropIndexAction(args: js.Array[_], `type`: DROP_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def QueryAction(method: String, query: js.Array[AnonArgs], `type`: QUERY): Action = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UpdateAction(fields: js.Object, `type`: UPDATE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateAction(id: js.Object, `type`: CREATE): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemoveAction(`type`: REMOVE): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CallAction(args: js.Array[AnonArgs], method: String, `type`: CALL): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SetAction(fields: js.Object, `type`: SET): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def GetAction(`type`: GET, key: String = null): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UnsetAction(keys: String | js.Array[String], `type`: UNSET): Action = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreateIndexAction(args: js.Array[_], `type`: CREATE_INDEX): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def UpdatedAction(fields: js.Object, `type`: UPDATED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CreatedAction(id: js.Object, `type`: CREATED): Action = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def ListIndexesAction(args: js.Array[_], `type`: LIST_INDEXES): Action = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshedAction(fields: js.Object, `type`: REFRESHED): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def SaveAction(fields: js.Object, `type`: SAVE): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RemovedAction(`type`: REMOVED): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def RefreshAction(`type`: REFRESH): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def IncrementAction(fields: js.Object, `type`: INCREMENT): Action = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

