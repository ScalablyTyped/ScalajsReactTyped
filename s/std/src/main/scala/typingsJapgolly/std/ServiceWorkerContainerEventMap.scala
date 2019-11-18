package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerContainerEventMap extends js.Object {
  var controllerchange: org.scalajs.dom.raw.Event
  var message: org.scalajs.dom.raw.MessageEvent
  var messageerror: org.scalajs.dom.raw.MessageEvent
}

object ServiceWorkerContainerEventMap {
  @scala.inline
  def apply(
    controllerchange: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    messageerror: org.scalajs.dom.raw.MessageEvent
  ): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
}

