package typingsJapgolly.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFocusChangeListener extends js.Object {
  def onFocusChange(v: typingsJapgolly.androiduix.android.view.View, hasFocus: Boolean): Unit
}

@JSGlobal("android.view.View.OnFocusChangeListener")
@js.native
object OnFocusChangeListener extends js.Object {
  def fromFunction(
    func: js.Function2[/* v */ typingsJapgolly.androiduix.android.view.View, /* hasFocus */ Boolean, Unit]
  ): OnFocusChangeListener = js.native
}

