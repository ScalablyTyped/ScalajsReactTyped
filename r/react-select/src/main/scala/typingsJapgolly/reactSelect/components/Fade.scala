package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.transitionsMod.FadeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fade {
  def apply(
    component: ComponentType[_],
    duration: Double,
    in: Boolean,
    onExited: Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FadeProps, typingsJapgolly.reactSelect.transitionsMod.Fade, Unit, FadeProps] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onExited")(onExited.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.transitionsMod.FadeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSelect.transitionsMod.Fade](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.transitionsMod.FadeProps])(children: _*)
  }
  @JSImport("react-select/src/animated/transitions", "Fade")
  @js.native
  object componentImport extends js.Object
  
}

