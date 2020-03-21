package typingsJapgolly.rebassGrid.mod

import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.AlignSelfProperty
import typingsJapgolly.csstype.mod.FlexProperty
import typingsJapgolly.csstype.mod.GlobalsNumber
import typingsJapgolly.csstype.mod.WidthProperty
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.rebassGrid.rebassGridStrings.colors
import typingsJapgolly.rebassGrid.rebassGridStrings.fontSizes
import typingsJapgolly.rebassGrid.rebassGridStrings.space
import typingsJapgolly.styledSystem.mod.AlignSelfProps
import typingsJapgolly.styledSystem.mod.BackgroundColorProps
import typingsJapgolly.styledSystem.mod.FontSizeProps
import typingsJapgolly.styledSystem.mod.OpacityProps
import typingsJapgolly.styledSystem.mod.OrderProps
import typingsJapgolly.styledSystem.mod.RequiredTheme
import typingsJapgolly.styledSystem.mod.ResponsiveValue
import typingsJapgolly.styledSystem.mod.SpaceProps
import typingsJapgolly.styledSystem.mod.TLengthStyledSystem
import typingsJapgolly.styledSystem.mod.TextColorProps
import typingsJapgolly.styledSystem.mod.ThemeValue
import typingsJapgolly.styledSystem.mod.WidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKnownProps
  extends BaseProps
     with SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with WidthProps[RequiredTheme, WidthProperty[TLengthStyledSystem]]
     with FontSizeProps[RequiredTheme, ThemeValue[fontSizes, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme]
     with typingsJapgolly.styledSystem.mod.FlexProps[RequiredTheme, FlexProperty[TLengthStyledSystem]]
     with OrderProps[RequiredTheme]
     with AlignSelfProps[RequiredTheme]

object BoxKnownProps {
  @scala.inline
  def apply(
    alignSelf: ResponsiveValue[AlignSelfProperty, RequiredTheme] = null,
    as: ElementType = null,
    backgroundColor: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    bg: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    children: VdomNode = null,
    color: ResponsiveValue[ThemeValue[colors, RequiredTheme, js.Any], RequiredTheme] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem], RequiredTheme] = null,
    fontSize: ResponsiveValue[ThemeValue[fontSizes, RequiredTheme, js.Any], RequiredTheme] = null,
    key: Key = null,
    m: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    margin: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    marginY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    ml: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    mx: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    my: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    opacity: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    order: ResponsiveValue[GlobalsNumber, RequiredTheme] = null,
    p: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    padding: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingBottom: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingLeft: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingRight: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingTop: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingX: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    paddingY: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pb: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pl: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pr: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    pt: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    px: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    py: ResponsiveValue[ThemeValue[space, RequiredTheme, js.Any], RequiredTheme] = null,
    ref: LegacyRef[js.Any] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem], RequiredTheme] = null
  ): BoxKnownProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKnownProps]
  }
}

