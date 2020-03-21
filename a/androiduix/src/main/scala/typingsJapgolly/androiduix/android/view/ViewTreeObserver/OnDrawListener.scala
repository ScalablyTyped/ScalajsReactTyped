package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDrawListener extends js.Object {
  def onDraw(): js.Any
}

object OnDrawListener {
  @scala.inline
  def apply(onDraw: CallbackTo[js.Any]): OnDrawListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDraw")(onDraw.toJsFn)
    __obj.asInstanceOf[OnDrawListener]
  }
}

