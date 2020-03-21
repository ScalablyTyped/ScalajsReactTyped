package typingsJapgolly.twilioVideo.mod

import typingsJapgolly.twilioVideo.twilioVideoNumbers.`53101`
import typingsJapgolly.twilioVideo.twilioVideoStrings.`Room name is too long`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RoomNameTooLongError")
@js.native
class RoomNameTooLongError () extends TwilioError {
  @JSName("code")
  var code_RoomNameTooLongError: `53101` = js.native
  @JSName("message")
  var message_RoomNameTooLongError: `Room name is too long` = js.native
}

