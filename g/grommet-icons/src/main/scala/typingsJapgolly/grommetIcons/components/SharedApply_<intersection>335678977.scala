package typingsJapgolly.grommetIcons.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.grommetIcons.grommetIconsStrings.large
import typingsJapgolly.grommetIcons.grommetIconsStrings.medium
import typingsJapgolly.grommetIcons.grommetIconsStrings.small
import typingsJapgolly.grommetIcons.grommetIconsStrings.xlarge
import typingsJapgolly.grommetIcons.iconsMod.IconProps
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class `SharedApply_<intersection>335678977`[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    a11yTitle: String = null,
    color: String = null,
    size: small | medium | large | xlarge | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IconProps with SVGProps[SVGSVGElement], 
    ComponentRef, 
    Unit, 
    IconProps with SVGProps[SVGSVGElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.grommetIcons.iconsMod.IconProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement], 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.grommetIcons.iconsMod.IconProps with typingsJapgolly.react.mod.SVGProps[org.scalajs.dom.raw.SVGSVGElement]])(children: _*)
  }
}

