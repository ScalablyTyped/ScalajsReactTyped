package typingsJapgolly.androiduix.android.view.ViewTreeObserver

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollChangedListener extends js.Object {
  def onScrollChanged(): js.Any
}

object OnScrollChangedListener {
  @scala.inline
  def apply(onScrollChanged: CallbackTo[js.Any]): OnScrollChangedListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onScrollChanged")(onScrollChanged.toJsFn)
    __obj.asInstanceOf[OnScrollChangedListener]
  }
}

