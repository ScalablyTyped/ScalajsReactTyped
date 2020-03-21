package typingsJapgolly.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnViewTapListener extends js.Object {
  def onViewTap(view: View, x: Double, y: Double): Unit
}

object OnViewTapListener {
  @scala.inline
  def apply(onViewTap: (View, Double, Double) => Callback): OnViewTapListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onViewTap")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double, t2: scala.Double) => onViewTap(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnViewTapListener]
  }
}

