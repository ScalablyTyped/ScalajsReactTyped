package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.mod.Guide.Image
import typingsJapgolly.bizcharts.mod.Guide.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GuideImage {
  def apply(
    end: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    height: Int | Double = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    src: String = null,
    start: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _]) = null,
    top: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageProps, Image, Unit, ImageProps] = {
    val __obj = js.Dynamic.literal()
  
      if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.bizcharts.mod.Guide.ImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.bizcharts.mod.Guide.Image](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.bizcharts.mod.Guide.ImageProps])(children: _*)
  }
  @JSImport("bizcharts", "Guide.Image")
  @js.native
  object componentImport extends js.Object
  
}

