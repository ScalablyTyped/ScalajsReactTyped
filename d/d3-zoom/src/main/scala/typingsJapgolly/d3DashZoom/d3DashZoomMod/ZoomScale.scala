package typingsJapgolly.d3DashZoom.d3DashZoomMod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomScale extends js.Object {
  def copy(): ZoomScale = js.native
  def domain(): js.Array[js.Date | Double] = js.native
  def domain(domain: js.Array[Date | Double]): this.type = js.native
  def invert(value: Double): Double | js.Date = js.native
  def range(): js.Array[Double] = js.native
  def range(range: js.Array[Double]): this.type = js.native
}

