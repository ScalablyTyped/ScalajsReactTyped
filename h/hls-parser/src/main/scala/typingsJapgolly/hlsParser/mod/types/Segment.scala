package typingsJapgolly.hlsParser.mod.types

import typingsJapgolly.hlsParser.AnonByterange
import typingsJapgolly.hlsParser.mod.Byterange
import typingsJapgolly.hlsParser.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Segment")
@js.native
class Segment protected () extends Data {
  def this(properties: AnonByterange) = this()
  var byterange: js.UndefOr[Byterange] = js.native
  var dateRange: DateRange = js.native
  var discontinuity: js.UndefOr[Boolean] = js.native
  var discontinuitySequence: Double = js.native
  var duration: Double = js.native
  var key: js.UndefOr[Key] = js.native
  var map: js.UndefOr[MediaInitializationSection] = js.native
  var mediaSequenceNumber: Double = js.native
  var programDateTime: js.UndefOr[js.Date] = js.native
  var title: js.UndefOr[String] = js.native
  var uri: String = js.native
}

