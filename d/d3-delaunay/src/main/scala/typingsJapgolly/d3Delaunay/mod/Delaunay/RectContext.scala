package typingsJapgolly.d3Delaunay.mod.Delaunay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the rect() method of the CanvasPathMethods API.
  */
trait RectContext extends js.Object {
  /**
    * rect() method of the CanvasPathMethods API.
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit
}

object RectContext {
  @scala.inline
  def apply(rect: (Double, Double, Double, Double) => Callback): RectContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rect")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => rect(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[RectContext]
  }
}

