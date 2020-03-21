package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.BorderProperty
import typingsJapgolly.csstype.mod.BorderRadiusProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.hidden
import typingsJapgolly.mjmlReact.mjmlReactStrings.visible
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlCarouselProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlCarousel {
  def apply(
    align: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    cssClass: String = null,
    iconWidth: String = null,
    leftIcon: String = null,
    rightIcon: String = null,
    tbBorder: BorderProperty[String | Double] = null,
    tbBorderRadius: BorderRadiusProperty[String | Double] = null,
    tbHoverBorderColor: String = null,
    tbSelectedBorderColor: String = null,
    tbWidth: String = null,
    thumbnails: hidden | visible = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RequiredChildrenProps with MjmlCarouselProps with ClassNameProps, 
    typingsJapgolly.mjmlReact.mod.MjmlCarousel, 
    Unit, 
    RequiredChildrenProps with MjmlCarouselProps with ClassNameProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (tbBorder != null) __obj.updateDynamic("tbBorder")(tbBorder.asInstanceOf[js.Any])
    if (tbBorderRadius != null) __obj.updateDynamic("tbBorderRadius")(tbBorderRadius.asInstanceOf[js.Any])
    if (tbHoverBorderColor != null) __obj.updateDynamic("tbHoverBorderColor")(tbHoverBorderColor.asInstanceOf[js.Any])
    if (tbSelectedBorderColor != null) __obj.updateDynamic("tbSelectedBorderColor")(tbSelectedBorderColor.asInstanceOf[js.Any])
    if (tbWidth != null) __obj.updateDynamic("tbWidth")(tbWidth.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlCarouselProps with typingsJapgolly.mjmlReact.mod.ClassNameProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlCarousel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.RequiredChildrenProps with typingsJapgolly.mjmlReact.mod.MjmlCarouselProps with typingsJapgolly.mjmlReact.mod.ClassNameProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlCarousel")
  @js.native
  object componentImport extends js.Object
  
}

