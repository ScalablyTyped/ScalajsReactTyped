package typingsJapgolly.pusherChatkitClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pusherChatkitClient.currentuserMod.CurrentUser
import typingsJapgolly.pusherChatkitClient.hooksMod.RoomHook
import typingsJapgolly.pusherChatkitClient.hooksMod.RoomParams
import typingsJapgolly.pusherChatkitClient.hooksMod.RoomUserHook
import typingsJapgolly.pusherChatkitClient.hooksMod.UserParams
import typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceHook
import typingsJapgolly.pusherChatkitClient.hooksMod.UserPresenceState
import typingsJapgolly.pusherChatkitClient.roomMod.PusherRoom
import typingsJapgolly.pusherChatkitClient.userMod.PusherUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatmanagerMod {
  
  @js.native
  trait ChatManager extends StObject {
    
    def connect(): js.Promise[CurrentUser] = js.native
    def connect(hooks: GlobalHooks): js.Promise[CurrentUser] = js.native
    
    def disablePushNotifications(): js.Promise[Unit] = js.native
    
    def getRoom(params: RoomParams): js.Promise[PusherRoom] = js.native
    
    def getUser(params: UserParams): js.Promise[PusherUser] = js.native
  }
  @JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
  @js.native
  val ChatManager: ChatManagerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
  @js.native
  open class ChatManagerCls protected ()
    extends StObject
       with typingsJapgolly.pusherChatkitClient.chatmanagerMod.ChatManager {
    def this(args: ChatManagerConstructorArgs) = this()
  }
  
  @JSImport("@pusher/chatkit-client/chatmanager", "TokenProvider")
  @js.native
  val TokenProvider: TokenProviderConstructor = js.native
  
  @js.native
  trait ChatManagerConstructor
    extends StObject
       with Instantiable1[
          /* args */ ChatManagerConstructorArgs, 
          typingsJapgolly.pusherChatkitClient.chatmanagerMod.ChatManager
        ]
  
  trait ChatManagerConstructorArgs extends StObject {
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var instanceLocator: String
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var userId: String
  }
  object ChatManagerConstructorArgs {
    
    inline def apply(instanceLocator: String, userId: String): ChatManagerConstructorArgs = {
      val __obj = js.Dynamic.literal(instanceLocator = instanceLocator.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChatManagerConstructorArgs]
    }
    
    extension [Self <: ChatManagerConstructorArgs](x: Self) {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setInstanceLocator(value: String): Self = StObject.set(x, "instanceLocator", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalHooks extends StObject {
    
    def onAddedToRoom(room: PusherRoom): Unit
    @JSName("onAddedToRoom")
    var onAddedToRoom_Original: RoomHook
    
    def onNewReadCursor(room: PusherRoom, user: PusherUser): Unit
    @JSName("onNewReadCursor")
    var onNewReadCursor_Original: RoomUserHook
    
    def onPresenceChanged(state: UserPresenceState, user: PusherUser): Unit
    @JSName("onPresenceChanged")
    var onPresenceChanged_Original: UserPresenceHook
    
    def onRemovedFromRoom(room: PusherRoom): Unit
    @JSName("onRemovedFromRoom")
    var onRemovedFromRoom_Original: RoomHook
    
    def onRoomDeleted(room: PusherRoom): Unit
    @JSName("onRoomDeleted")
    var onRoomDeleted_Original: RoomHook
    
    def onRoomUpdated(room: PusherRoom): Unit
    @JSName("onRoomUpdated")
    var onRoomUpdated_Original: RoomHook
    
    def onUserJoinedRoom(room: PusherRoom, user: PusherUser): Unit
    @JSName("onUserJoinedRoom")
    var onUserJoinedRoom_Original: RoomUserHook
    
    def onUserLeftRoom(room: PusherRoom, user: PusherUser): Unit
    @JSName("onUserLeftRoom")
    var onUserLeftRoom_Original: RoomUserHook
    
    def onUserStartedTyping(room: PusherRoom, user: PusherUser): Unit
    @JSName("onUserStartedTyping")
    var onUserStartedTyping_Original: RoomUserHook
    
    def onUserStoppedTyping(room: PusherRoom, user: PusherUser): Unit
    @JSName("onUserStoppedTyping")
    var onUserStoppedTyping_Original: RoomUserHook
  }
  object GlobalHooks {
    
    inline def apply(
      onAddedToRoom: /* room */ PusherRoom => Callback,
      onNewReadCursor: (/* room */ PusherRoom, /* user */ PusherUser) => Callback,
      onPresenceChanged: (/* state */ UserPresenceState, /* user */ PusherUser) => Callback,
      onRemovedFromRoom: /* room */ PusherRoom => Callback,
      onRoomDeleted: /* room */ PusherRoom => Callback,
      onRoomUpdated: /* room */ PusherRoom => Callback,
      onUserJoinedRoom: (/* room */ PusherRoom, /* user */ PusherUser) => Callback,
      onUserLeftRoom: (/* room */ PusherRoom, /* user */ PusherUser) => Callback,
      onUserStartedTyping: (/* room */ PusherRoom, /* user */ PusherUser) => Callback,
      onUserStoppedTyping: (/* room */ PusherRoom, /* user */ PusherUser) => Callback
    ): GlobalHooks = {
      val __obj = js.Dynamic.literal(onAddedToRoom = js.Any.fromFunction1((t0: /* room */ PusherRoom) => onAddedToRoom(t0).runNow()), onNewReadCursor = js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (onNewReadCursor(t0, t1)).runNow()), onPresenceChanged = js.Any.fromFunction2((t0: /* state */ UserPresenceState, t1: /* user */ PusherUser) => (onPresenceChanged(t0, t1)).runNow()), onRemovedFromRoom = js.Any.fromFunction1((t0: /* room */ PusherRoom) => onRemovedFromRoom(t0).runNow()), onRoomDeleted = js.Any.fromFunction1((t0: /* room */ PusherRoom) => onRoomDeleted(t0).runNow()), onRoomUpdated = js.Any.fromFunction1((t0: /* room */ PusherRoom) => onRoomUpdated(t0).runNow()), onUserJoinedRoom = js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (onUserJoinedRoom(t0, t1)).runNow()), onUserLeftRoom = js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (onUserLeftRoom(t0, t1)).runNow()), onUserStartedTyping = js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (onUserStartedTyping(t0, t1)).runNow()), onUserStoppedTyping = js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (onUserStoppedTyping(t0, t1)).runNow()))
      __obj.asInstanceOf[GlobalHooks]
    }
    
    extension [Self <: GlobalHooks](x: Self) {
      
      inline def setOnAddedToRoom(value: /* room */ PusherRoom => Callback): Self = StObject.set(x, "onAddedToRoom", js.Any.fromFunction1((t0: /* room */ PusherRoom) => value(t0).runNow()))
      
      inline def setOnNewReadCursor(value: (/* room */ PusherRoom, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onNewReadCursor", js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
      
      inline def setOnPresenceChanged(value: (/* state */ UserPresenceState, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onPresenceChanged", js.Any.fromFunction2((t0: /* state */ UserPresenceState, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
      
      inline def setOnRemovedFromRoom(value: /* room */ PusherRoom => Callback): Self = StObject.set(x, "onRemovedFromRoom", js.Any.fromFunction1((t0: /* room */ PusherRoom) => value(t0).runNow()))
      
      inline def setOnRoomDeleted(value: /* room */ PusherRoom => Callback): Self = StObject.set(x, "onRoomDeleted", js.Any.fromFunction1((t0: /* room */ PusherRoom) => value(t0).runNow()))
      
      inline def setOnRoomUpdated(value: /* room */ PusherRoom => Callback): Self = StObject.set(x, "onRoomUpdated", js.Any.fromFunction1((t0: /* room */ PusherRoom) => value(t0).runNow()))
      
      inline def setOnUserJoinedRoom(value: (/* room */ PusherRoom, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onUserJoinedRoom", js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
      
      inline def setOnUserLeftRoom(value: (/* room */ PusherRoom, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onUserLeftRoom", js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
      
      inline def setOnUserStartedTyping(value: (/* room */ PusherRoom, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onUserStartedTyping", js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
      
      inline def setOnUserStoppedTyping(value: (/* room */ PusherRoom, /* user */ PusherUser) => Callback): Self = StObject.set(x, "onUserStoppedTyping", js.Any.fromFunction2((t0: /* room */ PusherRoom, t1: /* user */ PusherUser) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Logger extends StObject {
    
    def debug(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    @JSName("debug")
    var debug_Original: LoggerFunction
    
    def error(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    @JSName("error")
    var error_Original: LoggerFunction
    
    def info(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    @JSName("info")
    var info_Original: LoggerFunction
    
    def verbose(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    @JSName("verbose")
    var verbose_Original: LoggerFunction
    
    def warn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    @JSName("warn")
    var warn_Original: LoggerFunction
  }
  object Logger {
    
    inline def apply(
      debug: /* args */ Any => Callback,
      error: /* args */ Any => Callback,
      info: /* args */ Any => Callback,
      verbose: /* args */ Any => Callback,
      warn: /* args */ Any => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* args */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* args */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* args */ Any) => info(t0).runNow()), verbose = js.Any.fromFunction1((t0: /* args */ Any) => verbose(t0).runNow()), warn = js.Any.fromFunction1((t0: /* args */ Any) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* args */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
      
      inline def setError(value: /* args */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* args */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
      
      inline def setVerbose(value: /* args */ Any => Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
      
      inline def setWarn(value: /* args */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
    }
  }
  
  type LoggerFunction = js.Function1[/* args */ Any, Unit]
  
  @js.native
  trait TokenProviderConstructor
    extends StObject
       with Instantiable1[/* args */ TokenProviderConstructorArgs, js.Object]
  
  trait TokenProviderConstructorArgs extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var queryParams: js.UndefOr[Any] = js.undefined
    
    var url: String
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object TokenProviderConstructorArgs {
    
    inline def apply(url: String): TokenProviderConstructorArgs = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenProviderConstructorArgs]
    }
    
    extension [Self <: TokenProviderConstructorArgs](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setQueryParams(value: Any): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
