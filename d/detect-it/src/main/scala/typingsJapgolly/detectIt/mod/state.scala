package typingsJapgolly.detectIt.mod

import typingsJapgolly.detectHover.mod.detectHover
import typingsJapgolly.detectPassiveEvents.mod.detectPassiveEvents
import typingsJapgolly.detectPointer.mod.detectPointer
import typingsJapgolly.detectTouchEvents.mod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: typingsJapgolly.detectHover.mod.detectHover
  var detectPassiveEvents: typingsJapgolly.detectPassiveEvents.mod.detectPassiveEvents
  var detectPointer: typingsJapgolly.detectPointer.mod.detectPointer
  var detectTouchEvents: typingsJapgolly.detectTouchEvents.mod.detectTouchEvents
}

object state {
  @scala.inline
  def apply(
    detectHover: detectHover,
    detectPassiveEvents: detectPassiveEvents,
    detectPointer: detectPointer,
    detectTouchEvents: detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal(detectHover = detectHover.asInstanceOf[js.Any], detectPassiveEvents = detectPassiveEvents.asInstanceOf[js.Any], detectPointer = detectPointer.asInstanceOf[js.Any], detectTouchEvents = detectTouchEvents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[state]
  }
}

