package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPreDrawListener extends js.Object {
  def onPreDraw(): Boolean
}

object OnPreDrawListener {
  @scala.inline
  def apply(onPreDraw: CallbackTo[Boolean]): OnPreDrawListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPreDraw")(onPreDraw.toJsFn)
    __obj.asInstanceOf[OnPreDrawListener]
  }
}

