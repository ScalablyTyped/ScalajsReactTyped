package typingsJapgolly.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Rect")
@js.native
class Rect () extends Shape {
  def this(options: RectOptions) = this()
  /** @see {@link RectOptions#height} */
  var height: Double = js.native
  /** @see {@link RectOptions#width} */
  var width: Double = js.native
  def copy(options: RectOptions): Rect = js.native
  def copyGraph(options: RectOptions): Rect = js.native
}

