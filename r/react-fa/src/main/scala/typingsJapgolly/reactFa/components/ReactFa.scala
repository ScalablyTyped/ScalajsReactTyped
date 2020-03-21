package typingsJapgolly.reactFa.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFa.mod.CustomComponent
import typingsJapgolly.reactFa.mod.IconFlip
import typingsJapgolly.reactFa.mod.IconProps
import typingsJapgolly.reactFa.mod.IconRotation
import typingsJapgolly.reactFa.mod.IconSize
import typingsJapgolly.reactFa.mod.IconStackSize
import typingsJapgolly.reactFa.mod.SizeOverrideHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFa {
  def apply(
    name: String,
    Component: CustomComponent = null,
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[Component[IconProps with js.Object, js.Object]] = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: IconFlip = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotate: IconRotation = null,
    size: IconSize = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    stack: IconStackSize = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IconProps, 
    MountedWithRawType[IconProps, js.Object, RawMounted[IconProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (SizeOverrideHTMLProps != null) js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFa.mod.IconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFa.mod.IconProps])(children: _*)
  }
  @JSImport("react-fa", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

