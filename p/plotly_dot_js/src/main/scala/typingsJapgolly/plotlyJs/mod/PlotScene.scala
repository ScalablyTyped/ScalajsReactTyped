package typingsJapgolly.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScene extends js.Object {
  var center: Point
  var eye: Point
  var up: Point
}

object PlotScene {
  @scala.inline
  def apply(center: Point, eye: Point, up: Point): PlotScene = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotScene]
  }
}

