package typingsJapgolly.reactTypingAnimation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTypingAnimation.mod.Typing.ResetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reset {
  def apply(
    count: Int | Double = null,
    delay: Int | Double = null,
    speed: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ResetProperties, 
    typingsJapgolly.reactTypingAnimation.mod.default.Reset, 
    Unit, 
    ResetProperties
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTypingAnimation.mod.Typing.ResetProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTypingAnimation.mod.default.Reset](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTypingAnimation.mod.Typing.ResetProperties])(children: _*)
  }
  @JSImport("react-typing-animation", "default.Reset")
  @js.native
  object componentImport extends js.Object
  
}

