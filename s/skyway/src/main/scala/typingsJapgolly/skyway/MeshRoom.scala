package typingsJapgolly.skyway

import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsJapgolly.skyway.skywayStrings.close
import typingsJapgolly.skyway.skywayStrings.data
import typingsJapgolly.skyway.skywayStrings.log
import typingsJapgolly.skyway.skywayStrings.open
import typingsJapgolly.skyway.skywayStrings.peerJoin
import typingsJapgolly.skyway.skywayStrings.peerLeave
import typingsJapgolly.skyway.skywayStrings.removeStream
import typingsJapgolly.skyway.skywayStrings.stream
import typingsJapgolly.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MeshRoom")
@js.native
class MeshRoom () extends js.Object {
  def close(): js.UndefOr[scala.Nothing] = js.native
  def getLog(): js.UndefOr[scala.Nothing] = js.native
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_data(event: data, cb: js.Function1[/* object */ DataObject, Unit]): Unit = js.native
  @JSName("on")
  def on_log(event: log, cb: js.Function1[/* logs */ js.Array[String], Unit]): Unit = js.native
  @JSName("on")
  def on_open(event: open, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_peerJoin(event: peerJoin, cb: js.Function1[/* peerId */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_peerLeave(event: peerLeave, cb: js.Function1[/* peerId */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_removeStream(event: removeStream, cb: js.Function1[/* stream */ MediaStream, Unit]): Unit = js.native
  @JSName("on")
  def on_stream(event: stream, cb: js.Function1[/* stream */ MediaStream, Unit]): Unit = js.native
  @JSName("once")
  def once_log(event: log, cb: js.Function1[/* logs */ js.Array[String], Unit]): Unit = js.native
  def replaceStream(stream: MediaSource): js.UndefOr[scala.Nothing] = js.native
  def send(data: js.Any): js.UndefOr[scala.Nothing] = js.native
}

