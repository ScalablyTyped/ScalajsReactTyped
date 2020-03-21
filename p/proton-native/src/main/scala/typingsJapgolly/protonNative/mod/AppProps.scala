package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppProps extends js.Object {
  /**
    * Called when the quit menu item is called, right before the entire app quits.
    */
  var onShouldQuit: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AppProps {
  @scala.inline
  def apply(onShouldQuit: js.UndefOr[Callback] = js.undefined): AppProps = {
    val __obj = js.Dynamic.literal()
    onShouldQuit.foreach(p => __obj.updateDynamic("onShouldQuit")(p.toJsFn))
    __obj.asInstanceOf[AppProps]
  }
}

