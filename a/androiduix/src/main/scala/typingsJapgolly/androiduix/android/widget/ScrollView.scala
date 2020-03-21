package typingsJapgolly.androiduix.android.widget

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.graphics.Rect
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ScrollView")
@js.native
class ScrollView protected () extends FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mActivePointerId: js.Any = js.native
  var mChildToScrollTo: js.Any = js.native
  var mFillViewport: js.Any = js.native
  var mIsBeingDragged: js.Any = js.native
  var mIsLayoutDirty: js.Any = js.native
  var mLastMotionY: js.Any = js.native
  var mLastScroll: js.Any = js.native
  var mMaximumVelocity: js.Any = js.native
  var mMinimumVelocity: js.Any = js.native
  var mOverflingDistance: js.Any = js.native
  var mOverscrollDistance: js.Any = js.native
  var mScroller: js.Any = js.native
  var mSmoothScrollingEnabled: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  def arrowScroll(direction: Double): Boolean = js.native
  /* private */ def canScroll(): js.Any = js.native
  /* protected */ def computeScrollDeltaToGetChildRectOnScreen(rect: Rect): Double = js.native
  /* private */ def doScrollY(delta: js.Any): js.Any = js.native
  /* private */ def endDrag(): js.Any = js.native
  def executeKeyEvent(event: KeyEvent): Boolean = js.native
  /* private */ def findFocusableViewInBounds(topFocus: js.Any, top: js.Any, bottom: js.Any): js.Any = js.native
  def fling(velocityY: Double): Unit = js.native
  def fullScroll(direction: Double): Boolean = js.native
  def getMaxScrollAmount(): Double = js.native
  /* private */ def getScrollRange(): js.Any = js.native
  /* private */ def inChild(x: js.Any, y: js.Any): js.Any = js.native
  /* private */ def initOrResetVelocityTracker(): js.Any = js.native
  /* private */ def initScrollView(): js.Any = js.native
  /* private */ def initVelocityTrackerIfNotExists(): js.Any = js.native
  def isFillViewport(): Boolean = js.native
  /* private */ def isOffScreen(descendant: js.Any): js.Any = js.native
  def isSmoothScrollingEnabled(): Boolean = js.native
  /* private */ def isWithinDeltaOfScreen(descendant: js.Any, delta: js.Any, height: js.Any): js.Any = js.native
  /* private */ def onSecondaryPointerUp(ev: js.Any): js.Any = js.native
  def pageScroll(direction: Double): Boolean = js.native
  /* private */ def recycleVelocityTracker(): js.Any = js.native
  /* private */ def scrollAndFocus(direction: js.Any, top: js.Any, bottom: js.Any): js.Any = js.native
  /* private */ def scrollToChild(child: js.Any): js.Any = js.native
  /* private */ def scrollToChildRect(rect: js.Any, immediate: js.Any): js.Any = js.native
  def setFillViewport(fillViewport: Boolean): Unit = js.native
  def setSmoothScrollingEnabled(smoothScrollingEnabled: Boolean): Unit = js.native
  def smoothScrollBy(dx: Double, dy: Double): Unit = js.native
  def smoothScrollTo(x: Double, y: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ScrollView")
@js.native
object ScrollView extends js.Object {
  var ANIMATED_SCROLL_GAP: Double = js.native
  var INVALID_POINTER: js.Any = js.native
  var MAX_SCROLL_FACTOR: Double = js.native
  var TAG: js.Any = js.native
  /* private */ def clamp(n: js.Any, my: js.Any, child: js.Any): js.Any = js.native
  /* private */ def isViewDescendantOf(child: js.Any, parent: js.Any): js.Any = js.native
}

