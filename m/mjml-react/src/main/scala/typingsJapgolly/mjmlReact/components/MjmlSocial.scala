package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.horizontal
import typingsJapgolly.mjmlReact.mjmlReactStrings.vertical
import typingsJapgolly.mjmlReact.mod.MjmlSocialProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocial {
  def apply(
    align: String = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    iconHeight: String = null,
    iconSize: String = null,
    innerPadding: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    textDecoration: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlSocialProps with PaddingProps, 
    typingsJapgolly.mjmlReact.mod.MjmlSocial, 
    Unit, 
    MjmlSocialProps with PaddingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlSocialProps with typingsJapgolly.mjmlReact.mod.PaddingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlSocial](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlSocialProps with typingsJapgolly.mjmlReact.mod.PaddingProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlSocial")
  @js.native
  object componentImport extends js.Object
  
}

