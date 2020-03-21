package typingsJapgolly.pusherChatkitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  type ReadCursorHook = js.Function1[
    /* cursor */ typingsJapgolly.pusherChatkitClient.roomMod.PusherReadCursor, 
    scala.Unit
  ]
  type RoomHook = js.Function1[/* room */ typingsJapgolly.pusherChatkitClient.roomMod.PusherRoom, scala.Unit]
  type RoomUserHook = js.Function2[
    /* room */ typingsJapgolly.pusherChatkitClient.roomMod.PusherRoom, 
    /* user */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
  type UserHook = js.Function1[/* room */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser, scala.Unit]
  type UserPresenceHook = js.Function2[
    /* state */ typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceState, 
    /* user */ typingsJapgolly.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
}
