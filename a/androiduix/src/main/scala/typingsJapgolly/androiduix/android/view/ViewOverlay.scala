package typingsJapgolly.androiduix.android.view

import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.view.ViewOverlay.OverlayViewGroup
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewOverlay")
@js.native
class ViewOverlay protected () extends js.Object {
  def this(hostView: View) = this()
  var mOverlayViewGroup: OverlayViewGroup = js.native
  def add(drawable: Drawable): Unit = js.native
  def clear(): Unit = js.native
  def getOverlayView(): ViewGroup = js.native
  def isEmpty(): Boolean = js.native
  def remove(drawable: Drawable): Unit = js.native
}

@JSGlobal("android.view.ViewOverlay")
@js.native
object ViewOverlay extends js.Object {
  @js.native
  class OverlayViewGroup protected () extends ViewGroup {
    def this(hostView: View) = this()
    var mDrawables: Set[Drawable] = js.native
    var mHostView: View = js.native
    def add(child: View): js.Any = js.native
    def add(drawable: Drawable): js.Any = js.native
    /* private */ def addDrawable(drawable: js.Any): js.Any = js.native
    def clear(): Unit = js.native
    def isEmpty(): Boolean = js.native
  }
  
}

