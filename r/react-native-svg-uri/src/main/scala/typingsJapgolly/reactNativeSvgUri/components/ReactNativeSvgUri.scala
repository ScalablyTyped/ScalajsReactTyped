package typingsJapgolly.reactNativeSvgUri.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativeSvgUri.mod.SvgUriProps
import typingsJapgolly.reactNativeSvgUri.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSvgUri {
  def apply(
    fill: String = null,
    height: Double | String = null,
    source: ImageURISource = null,
    svgXmlData: String = null,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SvgUriProps, default, Unit, SvgUriProps] = {
    val __obj = js.Dynamic.literal()
  
      if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgXmlData != null) __obj.updateDynamic("svgXmlData")(svgXmlData.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeSvgUri.mod.SvgUriProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeSvgUri.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeSvgUri.mod.SvgUriProps])(children: _*)
  }
  @JSImport("react-native-svg-uri", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

