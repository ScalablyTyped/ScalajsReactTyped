package typingsJapgolly.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPoint extends js.Object {
  var coordinates: js.Array[PointCoordinates] = js.native
  var `type`: typingsJapgolly.wxServerSdk.wxServerSdkStrings.MultiPoint = js.native
  def apply(points: js.Array[Point]): MultiPoint = js.native
}

