package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataEvent extends EventItem {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any
  var event: EVENT_BUILD
  var objectId: String
}

object AnonDataEvent {
  @scala.inline
  def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any,
    event: EVENT_BUILD,
    objectId: String
  ): AnonDataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataEvent]
  }
}

