package typingsJapgolly.atFortawesomeReactDashFontawesome.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FaSymbol
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FlipProp
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.PullProp
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.RotateProp
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.SizeProp
import typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.Transform
import typingsJapgolly.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.FontAwesomeIconProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FontAwesomeIcon {
  def apply(
    icon: IconProp,
    border: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FlipProp = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    listItem: js.UndefOr[Boolean] = js.undefined,
    mask: IconProp = null,
    pull: PullProp = null,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotation: RotateProp = null,
    size: SizeProp = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    symbol: FaSymbol = null,
    tabIndex: Int | Double = null,
    title: String = null,
    transform: String | Transform = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FontAwesomeIconProps, 
    MountedWithRawType[FontAwesomeIconProps, js.Object, RawMounted[FontAwesomeIconProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
  
      if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.FontAwesomeIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.FontAwesomeIconProps])(children: _*)
  }
  @JSImport("@fortawesome/react-fontawesome", "FontAwesomeIcon")
  @js.native
  object componentImport extends js.Object
  
}

