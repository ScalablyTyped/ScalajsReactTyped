package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BackgroundColorProperty
import typingsJapgolly.csstype.mod.BackgroundPositionProperty
import typingsJapgolly.csstype.mod.VerticalAlignProperty
import typingsJapgolly.mjmlReact.mjmlReactStrings.`fixed-height`
import typingsJapgolly.mjmlReact.mjmlReactStrings.`fluid-height`
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.MjmlHeroProps
import typingsJapgolly.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlHero {
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    backgroundHeight: String = null,
    backgroundPosition: BackgroundPositionProperty[String | Double] = null,
    backgroundUrl: String = null,
    backgroundWidth: String = null,
    cssClass: String = null,
    height: String | Double = null,
    mode: `fluid-height` | `fixed-height` = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlHeroProps with ClassNameProps with PaddingProps, 
    typingsJapgolly.mjmlReact.mod.MjmlHero, 
    Unit, 
    MjmlHeroProps with ClassNameProps with PaddingProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundHeight != null) __obj.updateDynamic("backgroundHeight")(backgroundHeight.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl.asInstanceOf[js.Any])
    if (backgroundWidth != null) __obj.updateDynamic("backgroundWidth")(backgroundWidth.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlHeroProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.PaddingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlHero](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlHeroProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.PaddingProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlHero")
  @js.native
  object componentImport extends js.Object
  
}

