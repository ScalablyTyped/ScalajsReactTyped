package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A 3x3 matrix used to transform source coordinates (x1, y1) into destination coordinates (x2, y2)
  * according to matrix multiplication:
  *
  *     [ x2 ]   [ scaleX shearX translateX ] [ x1 ]
  *     [ y2 ] = [ shearY scaleY translateY ] [ y1 ]
  *     [ 1  ]   [   0      0        1      ] [ 1  ]
  *
  * After transformation,
  *
  *     x2 = scaleX * x1 + shearX * y1 + translateX
  *     y2 = scaleY * y1 + shearY * x1 + translateY
  */
trait AffineTransform extends js.Object {
  def getScaleX(): Double
  def getScaleY(): Double
  def getShearX(): Double
  def getShearY(): Double
  def getTranslateX(): Double
  def getTranslateY(): Double
  def toBuilder(): AffineTransformBuilder
}

object AffineTransform {
  @scala.inline
  def apply(
    getScaleX: CallbackTo[Double],
    getScaleY: CallbackTo[Double],
    getShearX: CallbackTo[Double],
    getShearY: CallbackTo[Double],
    getTranslateX: CallbackTo[Double],
    getTranslateY: CallbackTo[Double],
    toBuilder: CallbackTo[AffineTransformBuilder]
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getScaleX")(getScaleX.toJsFn)
    __obj.updateDynamic("getScaleY")(getScaleY.toJsFn)
    __obj.updateDynamic("getShearX")(getShearX.toJsFn)
    __obj.updateDynamic("getShearY")(getShearY.toJsFn)
    __obj.updateDynamic("getTranslateX")(getTranslateX.toJsFn)
    __obj.updateDynamic("getTranslateY")(getTranslateY.toJsFn)
    __obj.updateDynamic("toBuilder")(toBuilder.toJsFn)
    __obj.asInstanceOf[AffineTransform]
  }
}

