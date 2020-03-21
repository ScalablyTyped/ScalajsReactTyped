package typingsJapgolly.androiduix.androidui.native.NativeApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageApi extends js.Object {
  def createImage(imageId: Double): Unit
  def getPixels(imageId: Double, callbackIndex: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
  def loadImage(imageId: Double, src: String): Unit
  def recycleImage(imageId: Double): Unit
}

object ImageApi {
  @scala.inline
  def apply(
    createImage: Double => Callback,
    getPixels: (Double, Double, Double, Double, Double, Double) => Callback,
    loadImage: (Double, String) => Callback,
    recycleImage: Double => Callback
  ): ImageApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createImage")(js.Any.fromFunction1((t0: scala.Double) => createImage(t0).runNow()))
    __obj.updateDynamic("getPixels")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => getPixels(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("loadImage")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => loadImage(t0, t1).runNow()))
    __obj.updateDynamic("recycleImage")(js.Any.fromFunction1((t0: scala.Double) => recycleImage(t0).runNow()))
    __obj.asInstanceOf[ImageApi]
  }
}

