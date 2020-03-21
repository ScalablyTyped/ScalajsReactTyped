package typingsJapgolly.hlsParser.mod

import typingsJapgolly.hlsParser.mod.types.MasterPlaylist
import typingsJapgolly.hlsParser.mod.types.MediaPlaylist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "parse")
@js.native
object parse extends js.Object {
  def apply(manifest: String): MasterPlaylist | MediaPlaylist = js.native
}

