package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.HeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Heading {
  def apply(
    bgColor: String = null,
    bgDarken: Int | Double = null,
    bgImage: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    caps: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    lineHeight: Int | Double = null,
    margin: Double | String = null,
    padding: Double | String = null,
    size: Int | Double = null,
    style: CSSProperties = null,
    textAlign: String = null,
    textColor: String = null,
    textFont: String = null,
    textSize: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HeadingProps, typingsJapgolly.spectacle.mod.Heading, Unit, HeadingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (bgDarken != null) __obj.updateDynamic("bgDarken")(bgDarken.asInstanceOf[js.Any])
    if (bgImage != null) __obj.updateDynamic("bgImage")(bgImage.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(caps)) __obj.updateDynamic("caps")(caps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textFont != null) __obj.updateDynamic("textFont")(textFont.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.HeadingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Heading](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.HeadingProps])(children: _*)
  }
  @JSImport("spectacle", "Heading")
  @js.native
  object componentImport extends js.Object
  
}

