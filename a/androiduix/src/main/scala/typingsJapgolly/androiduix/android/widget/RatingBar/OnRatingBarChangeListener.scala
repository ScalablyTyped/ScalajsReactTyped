package typingsJapgolly.androiduix.android.widget.RatingBar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRatingBarChangeListener extends js.Object {
  def onRatingChanged(ratingBar: typingsJapgolly.androiduix.android.widget.RatingBar, rating: Double, fromUser: Boolean): Unit
}

object OnRatingBarChangeListener {
  @scala.inline
  def apply(
    onRatingChanged: (typingsJapgolly.androiduix.android.widget.RatingBar, Double, Boolean) => Callback
  ): OnRatingBarChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onRatingChanged")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.RatingBar, t1: scala.Double, t2: scala.Boolean) => onRatingChanged(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnRatingBarChangeListener]
  }
}

