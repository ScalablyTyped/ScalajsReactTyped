package typingsJapgolly.reactNativeTabView.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeTabView.AnonDamping
import typingsJapgolly.reactNativeTabView.AnonDuration
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.auto
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerCommonProps extends js.Object {
  var keyboardDismissMode: none | `on-drag` | auto
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var springConfig: AnonDamping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var timingConfig: AnonDuration
}

object PagerCommonProps {
  @scala.inline
  def apply(
    keyboardDismissMode: none | `on-drag` | auto,
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    timingConfig: AnonDuration,
    onSwipeEnd: js.UndefOr[Callback] = js.undefined,
    onSwipeStart: js.UndefOr[Callback] = js.undefined,
    springVelocityScale: Int | Double = null,
    swipeVelocityImpact: Int | Double = null
  ): PagerCommonProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    onSwipeEnd.foreach(p => __obj.updateDynamic("onSwipeEnd")(p.toJsFn))
    onSwipeStart.foreach(p => __obj.updateDynamic("onSwipeStart")(p.toJsFn))
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerCommonProps]
  }
}

