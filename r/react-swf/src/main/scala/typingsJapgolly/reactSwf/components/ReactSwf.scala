package typingsJapgolly.reactSwf.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSwf.mod.^
import typingsJapgolly.reactSwf.mod.rswf.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSwf {
  def apply(
    src: String,
    align: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    bgcolor: String = null,
    flashVars: js.Object | String = null,
    fullScreenAspectRatio: String = null,
    height: Int | Double = null,
    id: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    menu: js.UndefOr[Boolean] = js.undefined,
    play: js.UndefOr[Boolean] = js.undefined,
    pluginspage: String = null,
    quality: String = null,
    salign: String = null,
    scale: String = null,
    width: Int | Double = null,
    wmode: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (flashVars != null) __obj.updateDynamic("flashVars")(flashVars.asInstanceOf[js.Any])
    if (fullScreenAspectRatio != null) __obj.updateDynamic("fullScreenAspectRatio")(fullScreenAspectRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(menu)) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    if (pluginspage != null) __obj.updateDynamic("pluginspage")(pluginspage.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (salign != null) __obj.updateDynamic("salign")(salign.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSwf.mod.rswf.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSwf.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSwf.mod.rswf.Props])(children: _*)
  }
  @JSImport("react-swf", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

