package typingsJapgolly.reactSpinners.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typingsJapgolly.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LoaderHeightWidthRadiusProps240530365[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: Int | Double = null,
    heightUnit: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    radius: Int | Double = null,
    radiusUnit: String = null,
    width: Int | Double = null,
    widthUnit: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LoaderHeightWidthRadiusProps, ComponentRef, Unit, LoaderHeightWidthRadiusProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusUnit != null) __obj.updateDynamic("radiusUnit")(radiusUnit.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps])(children: _*)
  }
}

