package typingsJapgolly.parseTorrentFile.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-torrent-file", "decode")
@js.native
object decode extends js.Object {
  def apply(torrent: Buffer): Instance = js.native
  def apply(torrent: Torrent): Instance = js.native
}

