package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.UserStatuses
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when self presence updated
		*/
trait PresenceUpdate extends VoxImplantIMEvent {
  /**
  			* User id
  			*/
  var id: String
  /**
  			*	Status message
  			*/
  var message: String
  /**
  			*	Current presence status
  			*/
  var presence: UserStatuses
  /**
  			*	Resource name
  			*/
  var resource: js.UndefOr[String] = js.undefined
}

object PresenceUpdate {
  @scala.inline
  def apply(id: String, message: String, presence: UserStatuses, resource: String = null): PresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceUpdate]
  }
}

