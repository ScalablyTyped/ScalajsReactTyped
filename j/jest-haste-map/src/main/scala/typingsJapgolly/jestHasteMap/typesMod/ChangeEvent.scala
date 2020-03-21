package typingsJapgolly.jestHasteMap.typesMod

import typingsJapgolly.jestHasteMap.hasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEvent extends js.Object {
  var eventsQueue: EventsQueue
  var hasteFS: default
  var moduleMap: typingsJapgolly.jestHasteMap.moduleMapMod.default
}

object ChangeEvent {
  @scala.inline
  def apply(
    eventsQueue: EventsQueue,
    hasteFS: default,
    moduleMap: typingsJapgolly.jestHasteMap.moduleMapMod.default
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(eventsQueue = eventsQueue.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

