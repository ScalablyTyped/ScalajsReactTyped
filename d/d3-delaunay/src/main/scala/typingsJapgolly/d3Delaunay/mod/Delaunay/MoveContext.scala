package typingsJapgolly.d3Delaunay.mod.Delaunay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the moveTo() method of the CanvasPathMethods API.
  */
trait MoveContext extends js.Object {
  /**
    * moveTo() method of the CanvasPathMethods API.
    */
  def moveTo(x: Double, y: Double): Unit
}

object MoveContext {
  @scala.inline
  def apply(moveTo: (Double, Double) => Callback): MoveContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moveTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => moveTo(t0, t1).runNow()))
    __obj.asInstanceOf[MoveContext]
  }
}

