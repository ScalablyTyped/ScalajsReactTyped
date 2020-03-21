package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
  */
trait IEntityTickEventData extends js.Object {
  /**
    * The entity that was ticked
    */
  var entity: IEntity
}

object IEntityTickEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityTickEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityTickEventData]
  }
}

