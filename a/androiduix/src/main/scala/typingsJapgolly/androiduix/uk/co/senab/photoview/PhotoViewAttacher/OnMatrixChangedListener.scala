package typingsJapgolly.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.graphics.RectF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMatrixChangedListener extends js.Object {
  def onMatrixChanged(rect: RectF): Unit
}

object OnMatrixChangedListener {
  @scala.inline
  def apply(onMatrixChanged: RectF => Callback): OnMatrixChangedListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onMatrixChanged")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.graphics.RectF) => onMatrixChanged(t0).runNow()))
    __obj.asInstanceOf[OnMatrixChangedListener]
  }
}

