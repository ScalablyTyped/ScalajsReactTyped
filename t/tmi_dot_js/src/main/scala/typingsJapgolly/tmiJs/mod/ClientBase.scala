package typingsJapgolly.tmiJs.mod

import typingsJapgolly.tmiJs.tmiJsStrings.CLOSED
import typingsJapgolly.tmiJs.tmiJsStrings.CLOSING
import typingsJapgolly.tmiJs.tmiJsStrings.CONNECTING
import typingsJapgolly.tmiJs.tmiJsStrings.OPEN
import typingsJapgolly.tmiJs.tmiJsStrings.action
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
import typingsJapgolly.tmiJs.tmiJsStrings.part
import typingsJapgolly.tmiJs.tmiJsStrings.ping
import typingsJapgolly.tmiJs.tmiJsStrings.pong
import typingsJapgolly.tmiJs.tmiJsStrings.primepaidupgrade
import typingsJapgolly.tmiJs.tmiJsStrings.r9kbeta
import typingsJapgolly.tmiJs.tmiJsStrings.raided
import typingsJapgolly.tmiJs.tmiJsStrings.raw_message
import typingsJapgolly.tmiJs.tmiJsStrings.reconnect
import typingsJapgolly.tmiJs.tmiJsStrings.redeem
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

@js.native
trait ClientBase extends StObject {
  
  def addListener(event: Any, listener: Any): Client_ = js.native
  
  // wish this could work better but either I'm just not smart enough or it's not possible
  def emit(event: Any): Boolean = js.native
  
  def emits(
    events: js.Array[
      /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
    ],
    values: js.Array[js.Array[Any]]
  ): Unit = js.native
  
  def getChannels(): js.Array[String] = js.native
  
  def getOptions(): Options = js.native
  
  def getUsername(): String = js.native
  
  def isMod(channel: String, username: String): Boolean = js.native
  
  def listenerCount(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Double = js.native
  
  def on(event: Any, listener: Any): Client_ = js.native
  
  def once(event: Any, listener: Any): Client_ = js.native
  
  def readyState(): CONNECTING | OPEN | CLOSING | CLOSED = js.native
  
  def removeAllListeners(): Client_ = js.native
  def removeAllListeners(
    event: /* keyof tmi.js.tmi.js.Events */ action | anongiftpaidupgrade | anonsubmysterygift | anonsubgift | automod | ban | chat | cheer | clearchat | connected | connecting_ | disconnected | emoteonly | emotesets | followersonly | giftpaidupgrade | hosted | hosting | join | logon | message | messagedeleted | typingsJapgolly.tmiJs.tmiJsStrings.mod | mods | notice | part | ping | pong | primepaidupgrade | r9kbeta | raided | raw_message | reconnect | redeem | resub | roomstate | serverchange | slowmode | subgift | submysterygift | subscribers | subscription | timeout | unhost | unmod | vips | whisper
  ): Client_ = js.native
  
  def removeListener(event: Any, listener: Any): Client_ = js.native
  
  def setMaxListeners(n: Double): Client_ = js.native
}
