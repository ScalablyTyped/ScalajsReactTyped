package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.auto
import typingsJapgolly.mjmlReact.mjmlReactStrings.center
import typingsJapgolly.mjmlReact.mjmlReactStrings.fixed
import typingsJapgolly.mjmlReact.mjmlReactStrings.inherit
import typingsJapgolly.mjmlReact.mjmlReactStrings.initial
import typingsJapgolly.mjmlReact.mjmlReactStrings.left
import typingsJapgolly.mjmlReact.mjmlReactStrings.right
import typingsJapgolly.mjmlReact.mod.MjmlTableProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlTable {
  def apply(
    align: left | right | center = null,
    cellpadding: String = null,
    cellspacing: String = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    lineHeight: String | Double = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    tableLayout: auto | fixed | initial | inherit = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlTableProps with RequiredChildrenProps with PaddingProps, 
    typingsJapgolly.mjmlReact.mod.MjmlTable, 
    Unit, 
    MjmlTableProps with RequiredChildrenProps with PaddingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (cellpadding != null) __obj.updateDynamic("cellpadding")(cellpadding.asInstanceOf[js.Any])
    if (cellspacing != null) __obj.updateDynamic("cellspacing")(cellspacing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlTableProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.PaddingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlTable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlTableProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.PaddingProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlTable")
  @js.native
  object componentImport extends js.Object
  
}

