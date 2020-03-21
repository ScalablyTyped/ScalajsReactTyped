package typingsJapgolly.androiduix.android.view.View

import typingsJapgolly.androiduix.android.graphics.Matrix
import typingsJapgolly.androiduix.android.graphics.Point
import typingsJapgolly.androiduix.android.graphics.Rect
import typingsJapgolly.androiduix.android.os.Handler
import typingsJapgolly.androiduix.android.view.KeyEvent.DispatcherState
import typingsJapgolly.androiduix.android.view.ViewRootImpl
import typingsJapgolly.androiduix.android.view.animation.Transformation
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.AttachInfo")
@js.native
class AttachInfo protected () extends js.Object {
  def this(mViewRootImpl: ViewRootImpl, mHandler: Handler) = this()
  var mHandler: Handler = js.native
  var mHasWindowFocus: Boolean = js.native
  var mInvalidateChildLocation: js.Array[Double] = js.native
  var mKeyDispatchState: DispatcherState = js.native
  var mPoint: Point = js.native
  var mRootView: typingsJapgolly.androiduix.android.view.View = js.native
  var mScrollContainers: Set[typingsJapgolly.androiduix.android.view.View] = js.native
  var mTmpInvalRect: Rect = js.native
  var mTmpMatrix: Matrix = js.native
  var mTmpTransformLocation: js.Array[Double] = js.native
  var mTmpTransformRect: Rect = js.native
  var mTmpTransformation: Transformation = js.native
  var mViewRequestingLayout: typingsJapgolly.androiduix.android.view.View = js.native
  var mViewRootImpl: ViewRootImpl = js.native
  var mWindowVisibility: Double = js.native
}

@JSGlobal("android.view.View.AttachInfo")
@js.native
object AttachInfo extends js.Object {
  @js.native
  class InvalidateInfo () extends js.Object {
    var bottom: Double = js.native
    var left: Double = js.native
    var right: Double = js.native
    var target: typingsJapgolly.androiduix.android.view.View = js.native
    var top: Double = js.native
    def recycle(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object InvalidateInfo extends js.Object {
    var POOL_LIMIT: js.Any = js.native
    var sPool: js.Any = js.native
    def obtain(): InvalidateInfo = js.native
  }
  
}

