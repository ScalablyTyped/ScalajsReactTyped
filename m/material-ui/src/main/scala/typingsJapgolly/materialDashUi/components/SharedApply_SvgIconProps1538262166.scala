package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.SvgIconProps
import typingsJapgolly.react.reactMod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SvgIconProps1538262166[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    SVGAttributes: SVGAttributes[js.Object] = null,
    hoverColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SvgIconProps, ComponentRef, Unit, SvgIconProps] = {
    val __obj = js.Dynamic.literal()
  
      if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.SvgIconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.SvgIconProps])(children: _*)
  }
}

