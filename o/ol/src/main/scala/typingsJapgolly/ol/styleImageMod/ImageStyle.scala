package typingsJapgolly.ol.styleImageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.ol.imageStateMod.ImageState
import typingsJapgolly.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStyle extends js.Object {
  def getAnchor(): js.Array[Double]
  def getHitDetectionImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement
  def getHitDetectionImageSize(): Size
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement
  def getImageSize(): Size
  def getImageState(): ImageState
  def getOpacity(): Double
  def getOrigin(): js.Array[Double]
  def getRotateWithView(): Boolean
  def getRotation(): Double
  def getScale(): Double
  def getSize(): Size
  def listenImageChange[T](listener: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit]): Unit
  def load(): Unit
  def setOpacity(opacity: Double): Unit
  def setRotateWithView(rotateWithView: Boolean): Unit
  def setRotation(rotation: Double): Unit
  def setScale(scale: Double): Unit
  def unlistenImageChange[T](listener: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit]): Unit
}

object ImageStyle {
  @scala.inline
  def apply(
    getAnchor: CallbackTo[js.Array[Double]],
    getHitDetectionImage: Double => CallbackTo[HTMLCanvasElement | HTMLVideoElement | HTMLImageElement],
    getHitDetectionImageSize: CallbackTo[Size],
    getImage: Double => CallbackTo[HTMLCanvasElement | HTMLVideoElement | HTMLImageElement],
    getImageSize: CallbackTo[Size],
    getImageState: CallbackTo[ImageState],
    getOpacity: CallbackTo[Double],
    getOrigin: CallbackTo[js.Array[Double]],
    getRotateWithView: CallbackTo[Boolean],
    getRotation: CallbackTo[Double],
    getScale: CallbackTo[Double],
    getSize: CallbackTo[Size],
    listenImageChange: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit] => Callback,
    load: Callback,
    setOpacity: Double => Callback,
    setRotateWithView: Boolean => Callback,
    setRotation: Double => Callback,
    setScale: Double => Callback,
    unlistenImageChange: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit] => Callback
  ): ImageStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnchor")(getAnchor.toJsFn)
    __obj.updateDynamic("getHitDetectionImage")(js.Any.fromFunction1((t0: scala.Double) => getHitDetectionImage(t0).runNow()))
    __obj.updateDynamic("getHitDetectionImageSize")(getHitDetectionImageSize.toJsFn)
    __obj.updateDynamic("getImage")(js.Any.fromFunction1((t0: scala.Double) => getImage(t0).runNow()))
    __obj.updateDynamic("getImageSize")(getImageSize.toJsFn)
    __obj.updateDynamic("getImageState")(getImageState.toJsFn)
    __obj.updateDynamic("getOpacity")(getOpacity.toJsFn)
    __obj.updateDynamic("getOrigin")(getOrigin.toJsFn)
    __obj.updateDynamic("getRotateWithView")(getRotateWithView.toJsFn)
    __obj.updateDynamic("getRotation")(getRotation.toJsFn)
    __obj.updateDynamic("getScale")(getScale.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("listenImageChange")(js.Any.fromFunction1((t0: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, scala.Unit]) => listenImageChange(t0).runNow()))
    __obj.updateDynamic("load")(load.toJsFn)
    __obj.updateDynamic("setOpacity")(js.Any.fromFunction1((t0: scala.Double) => setOpacity(t0).runNow()))
    __obj.updateDynamic("setRotateWithView")(js.Any.fromFunction1((t0: scala.Boolean) => setRotateWithView(t0).runNow()))
    __obj.updateDynamic("setRotation")(js.Any.fromFunction1((t0: scala.Double) => setRotation(t0).runNow()))
    __obj.updateDynamic("setScale")(js.Any.fromFunction1((t0: scala.Double) => setScale(t0).runNow()))
    __obj.updateDynamic("unlistenImageChange")(js.Any.fromFunction1((t0: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, scala.Unit]) => unlistenImageChange(t0).runNow()))
    __obj.asInstanceOf[ImageStyle]
  }
}

