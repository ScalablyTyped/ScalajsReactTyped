package typingsJapgolly.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomResponse extends js.Object {
  /**
    * The room details.
    */
  var Room: js.UndefOr[typingsJapgolly.awsSdk.chimeMod.Room] = js.native
}

object CreateRoomResponse {
  @scala.inline
  def apply(Room: Room = null): CreateRoomResponse = {
    val __obj = js.Dynamic.literal()
    if (Room != null) __obj.updateDynamic("Room")(Room.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomResponse]
  }
}

