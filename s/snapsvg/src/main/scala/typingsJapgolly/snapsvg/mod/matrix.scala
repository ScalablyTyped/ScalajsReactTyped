package typingsJapgolly.snapsvg.mod

import typingsJapgolly.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", "matrix")
@js.native
object matrix extends js.Object {
  def apply(): Matrix_ = js.native
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = js.native
  def apply(svgMatrix: SVGMatrix): Matrix_ = js.native
}

