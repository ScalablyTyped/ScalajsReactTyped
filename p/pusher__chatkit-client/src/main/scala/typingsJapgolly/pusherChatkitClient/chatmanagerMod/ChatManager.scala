package typingsJapgolly.pusherChatkitClient.chatmanagerMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.pusherChatkitClient.currentuserMod.CurrentUser
import typingsJapgolly.pusherChatkitClient.hooksMod.RoomParams
import typingsJapgolly.pusherChatkitClient.hooksMod.UserParams
import typingsJapgolly.pusherChatkitClient.roomMod.PusherRoom
import typingsJapgolly.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatManager extends js.Object {
  def connect(): js.Promise[CurrentUser] = js.native
  def connect(hooks: GlobalHooks): js.Promise[CurrentUser] = js.native
  def disablePushNotifications(): js.Promise[Unit] = js.native
  def getRoom(params: RoomParams): js.Promise[PusherRoom] = js.native
  def getUser(params: UserParams): js.Promise[PusherUser] = js.native
}

@JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
@js.native
object ChatManager extends TopLevel[ChatManagerConstructor]

