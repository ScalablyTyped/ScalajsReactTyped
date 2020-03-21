package typingsJapgolly.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPhotoTapListener extends js.Object {
  def onPhotoTap(view: View, x: Double, y: Double): Unit
}

object OnPhotoTapListener {
  @scala.inline
  def apply(onPhotoTap: (View, Double, Double) => Callback): OnPhotoTapListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPhotoTap")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double, t2: scala.Double) => onPhotoTap(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnPhotoTapListener]
  }
}

