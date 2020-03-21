package typingsJapgolly.androiduix.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.animation.Interpolator
import typingsJapgolly.androiduix.androidui.image.NetDrawable
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ProgressBar")
@js.native
class ProgressBar protected () extends View {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mAnimation: js.Any = js.native
  var mAttached: js.Any = js.native
  var mBehavior: js.Any = js.native
  var mCurrentDrawable: js.Any = js.native
  var mDuration: js.Any = js.native
  var mHasAnimation: js.Any = js.native
  var mInDrawing: js.Any = js.native
  var mIndeterminate: js.Any = js.native
  var mIndeterminateDrawable: js.Any = js.native
  var mInterpolator: js.Any = js.native
  var mMax: js.Any = js.native
  var mMaxHeight: Double = js.native
  var mMaxWidth: Double = js.native
  var mMirrorForRtl: Boolean = js.native
  var mNoInvalidate: js.Any = js.native
  var mOnlyIndeterminate: js.Any = js.native
  var mProgress: js.Any = js.native
  var mProgressDrawable: js.Any = js.native
  var mRefreshData: js.Any = js.native
  var mRefreshIsPosted: js.Any = js.native
  var mSampleTile: NetDrawable = js.native
  var mSecondaryProgress: js.Any = js.native
  var mShouldStartAnimationDrawable: js.Any = js.native
  var mTransformation: js.Any = js.native
  /* private */ def doRefreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any, callBackToApp: js.Any): js.Any = js.native
  def getCurrentDrawable(): Drawable = js.native
  def getIndeterminateDrawable(): Drawable = js.native
  def getInterpolator(): Interpolator = js.native
  def getMax(): Double = js.native
  def getProgress(): Double = js.native
  def getProgressDrawable(): Drawable = js.native
  def getSecondaryProgress(): Double = js.native
  def incrementProgressBy(diff: Double): Unit = js.native
  def incrementSecondaryProgressBy(diff: Double): Unit = js.native
  /* private */ def initProgressBar(): js.Any = js.native
  def isIndeterminate(): Boolean = js.native
  def onProgressRefresh(scale: Double, fromUser: Boolean): Unit = js.native
  /* private */ def refreshProgress(id: js.Any, progress: js.Any, fromUser: js.Any): js.Any = js.native
  def setIndeterminate(indeterminate: Boolean): Unit = js.native
  def setIndeterminateDrawable(d: Drawable): Unit = js.native
  def setInterpolator(interpolator: Interpolator): Unit = js.native
  def setMax(max: Double): Unit = js.native
  def setProgress(progress: Double): Unit = js.native
  def setProgress(progress: Double, fromUser: Boolean): Unit = js.native
  def setProgressDrawable(d: Drawable): Unit = js.native
  def setSecondaryProgress(secondaryProgress: Double): Unit = js.native
  def startAnimation(): Unit = js.native
  def stopAnimation(): Unit = js.native
  /* private */ def tileify(drawable: js.Any, clip: js.Any): js.Any = js.native
  /* private */ def tileifyIndeterminate(drawable: js.Any): js.Any = js.native
  /* private */ def updateDrawableBounds(w: js.Any, h: js.Any): js.Any = js.native
  /* private */ def updateDrawableState(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  @js.native
  class RefreshData () extends js.Object {
    var fromUser: Boolean = js.native
    var id: String = js.native
    var progress: Double = js.native
    def recycle(): Unit = js.native
  }
  
  var MAX_LEVEL: js.Any = js.native
  var TIMEOUT_SEND_ACCESSIBILITY_EVENT: js.Any = js.native
  /* static members */
  @js.native
  object RefreshData extends js.Object {
    var POOL_MAX: js.Any = js.native
    var sPool: js.Any = js.native
    def obtain(id: String, progress: Double, fromUser: Boolean): RefreshData = js.native
  }
  
}

