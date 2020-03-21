package typingsJapgolly.d3Shape.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolType extends js.Object {
  /**
    * Renders this symbol type to the specified context with the specified size in square pixels. The context implements the CanvasPath interface.
    * (Note that this is a subset of the CanvasRenderingContext2D interface!)
    *
    * @param context A rendering context implementing CanvasPath.
    * @param size Size of the symbol to draw.
    */
  def draw(context: CanvasPathD3Shape, size: Double): Unit
}

object SymbolType {
  @scala.inline
  def apply(draw: (CanvasPathD3Shape, Double) => Callback): SymbolType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: typingsJapgolly.d3Shape.mod.CanvasPathD3Shape, t1: scala.Double) => draw(t0, t1).runNow()))
    __obj.asInstanceOf[SymbolType]
  }
}

