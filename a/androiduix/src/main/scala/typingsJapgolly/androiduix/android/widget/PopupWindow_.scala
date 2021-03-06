package typingsJapgolly.androiduix.android.widget

import typingsJapgolly.androiduix.android.content.Context
import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.MotionEvent
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.View.OnTouchListener
import typingsJapgolly.androiduix.android.view.Window.Callback
import typingsJapgolly.androiduix.android.view.WindowManager.LayoutParams
import typingsJapgolly.androiduix.android.view.animation.Animation
import typingsJapgolly.androiduix.android.widget.PopupWindow.OnDismissListener
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.PopupWindow")
@js.native
class PopupWindow_ protected () extends Callback {
  def this(contentView: View) = this()
  def this(context: Context) = this()
  def this(contentView: View, width: Double) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
  def this(contentView: View, width: Double, height: Double) = this()
  def this(contentView: View, width: Double, height: Double, focusable: Boolean) = this()
  var mAboveAnchor: js.Any = js.native
  var mAboveAnchorBackgroundDrawable: js.Any = js.native
  var mAllowScrollingAnchorParent: js.Any = js.native
  var mAnchor: js.Any = js.native
  var mAnchorXoff: js.Any = js.native
  var mAnchorYoff: js.Any = js.native
  var mAnchoredGravity: js.Any = js.native
  var mBackground: js.Any = js.native
  var mBelowAnchorBackgroundDrawable: js.Any = js.native
  var mClipToScreen: js.Any = js.native
  var mContentView: js.Any = js.native
  var mContext: js.Any = js.native
  var mDefaultDropdownAboveEnterAnimation: js.Any = js.native
  var mDefaultDropdownAboveExitAnimation: js.Any = js.native
  var mDefaultDropdownBelowEnterAnimation: js.Any = js.native
  var mDefaultDropdownBelowExitAnimation: js.Any = js.native
  var mDrawingLocation: js.Any = js.native
  var mEnterAnimation: js.Any = js.native
  var mExitAnimation: js.Any = js.native
  var mFocusable: js.Any = js.native
  var mHeight: js.Any = js.native
  var mHeightMode: js.Any = js.native
  var mInputMethodMode: js.Any = js.native
  var mIsDropdown: js.Any = js.native
  var mIsShowing: js.Any = js.native
  var mLastHeight: js.Any = js.native
  var mLastWidth: js.Any = js.native
  var mNotTouchModal: js.Any = js.native
  var mOnDismissListener: js.Any = js.native
  var mOnScrollChangedListener: js.Any = js.native
  var mOutsideTouchable: js.Any = js.native
  var mPopupHeight: js.Any = js.native
  var mPopupView: js.Any = js.native
  var mPopupViewInitialLayoutDirectionInherited: js.Any = js.native
  var mPopupWidth: js.Any = js.native
  var mPopupWindow: js.Any = js.native
  var mScreenLocation: js.Any = js.native
  var mSplitTouchEnabled: js.Any = js.native
  var mTempRect: js.Any = js.native
  var mTouchInterceptor: js.Any = js.native
  var mTouchable: js.Any = js.native
  var mWidth: js.Any = js.native
  var mWidthMode: js.Any = js.native
  var mWindowLayoutType: js.Any = js.native
  var mWindowManager: js.Any = js.native
  /* private */ def _update(): js.Any = js.native
  /* private */ def _update_a_w_h(anchor: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_a_x_y_w_h(anchor: js.Any, xoff: js.Any, yoff: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_all_args(
    anchor: js.Any,
    updateLocation: js.Any,
    xoff: js.Any,
    yoff: js.Any,
    updateDimension: js.Any,
    width: js.Any,
    height: js.Any,
    gravity: js.Any
  ): js.Any = js.native
  /* private */ def _update_w_h(width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_x_y_w_h_f(x: js.Any, y: js.Any, width: js.Any, height: js.Any): js.Any = js.native
  /* private */ def _update_x_y_w_h_f(x: js.Any, y: js.Any, width: js.Any, height: js.Any, force: js.Any): js.Any = js.native
  /* private */ def computeFlags(curFlags: js.Any): js.Any = js.native
  /* private */ def computeWindowEnterAnimation(): js.Any = js.native
  /* private */ def computeWindowExitAnimation(): js.Any = js.native
  /* private */ def createPopupLayout(): js.Any = js.native
  def dismiss(): Unit = js.native
  /* CompleteClass */
  override def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  /* CompleteClass */
  override def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  /* private */ def findDropDownPosition(anchor: js.Any, p: js.Any, xoff: js.Any, yoff: js.Any, gravity: js.Any): js.Any = js.native
  def getBackground(): Drawable = js.native
  def getContentView(): View = js.native
  def getEnterAnimation(): Animation = js.native
  def getExitAnimation(): Animation = js.native
  def getHeight(): Double = js.native
  def getInputMethodMode(): Double = js.native
  def getMaxAvailableHeight(anchor: View): Double = js.native
  def getMaxAvailableHeight(anchor: View, yOffset: Double): Double = js.native
  def getMaxAvailableHeight(anchor: View, yOffset: Double, ignoreBottomDecorations: Boolean): Double = js.native
  def getWidth(): Double = js.native
  def getWindowLayoutType(): Double = js.native
  /* private */ def invokePopup(p: js.Any): js.Any = js.native
  def isAboveAnchor(): Boolean = js.native
  def isFocusable(): Boolean = js.native
  def isOutsideTouchable(): Boolean = js.native
  def isShowing(): Boolean = js.native
  def isSplitTouchEnabled(): Boolean = js.native
  def isTouchable(): Boolean = js.native
  /* CompleteClass */
  override def onAttachedToWindow(): Unit = js.native
  /* CompleteClass */
  override def onContentChanged(): Unit = js.native
  /* CompleteClass */
  override def onDetachedFromWindow(): Unit = js.native
  def onGenericMotionEvent(event: MotionEvent): Boolean = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onWindowAttributesChanged(attrs: LayoutParams): Unit = js.native
  /* CompleteClass */
  override def onWindowFocusChanged(hasFocus: Boolean): Unit = js.native
  /* private */ def preparePopup(p: js.Any): js.Any = js.native
  /* private */ def registerForScrollChanged(anchor: js.Any, xoff: js.Any, yoff: js.Any, gravity: js.Any): js.Any = js.native
  /* private */ def setAllowScrollingAnchorParent(enabled: js.Any): js.Any = js.native
  def setBackgroundDrawable(background: Drawable): Unit = js.native
  def setClipToScreenEnabled(enabled: Boolean): Unit = js.native
  def setContentView(contentView: View): Unit = js.native
  def setFocusable(focusable: Boolean): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setInputMethodMode(mode: Double): Unit = js.native
  /* private */ def setLayoutDirectionFromAnchor(): js.Any = js.native
  def setOnDismissListener(onDismissListener: OnDismissListener): Unit = js.native
  def setOutsideTouchable(touchable: Boolean): Unit = js.native
  def setSplitTouchEnabled(enabled: Boolean): Unit = js.native
  def setTouchInterceptor(l: OnTouchListener): Unit = js.native
  def setTouchModal(touchModal: Boolean): Unit = js.native
  def setTouchable(touchable: Boolean): Unit = js.native
  def setWidth(width: Double): Unit = js.native
  def setWindowAnimation(enterAnimation: Animation, exitAnimation: Animation): Unit = js.native
  def setWindowLayoutMode(widthSpec: Double, heightSpec: Double): Unit = js.native
  def setWindowLayoutType(layoutType: Double): Unit = js.native
  def showAsDropDown(anchor: View): Unit = js.native
  def showAsDropDown(anchor: View, xoff: Double): Unit = js.native
  def showAsDropDown(anchor: View, xoff: Double, yoff: Double): Unit = js.native
  def showAsDropDown(anchor: View, xoff: Double, yoff: Double, gravity: Double): Unit = js.native
  def showAtLocation(parent: View, gravity: Double, x: Double, y: Double): Unit = js.native
  /* private */ def unregisterForScrollChanged(): js.Any = js.native
  def update(): Unit = js.native
  def update(anchor: View, width: Double, height: Double): Unit = js.native
  def update(anchor: View, xoff: Double, yoff: Double, width: Double, height: Double): Unit = js.native
  def update(width: Double, height: Double): Unit = js.native
  def update(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def update(x: Double, y: Double, width: Double, height: Double, force: Boolean): Unit = js.native
  /* private */ def updateAboveAnchor(aboveAnchor: js.Any): js.Any = js.native
}

