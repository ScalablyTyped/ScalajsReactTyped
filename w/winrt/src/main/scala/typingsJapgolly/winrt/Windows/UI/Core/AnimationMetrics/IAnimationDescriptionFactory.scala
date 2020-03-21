package typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationDescriptionFactory extends js.Object {
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription
}

object IAnimationDescriptionFactory {
  @scala.inline
  def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => CallbackTo[AnimationDescription]): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect, t1: typingsJapgolly.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget) => createInstance(t0, t1).runNow()))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
}

