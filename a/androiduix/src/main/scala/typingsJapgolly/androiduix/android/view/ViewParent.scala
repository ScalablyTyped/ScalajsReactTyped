package typingsJapgolly.androiduix.android.view

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.graphics.Point
import typingsJapgolly.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any
  def childDrawableStateChanged(child: View): js.Any
  def childHasTransientStateChanged(child: View, hasTransientState: Boolean): js.Any
  def clearChildFocus(child: View): js.Any
  def focusSearch(v: View, direction: Double): View
  def focusableViewAvailable(v: View): js.Any
  def getChildVisibleRect(child: View, r: Rect, offset: Point): Boolean
  def getParent(): ViewParent
  def invalidateChild(child: View, r: Rect): js.Any
  def invalidateChildInParent(location: js.Array[Double], r: Rect): ViewParent
  def isLayoutRequested(): Boolean
  def requestChildFocus(child: View, focused: View): js.Any
  def requestChildRectangleOnScreen(child: View, rectangle: Rect, immediate: Boolean): Boolean
  def requestDisallowInterceptTouchEvent(disallowIntercept: Boolean): js.Any
  def requestLayout(): js.Any
}

object ViewParent {
  @scala.inline
  def apply(
    bringChildToFront: View => CallbackTo[js.Any],
    childDrawableStateChanged: View => CallbackTo[js.Any],
    childHasTransientStateChanged: (View, Boolean) => CallbackTo[js.Any],
    clearChildFocus: View => CallbackTo[js.Any],
    focusSearch: (View, Double) => CallbackTo[View],
    focusableViewAvailable: View => CallbackTo[js.Any],
    getChildVisibleRect: (View, Rect, Point) => CallbackTo[Boolean],
    getParent: CallbackTo[ViewParent],
    invalidateChild: (View, Rect) => CallbackTo[js.Any],
    invalidateChildInParent: (js.Array[Double], Rect) => CallbackTo[ViewParent],
    isLayoutRequested: CallbackTo[Boolean],
    requestChildFocus: (View, View) => CallbackTo[js.Any],
    requestChildRectangleOnScreen: (View, Rect, Boolean) => CallbackTo[Boolean],
    requestDisallowInterceptTouchEvent: Boolean => CallbackTo[js.Any],
    requestLayout: CallbackTo[js.Any]
  ): ViewParent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bringChildToFront")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => bringChildToFront(t0).runNow()))
    __obj.updateDynamic("childDrawableStateChanged")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => childDrawableStateChanged(t0).runNow()))
    __obj.updateDynamic("childHasTransientStateChanged")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Boolean) => childHasTransientStateChanged(t0, t1).runNow()))
    __obj.updateDynamic("clearChildFocus")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => clearChildFocus(t0).runNow()))
    __obj.updateDynamic("focusSearch")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: scala.Double) => focusSearch(t0, t1).runNow()))
    __obj.updateDynamic("focusableViewAvailable")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.View) => focusableViewAvailable(t0).runNow()))
    __obj.updateDynamic("getChildVisibleRect")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.graphics.Rect, t2: typingsJapgolly.androiduix.android.graphics.Point) => getChildVisibleRect(t0, t1, t2).runNow()))
    __obj.updateDynamic("getParent")(getParent.toJsFn)
    __obj.updateDynamic("invalidateChild")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.graphics.Rect) => invalidateChild(t0, t1).runNow()))
    __obj.updateDynamic("invalidateChildInParent")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: typingsJapgolly.androiduix.android.graphics.Rect) => invalidateChildInParent(t0, t1).runNow()))
    __obj.updateDynamic("isLayoutRequested")(isLayoutRequested.toJsFn)
    __obj.updateDynamic("requestChildFocus")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.view.View) => requestChildFocus(t0, t1).runNow()))
    __obj.updateDynamic("requestChildRectangleOnScreen")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.view.View, t1: typingsJapgolly.androiduix.android.graphics.Rect, t2: scala.Boolean) => requestChildRectangleOnScreen(t0, t1, t2).runNow()))
    __obj.updateDynamic("requestDisallowInterceptTouchEvent")(js.Any.fromFunction1((t0: scala.Boolean) => requestDisallowInterceptTouchEvent(t0).runNow()))
    __obj.updateDynamic("requestLayout")(requestLayout.toJsFn)
    __obj.asInstanceOf[ViewParent]
  }
}

