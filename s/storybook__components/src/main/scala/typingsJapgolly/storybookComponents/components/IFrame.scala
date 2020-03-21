package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.iframeMod.IFrameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IFrame {
  def apply(
    allowFullScreen: Boolean,
    id: String,
    scale: Double,
    src: String,
    title: String,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IFrameProps, typingsJapgolly.storybookComponents.mod.IFrame, Unit, IFrameProps] = {
    val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookComponents.iframeMod.IFrameProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookComponents.mod.IFrame](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.iframeMod.IFrameProps])(children: _*)
  }
  @JSImport("@storybook/components", "IFrame")
  @js.native
  object componentImport extends js.Object
  
}

