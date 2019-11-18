package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/point
  var x: Double
  var y: Double
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

