package typingsJapgolly.hlsParser.mod.types

import typingsJapgolly.hlsParser.AnonUri
import typingsJapgolly.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.MediaInitializationSection")
@js.native
class MediaInitializationSection protected () extends js.Object {
  def this(properties: AnonUri) = this()
  var byterange: js.UndefOr[Byterange] = js.native
  var uri: String = js.native
}

