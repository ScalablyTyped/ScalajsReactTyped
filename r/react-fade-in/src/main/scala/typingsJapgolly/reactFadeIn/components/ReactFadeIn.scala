package typingsJapgolly.reactFadeIn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFadeIn.mod.FadeInProps
import typingsJapgolly.reactFadeIn.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFadeIn {
  def apply(
    className: String = null,
    delay: Int | Double = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FadeInProps, default, Unit, FadeInProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFadeIn.mod.FadeInProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFadeIn.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFadeIn.mod.FadeInProps])(children: _*)
  }
  @JSImport("react-fade-in", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

