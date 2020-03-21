package typingsJapgolly.d3Delaunay.mod.Delaunay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the lineTo() method of the CanvasPathMethods API.
  */
trait LineContext extends js.Object {
  /**
    * lineTo() method of the CanvasPathMethods API.
    */
  def lineTo(x: Double, y: Double): Unit
}

object LineContext {
  @scala.inline
  def apply(lineTo: (Double, Double) => Callback): LineContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => lineTo(t0, t1).runNow()))
    __obj.asInstanceOf[LineContext]
  }
}

