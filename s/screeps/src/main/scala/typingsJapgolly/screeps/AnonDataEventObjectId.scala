package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEventObjectId extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any
  var event: EVENT_HEAL
  var objectId: String
}

object AnonDataEventObjectId {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any,
    event: EVENT_HEAL,
    objectId: String
  ): AnonDataEventObjectId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataEventObjectId]
  }
}

