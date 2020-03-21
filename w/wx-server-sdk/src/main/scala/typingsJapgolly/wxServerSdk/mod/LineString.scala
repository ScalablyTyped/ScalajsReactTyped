package typingsJapgolly.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineString extends js.Object {
  var coordinates: js.Array[PointCoordinates] = js.native
  var `type`: typingsJapgolly.wxServerSdk.wxServerSdkStrings.LineString = js.native
  def apply(points: js.Array[Point]): LineString = js.native
}

