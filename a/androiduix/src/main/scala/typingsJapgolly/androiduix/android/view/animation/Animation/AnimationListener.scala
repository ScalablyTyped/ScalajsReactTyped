package typingsJapgolly.androiduix.android.view.animation.Animation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationListener extends js.Object {
  def onAnimationEnd(animation: typingsJapgolly.androiduix.android.view.animation.Animation): Unit
  def onAnimationRepeat(animation: typingsJapgolly.androiduix.android.view.animation.Animation): Unit
  def onAnimationStart(animation: typingsJapgolly.androiduix.android.view.animation.Animation): Unit
}

object AnimationListener {
  @scala.inline
  def apply(
    onAnimationEnd: typingsJapgolly.androiduix.android.view.animation.Animation => Callback,
    onAnimationRepeat: typingsJapgolly.androiduix.android.view.animation.Animation => Callback,
    onAnimationStart: typingsJapgolly.androiduix.android.view.animation.Animation => Callback
  ): AnimationListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.animation.Animation) => onAnimationEnd(t0).runNow()))
    __obj.updateDynamic("onAnimationRepeat")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.animation.Animation) => onAnimationRepeat(t0).runNow()))
    __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.animation.Animation) => onAnimationStart(t0).runNow()))
    __obj.asInstanceOf[AnimationListener]
  }
}

