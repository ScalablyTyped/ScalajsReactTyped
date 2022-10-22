package typingsJapgolly.skywayJs.mod

import org.scalajs.dom.MediaStream
import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.skywayJs.skywayJsStrings.close
import typingsJapgolly.skywayJs.skywayJsStrings.data
import typingsJapgolly.skywayJs.skywayJsStrings.error
import typingsJapgolly.skywayJs.skywayJsStrings.log
import typingsJapgolly.skywayJs.skywayJsStrings.open
import typingsJapgolly.skywayJs.skywayJsStrings.peerJoin
import typingsJapgolly.skywayJs.skywayJsStrings.peerLeave
import typingsJapgolly.skywayJs.skywayJsStrings.stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Room extends EventEmitter {
  
  def close(): Unit = js.native
  
  def getLog(): Unit = js.native
  
  var name: String = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ RoomData, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("on")
  def on_log(event: log, listener: js.Function1[/* logs */ js.Array[String], Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_peerJoin(event: peerJoin, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_peerLeave(event: peerLeave, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_stream(event: stream, listener: js.Function1[/* stream */ RoomStream, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ RoomData, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ PeerError, Unit]): this.type = js.native
  @JSName("once")
  def once_log(event: log, listener: js.Function1[/* logs */ js.Array[String], Unit]): this.type = js.native
  @JSName("once")
  def once_open(event: open, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_peerJoin(event: peerJoin, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_peerLeave(event: peerLeave, listener: js.Function1[/* peerId */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_stream(event: stream, listener: js.Function1[/* stream */ RoomStream, Unit]): this.type = js.native
  
  def replaceStream(stream: MediaStream): Unit = js.native
  
  def send(data: Any): Unit = js.native
}
