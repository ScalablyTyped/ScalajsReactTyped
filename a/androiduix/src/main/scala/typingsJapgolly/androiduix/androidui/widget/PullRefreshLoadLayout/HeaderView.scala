package typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout

import typingsJapgolly.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.HeaderView")
@js.native
abstract class HeaderView () extends FrameLayout {
  var state: js.Any = js.native
  var stateBeforeReady: js.Any = js.native
  def onStateChange(newState: Double, oldState: Double): Unit = js.native
  /* protected */ def setStateInner(prll: typingsJapgolly.androiduix.androidui.widget.PullRefreshLoadLayout, state: Double): Unit = js.native
}

