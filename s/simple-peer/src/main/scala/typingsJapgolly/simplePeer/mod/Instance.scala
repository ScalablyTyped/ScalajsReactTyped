package typingsJapgolly.simplePeer.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.mediastream.MediaStreamTrack
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.simplePeer.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends Duplex {
  // methods which are not documented
  val bufferSize: Double = js.native
  // used for debug logging
  def _debug(): Unit = js.native
  def _debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddstreamstream
  def addStream(stream: MediaStream): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v9.6.1#peeraddtracktrack-stream
  def addTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
  def address(): AnonAddress = js.native
  // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovestreamstream
  def removeStream(stream: MediaStream): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v9.6.1#peerremovetracktrack-stream
  def removeTrack(track: MediaStreamTrack, stream: MediaStream): Unit = js.native
  // https://github.com/feross/simple-peer/blob/v9.6.1/index.js#L306
  def replaceTrack(oldTrack: MediaStreamTrack, newTrack: MediaStreamTrack, stream: MediaStream): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersenddata
  def send(data: SimplePeerData): Unit = js.native
  // https://github.com/feross/simple-peer/tree/v6.1.5#peersignaldata
  def signal(data: String): Unit = js.native
  def signal(data: SignalData): Unit = js.native
}

