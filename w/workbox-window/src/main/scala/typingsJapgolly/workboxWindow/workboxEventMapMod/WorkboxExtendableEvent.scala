package typingsJapgolly.workboxWindow.workboxEventMapMod

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import typingsJapgolly.std.Event_
import typingsJapgolly.workboxWindow.workboxEventMod.WorkboxEvent
import typingsJapgolly.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxExtendableEvent extends WorkboxEvent {
  val sw: ServiceWorker
}

object WorkboxExtendableEvent {
  @scala.inline
  def apply(originalEvent: Event_, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxExtendableEvent]
  }
}

