package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalLayoutListener extends js.Object {
  def onGlobalLayout(): js.Any
}

object OnGlobalLayoutListener {
  @scala.inline
  def apply(onGlobalLayout: CallbackTo[js.Any]): OnGlobalLayoutListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGlobalLayout")(onGlobalLayout.toJsFn)
    __obj.asInstanceOf[OnGlobalLayoutListener]
  }
}

