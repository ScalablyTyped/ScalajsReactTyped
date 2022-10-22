package typingsJapgolly.tmiJs.mod

import typingsJapgolly.tmiJs.mod.^
import typingsJapgolly.tmiJs.strictEventEmitterTypesMod.EEMethodReturnType
import typingsJapgolly.tmiJs.strictEventEmitterTypesMod.ListenerType
import typingsJapgolly.tmiJs.tmiJsStrings.CLOSED
import typingsJapgolly.tmiJs.tmiJsStrings.CLOSING
import typingsJapgolly.tmiJs.tmiJsStrings.CONNECTING
import typingsJapgolly.tmiJs.tmiJsStrings.OPEN
import typingsJapgolly.tmiJs.tmiJsStrings.action
import typingsJapgolly.tmiJs.tmiJsStrings.addListener
import typingsJapgolly.tmiJs.tmiJsStrings.anongiftpaidupgrade
import typingsJapgolly.tmiJs.tmiJsStrings.anonsubgift
import typingsJapgolly.tmiJs.tmiJsStrings.anonsubmysterygift
import typingsJapgolly.tmiJs.tmiJsStrings.automod
import typingsJapgolly.tmiJs.tmiJsStrings.ban
import typingsJapgolly.tmiJs.tmiJsStrings.chat
import typingsJapgolly.tmiJs.tmiJsStrings.cheer
import typingsJapgolly.tmiJs.tmiJsStrings.clearchat
import typingsJapgolly.tmiJs.tmiJsStrings.connected
import typingsJapgolly.tmiJs.tmiJsStrings.connecting_
import typingsJapgolly.tmiJs.tmiJsStrings.disconnected
import typingsJapgolly.tmiJs.tmiJsStrings.emit
import typingsJapgolly.tmiJs.tmiJsStrings.emoteonly
import typingsJapgolly.tmiJs.tmiJsStrings.emotesets
import typingsJapgolly.tmiJs.tmiJsStrings.followersonly
import typingsJapgolly.tmiJs.tmiJsStrings.giftpaidupgrade
import typingsJapgolly.tmiJs.tmiJsStrings.hosted
import typingsJapgolly.tmiJs.tmiJsStrings.hosting
import typingsJapgolly.tmiJs.tmiJsStrings.join
import typingsJapgolly.tmiJs.tmiJsStrings.logon
import typingsJapgolly.tmiJs.tmiJsStrings.message
import typingsJapgolly.tmiJs.tmiJsStrings.messagedeleted
import typingsJapgolly.tmiJs.tmiJsStrings.mods
import typingsJapgolly.tmiJs.tmiJsStrings.notice
import typingsJapgolly.tmiJs.tmiJsStrings.on
import typingsJapgolly.tmiJs.tmiJsStrings.once
import typingsJapgolly.tmiJs.tmiJsStrings.part
import typingsJapgolly.tmiJs.tmiJsStrings.ping
import typingsJapgolly.tmiJs.tmiJsStrings.pong
import typingsJapgolly.tmiJs.tmiJsStrings.primepaidupgrade
import typingsJapgolly.tmiJs.tmiJsStrings.r9kbeta
import typingsJapgolly.tmiJs.tmiJsStrings.raided
import typingsJapgolly.tmiJs.tmiJsStrings.raw_message
import typingsJapgolly.tmiJs.tmiJsStrings.reconnect
import typingsJapgolly.tmiJs.tmiJsStrings.redeem
import typingsJapgolly.tmiJs.tmiJsStrings.removeListener
import typingsJapgolly.tmiJs.tmiJsStrings.resub
import typingsJapgolly.tmiJs.tmiJsStrings.roomstate
import typingsJapgolly.tmiJs.tmiJsStrings.serverchange
import typingsJapgolly.tmiJs.tmiJsStrings.slowmode
import typingsJapgolly.tmiJs.tmiJsStrings.subgift
import typingsJapgolly.tmiJs.tmiJsStrings.submysterygift
import typingsJapgolly.tmiJs.tmiJsStrings.subscribers
import typingsJapgolly.tmiJs.tmiJsStrings.subscription
import typingsJapgolly.tmiJs.tmiJsStrings.timeout
import typingsJapgolly.tmiJs.tmiJsStrings.unhost
import typingsJapgolly.tmiJs.tmiJsStrings.unmod
import typingsJapgolly.tmiJs.tmiJsStrings.vips
import typingsJapgolly.tmiJs.tmiJsStrings.whisper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tmi.js.tmi.js/strict-event-emitter-types.StrictEventEmitter<tmi.js.tmi.js.ClientBase, tmi.js.tmi.js.Events, tmi.js.tmi.js.Events, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, keyof tmi.js.tmi.js.ClientBase>, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, std.Exclude<tmi.js.tmi.js/strict-event-emitter-types.OverriddenKeys, keyof tmi.js.tmi.js.ClientBase>>> & tmi.js.tmi.js.Actions */
@js.native
trait Client_ extends StObject {
  
  @JSName(" _emitType")
  var Space_emitType: js.UndefOr[Events] = js.native
  
  @JSName(" _emitterType")
  var Space_emitterType: js.UndefOr[ClientBase] = js.native
  
  @JSName(" _eventsType")
  var Space_eventsType: js.UndefOr[Events] = js.native
  
  def action(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  @JSName("addListener")
  var addListener_Original: js.ThisFunction2[
    /* this */ Any, 
    addListener, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit], 
    EEMethodReturnType[ClientBase, addListener, Any, Unit]
  ] = js.native
  @JSName("addListener")
  def addListener_addListener[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: addListener, listener: js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit]): EEMethodReturnType[ClientBase, addListener, T, Unit] = js.native
  
  def ban(channel: String, username: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  def ban(channel: String, username: String, reason: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  
  def clear(channel: String): js.Promise[js.Array[String]] = js.native
  
  def color(color: String): js.Promise[js.Array[String]] = js.native
  
  def commercial(channel: String, seconds: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def connect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def deletemessage(channel: String, messageUUID: String): js.Promise[js.Array[String]] = js.native
  
  def disconnect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  @JSName("emit")
  var emit_Original: js.ThisFunction2[
    /* this */ Any, 
    emit, 
    /* args */ ListenerType[js.UndefOr[Any]], 
    EEMethodReturnType[ClientBase, emit, Any, Unit]
  ] = js.native
  @JSName("emit")
  def emit_emit[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](
    event: emit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ListenerType<TEmitRecord[P]> is not an array type */ args: ListenerType[js.UndefOr[Any]]
  ): EEMethodReturnType[ClientBase, emit, T, Unit] = js.native
  
  def emits(
    events: js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ],
    values: js.Array[js.Array[Any]]
  ): Unit = js.native
  @JSName("emits")
  var emits_Original: js.Function2[
    /* events */ js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ], 
    /* values */ js.Array[js.Array[Any]], 
    Unit
  ] = js.native
  
  def emoteonly(channel: String): js.Promise[js.Array[String]] = js.native
  
  def emoteonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def followersonly(channel: String): js.Promise[js.Tuple2[String, Double]] = js.native
  def followersonly(channel: String, length: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def followersonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def getChannels(): js.Array[String] = js.native
  @JSName("getChannels")
  var getChannels_Original: js.Function0[js.Array[String]] = js.native
  
  def getOptions(): Options = js.native
  @JSName("getOptions")
  var getOptions_Original: js.Function0[Options] = js.native
  
  def getUsername(): String = js.native
  @JSName("getUsername")
  var getUsername_Original: js.Function0[String] = js.native
  
  def host(channel: String, target: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def isMod(channel: String, username: String): Boolean = js.native
  @JSName("isMod")
  var isMod_Original: js.Function2[/* channel */ String, /* username */ String, Boolean] = js.native
  
  def join(channel: String): js.Promise[js.Array[String]] = js.native
  
  def listenerCount(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Double = js.native
  @JSName("listenerCount")
  var listenerCount_Original: js.Function1[
    /* keyof tmi.js.tmi.js.Events */ /* event */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper, 
    Double
  ] = js.native
  
  def mod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def mods(channel: String): js.Promise[js.Array[String]] = js.native
  
  @JSName("on")
  var on_Original: js.ThisFunction2[
    /* this */ Any, 
    on, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit], 
    EEMethodReturnType[ClientBase, on, Any, Unit]
  ] = js.native
  @JSName("on")
  def on_on[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: on, listener: js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit]): EEMethodReturnType[ClientBase, on, T, Unit] = js.native
  
  @JSName("once")
  var once_Original: js.ThisFunction2[
    /* this */ Any, 
    once, 
    /* listener */ js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit], 
    EEMethodReturnType[ClientBase, once, Any, Unit]
  ] = js.native
  @JSName("once")
  def once_once[P /* <: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper */, T](event: once, listener: js.Function1[/* args */ ListenerType[js.UndefOr[Any]], Unit]): EEMethodReturnType[ClientBase, once, T, Unit] = js.native
  
  def part(channel: String): js.Promise[js.Array[String]] = js.native
  
  def ping(): js.Promise[js.Array[Double]] = js.native
  
  def r9kbeta(channel: String): js.Promise[js.Array[String]] = js.native
  
  def r9kbetaoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def raw(message: String): js.Promise[js.Array[String]] = js.native
  
  def readyState(): CONNECTING | OPEN | CLOSING | CLOSED = js.native
  @JSName("readyState")
  var readyState_Original: js.Function0[CONNECTING | OPEN | CLOSING | CLOSED] = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): this.type = js.native
  @JSName("removeAllListeners")
  var removeAllListeners_Original: js.Function1[
    /* event */ js.UndefOr[
      action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ], 
    this.type
  ] = js.native
  
  def removeListener[T](
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper,
    listener: js.Function1[/* repeated */ Any, Any]
  ): EEMethodReturnType[ClientBase, typingsJapgolly.tmiJs.tmiJsStrings.removeListener, T, Unit] = js.native
  @JSName("removeListener")
  var removeListener_Original: js.ThisFunction2[
    /* this */ Any, 
    /* keyof tmi.js.tmi.js.Events */ /* event */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper, 
    /* listener */ js.Function1[/* repeated */ Any, Any], 
    EEMethodReturnType[ClientBase, removeListener, Any, Unit]
  ] = js.native
  
  def say(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
  @JSName("setMaxListeners")
  var setMaxListeners_Original: js.Function1[/* n */ Double, this.type] = js.native
  
  def slow(channel: String): js.Promise[js.Array[String]] = js.native
  def slow(channel: String, length: Double): js.Promise[js.Array[String]] = js.native
  
  def slowoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribers(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribersoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def timeout(channel: String, username: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Unit, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  
  def unban(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unhost(channel: String): js.Promise[js.Array[String]] = js.native
  
  def unmod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unvip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vips(channel: String): js.Promise[js.Array[String]] = js.native
  
  def whisper(username: String, message: String): js.Promise[js.Tuple2[String, String]] = js.native
}
object Client_ {
  
  inline def apply: ClientConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Client").asInstanceOf[ClientConstructor]
}
