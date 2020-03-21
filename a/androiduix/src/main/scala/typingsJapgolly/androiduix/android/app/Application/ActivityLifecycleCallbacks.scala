package typingsJapgolly.androiduix.android.app.Application

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.app.Activity
import typingsJapgolly.androiduix.android.os.Bundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityLifecycleCallbacks extends js.Object {
  def onActivityCreated(activity: Activity, savedInstanceState: Bundle): Unit
  def onActivityDestroyed(activity: Activity): Unit
  def onActivityPaused(activity: Activity): Unit
  def onActivityResumed(activity: Activity): Unit
  def onActivitySaveInstanceState(activity: Activity, outState: Bundle): Unit
  def onActivityStarted(activity: Activity): Unit
  def onActivityStopped(activity: Activity): Unit
}

object ActivityLifecycleCallbacks {
  @scala.inline
  def apply(
    onActivityCreated: (Activity, Bundle) => Callback,
    onActivityDestroyed: Activity => Callback,
    onActivityPaused: Activity => Callback,
    onActivityResumed: Activity => Callback,
    onActivitySaveInstanceState: (Activity, Bundle) => Callback,
    onActivityStarted: Activity => Callback,
    onActivityStopped: Activity => Callback
  ): ActivityLifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onActivityCreated")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.app.Activity, t1: typingsJapgolly.androiduix.android.os.Bundle) => onActivityCreated(t0, t1).runNow()))
    __obj.updateDynamic("onActivityDestroyed")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.app.Activity) => onActivityDestroyed(t0).runNow()))
    __obj.updateDynamic("onActivityPaused")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.app.Activity) => onActivityPaused(t0).runNow()))
    __obj.updateDynamic("onActivityResumed")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.app.Activity) => onActivityResumed(t0).runNow()))
    __obj.updateDynamic("onActivitySaveInstanceState")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.app.Activity, t1: typingsJapgolly.androiduix.android.os.Bundle) => onActivitySaveInstanceState(t0, t1).runNow()))
    __obj.updateDynamic("onActivityStarted")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.app.Activity) => onActivityStarted(t0).runNow()))
    __obj.updateDynamic("onActivityStopped")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.app.Activity) => onActivityStopped(t0).runNow()))
    __obj.asInstanceOf[ActivityLifecycleCallbacks]
  }
}

