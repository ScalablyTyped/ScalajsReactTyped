package typingsJapgolly.androiduix.android.view

import typingsJapgolly.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.TouchDelegate")
@js.native
class TouchDelegate protected () extends js.Object {
  def this(bounds: Rect, delegateView: View) = this()
  var mBounds: js.Any = js.native
  var mDelegateTargeted: js.Any = js.native
  var mDelegateView: js.Any = js.native
  var mSlop: js.Any = js.native
  var mSlopBounds: js.Any = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
}

