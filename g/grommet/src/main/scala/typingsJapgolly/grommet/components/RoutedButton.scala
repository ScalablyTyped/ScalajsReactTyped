package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.buttonMod.ButtonProps
import typingsJapgolly.grommet.grommetStrings._blank
import typingsJapgolly.grommet.grommetStrings._parent
import typingsJapgolly.grommet.grommetStrings._self
import typingsJapgolly.grommet.grommetStrings._top
import typingsJapgolly.grommet.grommetStrings.button
import typingsJapgolly.grommet.grommetStrings.push
import typingsJapgolly.grommet.grommetStrings.replace
import typingsJapgolly.grommet.grommetStrings.reset
import typingsJapgolly.grommet.grommetStrings.submit
import typingsJapgolly.grommet.routedButtonMod.RoutedButtonProps
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.BackgroundType
import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod.FillType
import typingsJapgolly.grommet.utilsMod.GapType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RoutedButton {
  def apply(
    path: String,
    a11yTitle: A11yTitleType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    alignSelf: AlignSelfType = null,
    as: PolymorphicType = null,
    color: ColorType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: FillType = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    hoverIndicator: BackgroundType | Boolean = null,
    href: String = null,
    icon: VdomElement = null,
    label: VdomNode = null,
    margin: MarginType = null,
    method: push | replace = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    target: _self | _blank | _parent | _top = null,
    `type`: button | reset | submit = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RoutedButtonProps with ButtonProps, 
    typingsJapgolly.grommet.mod.RoutedButton, 
    Unit, 
    RoutedButtonProps with ButtonProps
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
      if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.routedButtonMod.RoutedButtonProps with typingsJapgolly.grommet.buttonMod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.grommet.mod.RoutedButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.routedButtonMod.RoutedButtonProps with typingsJapgolly.grommet.buttonMod.ButtonProps])(children: _*)
  }
  @JSImport("grommet", "RoutedButton")
  @js.native
  object componentImport extends js.Object
  
}

