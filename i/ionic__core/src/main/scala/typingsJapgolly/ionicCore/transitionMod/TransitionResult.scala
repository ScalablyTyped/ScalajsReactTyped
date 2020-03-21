package typingsJapgolly.ionicCore.transitionMod

import typingsJapgolly.ionicCore.oldAnimationAnimationInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionResult extends js.Object {
  var animation: js.UndefOr[Animation | typingsJapgolly.ionicCore.animationInterfaceMod.Animation] = js.undefined
  var hasCompleted: Boolean
}

object TransitionResult {
  @scala.inline
  def apply(
    hasCompleted: Boolean,
    animation: Animation | typingsJapgolly.ionicCore.animationInterfaceMod.Animation = null
  ): TransitionResult = {
    val __obj = js.Dynamic.literal(hasCompleted = hasCompleted.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionResult]
  }
}

