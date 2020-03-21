package typingsJapgolly.reactTypingAnimation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTypingAnimation.mod.Typing.DelayProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Delay {
  def apply(
    ms: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DelayProperties, 
    typingsJapgolly.reactTypingAnimation.mod.default.Delay, 
    Unit, 
    DelayProperties
  ] = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTypingAnimation.mod.Typing.DelayProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTypingAnimation.mod.default.Delay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTypingAnimation.mod.Typing.DelayProperties])(children: _*)
  }
  @JSImport("react-typing-animation", "default.Delay")
  @js.native
  object componentImport extends js.Object
  
}

