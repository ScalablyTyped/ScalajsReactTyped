package typingsJapgolly.victory.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.victory.mod.AnimationData
import typingsJapgolly.victory.mod.AnimationEasing
import typingsJapgolly.victory.mod.AnimationStyle
import typingsJapgolly.victory.mod.VictoryAnimationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryAnimation {
  def apply(
    data: AnimationData = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: AnimationEasing = null,
    onEnd: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* style */ AnimationStyle => CallbackTo[Element] = null
  ): UnmountedWithRoot[
    VictoryAnimationProps, 
    typingsJapgolly.victory.mod.VictoryAnimation, 
    Unit, 
    VictoryAnimationProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.victory.mod.AnimationStyle) => children(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.victory.mod.VictoryAnimationProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.victory.mod.VictoryAnimation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.victory.mod.VictoryAnimationProps])
  }
  @JSImport("victory", "VictoryAnimation")
  @js.native
  object componentImport extends js.Object
  
}

