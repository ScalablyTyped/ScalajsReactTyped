package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for AffineTransform objects. Defaults to the identity transform.
  *
  * Call AffineTransformBuilder#build() to get the AffineTransform object.
  *
  *     var transform =
  *         SlidesApp.newAffineTransformBuilder().setScaleX(2.0).setShearY(1.1).build();
  *
  *     The resulting transform matrix is
  *       [ 2.0   0.0   0.0 ]
  *       [ 1.1   1.0   0.0 ]
  *       [  0     0     1  ]
  */
trait AffineTransformBuilder extends js.Object {
  def build(): AffineTransform
  def setScaleX(scaleX: Double): AffineTransformBuilder
  def setScaleY(scaleY: Double): AffineTransformBuilder
  def setShearX(shearX: Double): AffineTransformBuilder
  def setShearY(shearY: Double): AffineTransformBuilder
  def setTranslateX(translateX: Double): AffineTransformBuilder
  def setTranslateY(translateY: Double): AffineTransformBuilder
}

object AffineTransformBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[AffineTransform],
    setScaleX: Double => CallbackTo[AffineTransformBuilder],
    setScaleY: Double => CallbackTo[AffineTransformBuilder],
    setShearX: Double => CallbackTo[AffineTransformBuilder],
    setShearY: Double => CallbackTo[AffineTransformBuilder],
    setTranslateX: Double => CallbackTo[AffineTransformBuilder],
    setTranslateY: Double => CallbackTo[AffineTransformBuilder]
  ): AffineTransformBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setScaleX")(js.Any.fromFunction1((t0: scala.Double) => setScaleX(t0).runNow()))
    __obj.updateDynamic("setScaleY")(js.Any.fromFunction1((t0: scala.Double) => setScaleY(t0).runNow()))
    __obj.updateDynamic("setShearX")(js.Any.fromFunction1((t0: scala.Double) => setShearX(t0).runNow()))
    __obj.updateDynamic("setShearY")(js.Any.fromFunction1((t0: scala.Double) => setShearY(t0).runNow()))
    __obj.updateDynamic("setTranslateX")(js.Any.fromFunction1((t0: scala.Double) => setTranslateX(t0).runNow()))
    __obj.updateDynamic("setTranslateY")(js.Any.fromFunction1((t0: scala.Double) => setTranslateY(t0).runNow()))
    __obj.asInstanceOf[AffineTransformBuilder]
  }
}

