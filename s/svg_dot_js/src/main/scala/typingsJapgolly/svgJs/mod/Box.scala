package typingsJapgolly.svgJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// boxes.js
trait Box extends js.Object {
  var cx: Double
  var cy: Double
  var h: Double
  var height: Double
  var w: Double
  var width: Double
  var x: Double
  var x2: Double
  var y: Double
  var y2: Double
  def merge(box: Box): Box
  def transform(m: Matrix): Box
}

object Box {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    h: Double,
    height: Double,
    merge: Box => CallbackTo[Box],
    transform: Matrix => CallbackTo[Box],
    w: Double,
    width: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): Box = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("merge")(js.Any.fromFunction1((t0: typingsJapgolly.svgJs.mod.Box) => merge(t0).runNow()))
    __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: typingsJapgolly.svgJs.mod.Matrix) => transform(t0).runNow()))
    __obj.asInstanceOf[Box]
  }
}

