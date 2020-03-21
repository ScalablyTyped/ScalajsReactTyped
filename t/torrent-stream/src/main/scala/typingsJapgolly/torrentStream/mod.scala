package typingsJapgolly.torrentStream

import typingsJapgolly.node.Buffer
import typingsJapgolly.torrentStream.TorrentStream.TorrentEngine
import typingsJapgolly.torrentStream.TorrentStream.TorrentEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(magnet: String): TorrentEngine = js.native
  def apply(magnet: String, options: TorrentEngineOptions): TorrentEngine = js.native
  def apply(magnet: Buffer): TorrentEngine = js.native
  def apply(magnet: Buffer, options: TorrentEngineOptions): TorrentEngine = js.native
}

