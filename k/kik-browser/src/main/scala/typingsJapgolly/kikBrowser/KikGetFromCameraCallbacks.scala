package typingsJapgolly.kikBrowser

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikGetFromCameraCallbacks extends js.Object {
  def onCancel(): Unit
  def onComplete(photos: js.Array[String]): Unit
  def onPhoto(photo: String, index: Double): Unit
  def onSelect(numPhotos: Double): Unit
}

object KikGetFromCameraCallbacks {
  @scala.inline
  def apply(
    onCancel: Callback,
    onComplete: js.Array[String] => Callback,
    onPhoto: (String, Double) => Callback,
    onSelect: Double => Callback
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => onComplete(t0).runNow()))
    __obj.updateDynamic("onPhoto")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => onPhoto(t0, t1).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: scala.Double) => onSelect(t0).runNow()))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
}

