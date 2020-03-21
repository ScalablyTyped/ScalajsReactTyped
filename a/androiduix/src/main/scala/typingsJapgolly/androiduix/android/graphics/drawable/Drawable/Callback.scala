package typingsJapgolly.androiduix.android.graphics.drawable.Drawable

import typingsJapgolly.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var drawableSizeChange: js.UndefOr[
    js.Function1[/* who */ typingsJapgolly.androiduix.android.graphics.drawable.Drawable, Unit]
  ] = js.undefined
  def invalidateDrawable(who: typingsJapgolly.androiduix.android.graphics.drawable.Drawable): Unit
  def scheduleDrawable(who: typingsJapgolly.androiduix.android.graphics.drawable.Drawable, what: Runnable, when: Double): Unit
  def unscheduleDrawable(who: typingsJapgolly.androiduix.android.graphics.drawable.Drawable, what: Runnable): Unit
}

object Callback {
  @scala.inline
  def apply(
    invalidateDrawable: typingsJapgolly.androiduix.android.graphics.drawable.Drawable => japgolly.scalajs.react.Callback,
    scheduleDrawable: (typingsJapgolly.androiduix.android.graphics.drawable.Drawable, Runnable, Double) => japgolly.scalajs.react.Callback,
    unscheduleDrawable: (typingsJapgolly.androiduix.android.graphics.drawable.Drawable, Runnable) => japgolly.scalajs.react.Callback,
    drawableSizeChange: /* who */ typingsJapgolly.androiduix.android.graphics.drawable.Drawable => japgolly.scalajs.react.Callback = null
  ): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invalidateDrawable")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.graphics.drawable.Drawable) => invalidateDrawable(t0).runNow()))
    __obj.updateDynamic("scheduleDrawable")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.graphics.drawable.Drawable, t1: typingsJapgolly.androiduix.java.lang.Runnable, t2: scala.Double) => scheduleDrawable(t0, t1, t2).runNow()))
    __obj.updateDynamic("unscheduleDrawable")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.graphics.drawable.Drawable, t1: typingsJapgolly.androiduix.java.lang.Runnable) => unscheduleDrawable(t0, t1).runNow()))
    if (drawableSizeChange != null) __obj.updateDynamic("drawableSizeChange")(js.Any.fromFunction1((t0: /* who */ typingsJapgolly.androiduix.android.graphics.drawable.Drawable) => drawableSizeChange(t0).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

