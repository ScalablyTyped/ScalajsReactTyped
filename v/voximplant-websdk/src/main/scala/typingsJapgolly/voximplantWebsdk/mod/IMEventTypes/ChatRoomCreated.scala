package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		* Event dispatched if chat room was created successfully
		*/
trait ChatRoomCreated extends VoxImplantIMEvent {
  /**
  			* Room id
  			*/
  var room: String
}

object ChatRoomCreated {
  @scala.inline
  def apply(room: String): ChatRoomCreated = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChatRoomCreated]
  }
}

