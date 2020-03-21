package typingsJapgolly.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("luxon", "Zone")
@js.native
class Zone () extends js.Object {
  var isValid: Boolean = js.native
  var name: String = js.native
  var `type`: String = js.native
  var universal: Boolean = js.native
  def equals(other: Zone): Boolean = js.native
  def formatOffset(ts: Double, format: ZoneOffsetFormat): String = js.native
  def offset(ts: Double): Double = js.native
  def offsetName(ts: Double, options: ZoneOffsetOptions): String = js.native
}

