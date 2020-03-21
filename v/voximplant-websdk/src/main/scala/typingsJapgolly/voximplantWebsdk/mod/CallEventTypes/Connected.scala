package typingsJapgolly.voximplantWebsdk.mod.CallEventTypes

import typingsJapgolly.voximplantWebsdk.mod.Call
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after call was connected
		*/
trait Connected extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
  /**
  			*	Optional SIP headers received with the message
  			*/
  var headers: js.UndefOr[js.Object] = js.undefined
}

object Connected {
  @scala.inline
  def apply(call: Call, headers: js.Object = null): Connected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connected]
  }
}

