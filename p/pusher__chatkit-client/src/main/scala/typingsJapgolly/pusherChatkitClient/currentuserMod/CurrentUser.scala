package typingsJapgolly.pusherChatkitClient.currentuserMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherChatkitClient.hooksMod.UserAndRoomParams
import typingsJapgolly.pusherChatkitClient.messageMod.PusherMessage
import typingsJapgolly.pusherChatkitClient.roomMod.PusherReadCursor
import typingsJapgolly.pusherChatkitClient.roomMod.PusherRoom
import typingsJapgolly.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  var roomSubscriptions: RoomSubscriptions
  var rooms: js.Array[PusherRoom]
  var users: js.Array[PusherUser]
  def addUserToRoom(params: UserAndRoomParams): js.Promise[Unit]
  def createRoom(params: CreateRoomParams): js.Promise[PusherRoom]
  def deleteRoom(params: RoomIdParams): js.Promise[Unit]
  def disconnect(): js.Promise[Unit]
  def enablePushNotifications(): js.Promise[Unit]
  def fetchMultipartMessages(params: FetchMultipartMessagesParams): js.Promise[js.Array[PusherMessage]]
  def getJoinableRooms(): js.Promise[js.Array[PusherRoom]]
  def isTypingIn(params: RoomIdParams): js.Promise[Unit]
  def joinRoom(params: RoomIdParams): js.Promise[PusherRoom]
  def leaveRoom(params: RoomIdParams): js.Promise[PusherRoom]
  def readCursor(params: ReadCursorParams): js.Promise[PusherReadCursor]
  def removeUserFromRoom(params: UserAndRoomParams): js.Promise[Unit]
  def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double]
  def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double]
  def setReadCursor(params: SetReadCursorParams): js.Promise[Unit]
  def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom]
  def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom]
}

object CurrentUser {
  @scala.inline
  def apply(
    addUserToRoom: UserAndRoomParams => CallbackTo[js.Promise[Unit]],
    createRoom: CreateRoomParams => CallbackTo[js.Promise[PusherRoom]],
    deleteRoom: RoomIdParams => CallbackTo[js.Promise[Unit]],
    disconnect: CallbackTo[js.Promise[Unit]],
    enablePushNotifications: CallbackTo[js.Promise[Unit]],
    fetchMultipartMessages: FetchMultipartMessagesParams => CallbackTo[js.Promise[js.Array[PusherMessage]]],
    getJoinableRooms: CallbackTo[js.Promise[js.Array[PusherRoom]]],
    isTypingIn: RoomIdParams => CallbackTo[js.Promise[Unit]],
    joinRoom: RoomIdParams => CallbackTo[js.Promise[PusherRoom]],
    leaveRoom: RoomIdParams => CallbackTo[js.Promise[PusherRoom]],
    readCursor: ReadCursorParams => CallbackTo[js.Promise[PusherReadCursor]],
    removeUserFromRoom: UserAndRoomParams => CallbackTo[js.Promise[Unit]],
    roomSubscriptions: RoomSubscriptions,
    rooms: js.Array[PusherRoom],
    sendMultipartMessage: SendMultipartMessageParams => CallbackTo[js.Promise[Double]],
    sendSimpleMessage: SendSimpleMessageParams => CallbackTo[js.Promise[Double]],
    setReadCursor: SetReadCursorParams => CallbackTo[js.Promise[Unit]],
    subscribeToRoomMultipart: RoomSubcriptionParams => CallbackTo[js.Promise[PusherRoom]],
    updateRoom: UpdateRoomParams => CallbackTo[js.Promise[PusherRoom]],
    users: js.Array[PusherUser]
  ): CurrentUser = {
    val __obj = js.Dynamic.literal(roomSubscriptions = roomSubscriptions.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("addUserToRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.hooksMod.UserAndRoomParams) => addUserToRoom(t0).runNow()))
    __obj.updateDynamic("createRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.CreateRoomParams) => createRoom(t0).runNow()))
    __obj.updateDynamic("deleteRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.RoomIdParams) => deleteRoom(t0).runNow()))
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("enablePushNotifications")(enablePushNotifications.toJsFn)
    __obj.updateDynamic("fetchMultipartMessages")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.FetchMultipartMessagesParams) => fetchMultipartMessages(t0).runNow()))
    __obj.updateDynamic("getJoinableRooms")(getJoinableRooms.toJsFn)
    __obj.updateDynamic("isTypingIn")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.RoomIdParams) => isTypingIn(t0).runNow()))
    __obj.updateDynamic("joinRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.RoomIdParams) => joinRoom(t0).runNow()))
    __obj.updateDynamic("leaveRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.RoomIdParams) => leaveRoom(t0).runNow()))
    __obj.updateDynamic("readCursor")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.ReadCursorParams) => readCursor(t0).runNow()))
    __obj.updateDynamic("removeUserFromRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.hooksMod.UserAndRoomParams) => removeUserFromRoom(t0).runNow()))
    __obj.updateDynamic("sendMultipartMessage")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.SendMultipartMessageParams) => sendMultipartMessage(t0).runNow()))
    __obj.updateDynamic("sendSimpleMessage")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.SendSimpleMessageParams) => sendSimpleMessage(t0).runNow()))
    __obj.updateDynamic("setReadCursor")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.SetReadCursorParams) => setReadCursor(t0).runNow()))
    __obj.updateDynamic("subscribeToRoomMultipart")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.RoomSubcriptionParams) => subscribeToRoomMultipart(t0).runNow()))
    __obj.updateDynamic("updateRoom")(js.Any.fromFunction1((t0: typingsJapgolly.pusherChatkitClient.currentuserMod.UpdateRoomParams) => updateRoom(t0).runNow()))
    __obj.asInstanceOf[CurrentUser]
  }
}

