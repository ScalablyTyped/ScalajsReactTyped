package typingsJapgolly.reactContentLoader.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactContentLoader.mod.IContentLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IContentLoaderProps2108461114 () {
  val componentImport: js.Any
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    gradientRatio: Int | Double = null,
    interval: Int | Double = null,
    primaryColor: String = null,
    primaryOpacity: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: Int | Double = null,
    speed: Int | Double = null,
    uniquekey: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IContentLoaderProps, 
    MountedWithRawType[IContentLoaderProps, js.Object, RawMounted[IContentLoaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (gradientRatio != null) __obj.updateDynamic("gradientRatio")(gradientRatio.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (primaryOpacity != null) __obj.updateDynamic("primaryOpacity")(primaryOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (secondaryOpacity != null) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactContentLoader.mod.IContentLoaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactContentLoader.mod.IContentLoaderProps])(children: _*)
  }
}

