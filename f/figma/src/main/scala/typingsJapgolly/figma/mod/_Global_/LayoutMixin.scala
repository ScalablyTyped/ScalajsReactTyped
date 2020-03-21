package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.Callback
import typingsJapgolly.figma.figmaStrings.CENTER
import typingsJapgolly.figma.figmaStrings.MAX
import typingsJapgolly.figma.figmaStrings.MIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutMixin extends js.Object {
  val absoluteTransform: Transform
  val height: Double
  var layoutAlign: MIN | CENTER | MAX
  var relativeTransform: Transform
  var rotation: Double
   // In degrees
  val width: Double
  var x: Double
  var y: Double
   // applicable only inside auto-layout frames
  def resize(width: Double, height: Double): Unit
  def resizeWithoutConstraints(width: Double, height: Double): Unit
}

object LayoutMixin {
  @scala.inline
  def apply(
    absoluteTransform: Transform,
    height: Double,
    layoutAlign: MIN | CENTER | MAX,
    relativeTransform: Transform,
    resize: (Double, Double) => Callback,
    resizeWithoutConstraints: (Double, Double) => Callback,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layoutAlign = layoutAlign.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("resize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => resize(t0, t1).runNow()))
    __obj.updateDynamic("resizeWithoutConstraints")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => resizeWithoutConstraints(t0, t1).runNow()))
    __obj.asInstanceOf[LayoutMixin]
  }
}

