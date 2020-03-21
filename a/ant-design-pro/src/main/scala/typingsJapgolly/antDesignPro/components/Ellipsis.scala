package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.ellipsisMod.EllipsisProps
import typingsJapgolly.antDesignPro.ellipsisMod.EllipsisTooltipProps
import typingsJapgolly.antDesignPro.ellipsisMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Ellipsis {
  def apply(
    className: String = null,
    fullWidthRecognition: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    lines: Int | Double = null,
    style: CSSProperties = null,
    tooltip: Boolean | EllipsisTooltipProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EllipsisProps, default, Unit, EllipsisProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidthRecognition)) __obj.updateDynamic("fullWidthRecognition")(fullWidthRecognition.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.ellipsisMod.EllipsisProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.ellipsisMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.ellipsisMod.EllipsisProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Ellipsis", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

