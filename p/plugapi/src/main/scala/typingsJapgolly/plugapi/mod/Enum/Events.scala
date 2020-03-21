package typingsJapgolly.plugapi.mod.Enum

import typingsJapgolly.plugapi.plugapiStrings.advance
import typingsJapgolly.plugapi.plugapiStrings.ban
import typingsJapgolly.plugapi.plugapiStrings.boothLocked
import typingsJapgolly.plugapi.plugapiStrings.chat
import typingsJapgolly.plugapi.plugapiStrings.chatDelete
import typingsJapgolly.plugapi.plugapiStrings.command
import typingsJapgolly.plugapi.plugapiStrings.djListCycle
import typingsJapgolly.plugapi.plugapiStrings.djListLocked
import typingsJapgolly.plugapi.plugapiStrings.djListUpdate
import typingsJapgolly.plugapi.plugapiStrings.earn
import typingsJapgolly.plugapi.plugapiStrings.floodChat
import typingsJapgolly.plugapi.plugapiStrings.followJoin
import typingsJapgolly.plugapi.plugapiStrings.friendRequest
import typingsJapgolly.plugapi.plugapiStrings.gifted
import typingsJapgolly.plugapi.plugapiStrings.grab
import typingsJapgolly.plugapi.plugapiStrings.killSession
import typingsJapgolly.plugapi.plugapiStrings.modAddDJ
import typingsJapgolly.plugapi.plugapiStrings.modAddWaitList
import typingsJapgolly.plugapi.plugapiStrings.modAmbassador
import typingsJapgolly.plugapi.plugapiStrings.modBan
import typingsJapgolly.plugapi.plugapiStrings.modMoveDJ
import typingsJapgolly.plugapi.plugapiStrings.modMute
import typingsJapgolly.plugapi.plugapiStrings.modRemoveDJ
import typingsJapgolly.plugapi.plugapiStrings.modRemoveWaitList
import typingsJapgolly.plugapi.plugapiStrings.modSkip
import typingsJapgolly.plugapi.plugapiStrings.modStaff
import typingsJapgolly.plugapi.plugapiStrings.notify
import typingsJapgolly.plugapi.plugapiStrings.pdjMessage
import typingsJapgolly.plugapi.plugapiStrings.pdjUpdate
import typingsJapgolly.plugapi.plugapiStrings.ping
import typingsJapgolly.plugapi.plugapiStrings.playlistCycle
import typingsJapgolly.plugapi.plugapiStrings.plugMaintenance
import typingsJapgolly.plugapi.plugapiStrings.plugMaintenanceAlert
import typingsJapgolly.plugapi.plugapiStrings.requestDuration
import typingsJapgolly.plugapi.plugapiStrings.requestDurationRetry
import typingsJapgolly.plugapi.plugapiStrings.roomChanged
import typingsJapgolly.plugapi.plugapiStrings.roomDescriptionUpdate
import typingsJapgolly.plugapi.plugapiStrings.roomJoin
import typingsJapgolly.plugapi.plugapiStrings.roomMinChatLevelUpdate
import typingsJapgolly.plugapi.plugapiStrings.roomNameUpdate
import typingsJapgolly.plugapi.plugapiStrings.roomVoteSkip
import typingsJapgolly.plugapi.plugapiStrings.roomWelcomeUpdate
import typingsJapgolly.plugapi.plugapiStrings.sessionClose
import typingsJapgolly.plugapi.plugapiStrings.skip
import typingsJapgolly.plugapi.plugapiStrings.strobeToggle
import typingsJapgolly.plugapi.plugapiStrings.userCounterUpdate
import typingsJapgolly.plugapi.plugapiStrings.userFollow
import typingsJapgolly.plugapi.plugapiStrings.userJoin
import typingsJapgolly.plugapi.plugapiStrings.userLeave
import typingsJapgolly.plugapi.plugapiStrings.userUpdate
import typingsJapgolly.plugapi.plugapiStrings.vote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var ADVANCE: advance
  var BAN: ban
  var BOOTH_LOCKED: boothLocked
  var CHAT: chat
  var CHAT_COMMAND: command
  var CHAT_DELETE: chatDelete
  var CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate
  var COMMAND: command
  var DJ_LIST_CYCLE: djListCycle
  var DJ_LIST_LOCKED: djListLocked
  var DJ_LIST_UPDATE: djListUpdate
  var EARN: earn
  var FLOOD_CHAT: floodChat
  var FOLLOW_JOIN: followJoin
  var FRIEND_REQUEST: friendRequest
  var GIFTED: gifted
  var GRAB: grab
  var KILL_SESSION: killSession
  var MAINT_MODE: plugMaintenance
  var MAINT_MODE_ALERT: plugMaintenanceAlert
  var MODERATE_ADD_DJ: modAddDJ
  var MODERATE_ADD_WAITLIST: modAddWaitList
  var MODERATE_AMBASSADOR: modAmbassador
  var MODERATE_BAN: modBan
  var MODERATE_MOVE_DJ: modMoveDJ
  var MODERATE_MUTE: modMute
  var MODERATE_REMOVE_DJ: modRemoveDJ
  var MODERATE_REMOVE_WAITLIST: modRemoveWaitList
  var MODERATE_SKIP: modSkip
  var MODERATE_STAFF: modStaff
  var NOTIFY: notify
  var PDJ_MESSAGE: pdjMessage
  var PDJ_UPDATE: pdjUpdate
  var PING: ping
  var PLAYLIST_CYCLE: playlistCycle
  var REQUEST_DURATION: requestDuration
  var REQUEST_DURATION_RETRY: requestDurationRetry
  var ROOM_CHANGE: roomChanged
  var ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate
  var ROOM_JOIN: roomJoin
  var ROOM_NAME_UPDATE: roomNameUpdate
  var ROOM_VOTE_SKIP: roomVoteSkip
  var ROOM_WELCOME_UPDATE: roomWelcomeUpdate
  var SESSION_CLOSE: sessionClose
  var SKIP: skip
  var STROBE_TOGGLE: strobeToggle
  var USER_COUNTER_UPDATE: userCounterUpdate
  var USER_FOLLOW: userFollow
  var USER_JOIN: userJoin
  var USER_LEAVE: userLeave
  var USER_UPDATE: userUpdate
  var VOTE: vote
}

object Events {
  @scala.inline
  def apply(
    ADVANCE: advance,
    BAN: ban,
    BOOTH_LOCKED: boothLocked,
    CHAT: chat,
    CHAT_COMMAND: command,
    CHAT_DELETE: chatDelete,
    CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate,
    COMMAND: command,
    DJ_LIST_CYCLE: djListCycle,
    DJ_LIST_LOCKED: djListLocked,
    DJ_LIST_UPDATE: djListUpdate,
    EARN: earn,
    FLOOD_CHAT: floodChat,
    FOLLOW_JOIN: followJoin,
    FRIEND_REQUEST: friendRequest,
    GIFTED: gifted,
    GRAB: grab,
    KILL_SESSION: killSession,
    MAINT_MODE: plugMaintenance,
    MAINT_MODE_ALERT: plugMaintenanceAlert,
    MODERATE_ADD_DJ: modAddDJ,
    MODERATE_ADD_WAITLIST: modAddWaitList,
    MODERATE_AMBASSADOR: modAmbassador,
    MODERATE_BAN: modBan,
    MODERATE_MOVE_DJ: modMoveDJ,
    MODERATE_MUTE: modMute,
    MODERATE_REMOVE_DJ: modRemoveDJ,
    MODERATE_REMOVE_WAITLIST: modRemoveWaitList,
    MODERATE_SKIP: modSkip,
    MODERATE_STAFF: modStaff,
    NOTIFY: notify,
    PDJ_MESSAGE: pdjMessage,
    PDJ_UPDATE: pdjUpdate,
    PING: ping,
    PLAYLIST_CYCLE: playlistCycle,
    REQUEST_DURATION: requestDuration,
    REQUEST_DURATION_RETRY: requestDurationRetry,
    ROOM_CHANGE: roomChanged,
    ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate,
    ROOM_JOIN: roomJoin,
    ROOM_NAME_UPDATE: roomNameUpdate,
    ROOM_VOTE_SKIP: roomVoteSkip,
    ROOM_WELCOME_UPDATE: roomWelcomeUpdate,
    SESSION_CLOSE: sessionClose,
    SKIP: skip,
    STROBE_TOGGLE: strobeToggle,
    USER_COUNTER_UPDATE: userCounterUpdate,
    USER_FOLLOW: userFollow,
    USER_JOIN: userJoin,
    USER_LEAVE: userLeave,
    USER_UPDATE: userUpdate,
    VOTE: vote
  ): Events = {
    val __obj = js.Dynamic.literal(ADVANCE = ADVANCE.asInstanceOf[js.Any], BAN = BAN.asInstanceOf[js.Any], BOOTH_LOCKED = BOOTH_LOCKED.asInstanceOf[js.Any], CHAT = CHAT.asInstanceOf[js.Any], CHAT_COMMAND = CHAT_COMMAND.asInstanceOf[js.Any], CHAT_DELETE = CHAT_DELETE.asInstanceOf[js.Any], CHAT_LEVEL_UPDATE = CHAT_LEVEL_UPDATE.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], DJ_LIST_CYCLE = DJ_LIST_CYCLE.asInstanceOf[js.Any], DJ_LIST_LOCKED = DJ_LIST_LOCKED.asInstanceOf[js.Any], DJ_LIST_UPDATE = DJ_LIST_UPDATE.asInstanceOf[js.Any], EARN = EARN.asInstanceOf[js.Any], FLOOD_CHAT = FLOOD_CHAT.asInstanceOf[js.Any], FOLLOW_JOIN = FOLLOW_JOIN.asInstanceOf[js.Any], FRIEND_REQUEST = FRIEND_REQUEST.asInstanceOf[js.Any], GIFTED = GIFTED.asInstanceOf[js.Any], GRAB = GRAB.asInstanceOf[js.Any], KILL_SESSION = KILL_SESSION.asInstanceOf[js.Any], MAINT_MODE = MAINT_MODE.asInstanceOf[js.Any], MAINT_MODE_ALERT = MAINT_MODE_ALERT.asInstanceOf[js.Any], MODERATE_ADD_DJ = MODERATE_ADD_DJ.asInstanceOf[js.Any], MODERATE_ADD_WAITLIST = MODERATE_ADD_WAITLIST.asInstanceOf[js.Any], MODERATE_AMBASSADOR = MODERATE_AMBASSADOR.asInstanceOf[js.Any], MODERATE_BAN = MODERATE_BAN.asInstanceOf[js.Any], MODERATE_MOVE_DJ = MODERATE_MOVE_DJ.asInstanceOf[js.Any], MODERATE_MUTE = MODERATE_MUTE.asInstanceOf[js.Any], MODERATE_REMOVE_DJ = MODERATE_REMOVE_DJ.asInstanceOf[js.Any], MODERATE_REMOVE_WAITLIST = MODERATE_REMOVE_WAITLIST.asInstanceOf[js.Any], MODERATE_SKIP = MODERATE_SKIP.asInstanceOf[js.Any], MODERATE_STAFF = MODERATE_STAFF.asInstanceOf[js.Any], NOTIFY = NOTIFY.asInstanceOf[js.Any], PDJ_MESSAGE = PDJ_MESSAGE.asInstanceOf[js.Any], PDJ_UPDATE = PDJ_UPDATE.asInstanceOf[js.Any], PING = PING.asInstanceOf[js.Any], PLAYLIST_CYCLE = PLAYLIST_CYCLE.asInstanceOf[js.Any], REQUEST_DURATION = REQUEST_DURATION.asInstanceOf[js.Any], REQUEST_DURATION_RETRY = REQUEST_DURATION_RETRY.asInstanceOf[js.Any], ROOM_CHANGE = ROOM_CHANGE.asInstanceOf[js.Any], ROOM_DESCRIPTION_UPDATE = ROOM_DESCRIPTION_UPDATE.asInstanceOf[js.Any], ROOM_JOIN = ROOM_JOIN.asInstanceOf[js.Any], ROOM_NAME_UPDATE = ROOM_NAME_UPDATE.asInstanceOf[js.Any], ROOM_VOTE_SKIP = ROOM_VOTE_SKIP.asInstanceOf[js.Any], ROOM_WELCOME_UPDATE = ROOM_WELCOME_UPDATE.asInstanceOf[js.Any], SESSION_CLOSE = SESSION_CLOSE.asInstanceOf[js.Any], SKIP = SKIP.asInstanceOf[js.Any], STROBE_TOGGLE = STROBE_TOGGLE.asInstanceOf[js.Any], USER_COUNTER_UPDATE = USER_COUNTER_UPDATE.asInstanceOf[js.Any], USER_FOLLOW = USER_FOLLOW.asInstanceOf[js.Any], USER_JOIN = USER_JOIN.asInstanceOf[js.Any], USER_LEAVE = USER_LEAVE.asInstanceOf[js.Any], USER_UPDATE = USER_UPDATE.asInstanceOf[js.Any], VOTE = VOTE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Events]
  }
}

