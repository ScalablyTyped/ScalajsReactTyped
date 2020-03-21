package typingsJapgolly.parseTorrent.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ typingsJapgolly.magnetUri.mod.Instance, String] = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[/* parsed */ typingsJapgolly.parseTorrentFile.mod.Instance, Buffer] = js.native
  def apply(torrent: String): typingsJapgolly.magnetUri.mod.Instance = js.native
  def apply(torrent: typingsJapgolly.magnetUri.mod.Instance): Instance = js.native
  def apply(torrent: Buffer): typingsJapgolly.magnetUri.mod.Instance | typingsJapgolly.parseTorrentFile.mod.Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def apply(torrent: typingsJapgolly.parseTorrentFile.mod.Instance): Instance = js.native
  def remote(torrent: String): Unit = js.native
  def remote(torrent: String, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsJapgolly.magnetUri.mod.Instance): Unit = js.native
  def remote(
    torrent: typingsJapgolly.magnetUri.mod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Buffer): Unit = js.native
  def remote(torrent: Buffer, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: Instance): Unit = js.native
  def remote(torrent: Instance, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsJapgolly.parseTorrentFile.mod.Instance): Unit = js.native
  def remote(
    torrent: typingsJapgolly.parseTorrentFile.mod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Blob): Unit = js.native
  def remote(torrent: Blob, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def toMagnetURI(parsed: typingsJapgolly.magnetUri.mod.Instance): String = js.native
  def toTorrentFile(parsed: typingsJapgolly.parseTorrentFile.mod.Instance): Buffer = js.native
}

