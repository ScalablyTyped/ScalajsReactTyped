package typingsJapgolly.linguiMacro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiMacro.transMod.TransPropsWithoutI18n
import typingsJapgolly.linguiMacro.transMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trans {
  def apply(
    className: String = null,
    components: js.Array[Element] = null,
    defaults: String = null,
    description: String = null,
    formats: js.Object = null,
    id: String = null,
    render: VdomNode = null,
    values: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TransPropsWithoutI18n, default, Unit, TransPropsWithoutI18n] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiMacro.transMod.TransPropsWithoutI18n, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linguiMacro.transMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiMacro.transMod.TransPropsWithoutI18n])(children: _*)
  }
  @JSImport("@lingui/macro/Trans", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

