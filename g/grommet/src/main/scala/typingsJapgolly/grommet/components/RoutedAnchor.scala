package typingsJapgolly.grommet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.grommet.RoutedAnchorPropsOmitAnch
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.push
import typingsJapgolly.grommet.grommetStrings.replace
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.ColorType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RoutedAnchor {
  def apply(
    path: String,
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    as: PolymorphicType = null,
    color: ColorType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    icon: VdomElement = null,
    label: VdomNode = null,
    margin: MarginType = null,
    method: push | replace = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | xxlarge | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RoutedAnchorPropsOmitAnch, 
    typingsJapgolly.grommet.mod.RoutedAnchor, 
    Unit, 
    RoutedAnchorPropsOmitAnch
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
      if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommet.RoutedAnchorPropsOmitAnch, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.grommet.mod.RoutedAnchor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommet.RoutedAnchorPropsOmitAnch])(children: _*)
  }
  @JSImport("grommet", "RoutedAnchor")
  @js.native
  object componentImport extends js.Object
  
}

