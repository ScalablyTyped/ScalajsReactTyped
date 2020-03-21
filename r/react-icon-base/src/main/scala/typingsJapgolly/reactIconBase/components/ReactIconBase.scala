package typingsJapgolly.reactIconBase.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactIconBase.mod.IconBaseProps
import typingsJapgolly.reactIconBase.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactIconBase {
  def apply(
    ClassAttributes: ClassAttributes[ReactSVGElement] = null,
    SVGAttributes: SVGAttributes[ReactSVGElement] = null,
    size: String | Double = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IconBaseProps, default, Unit, IconBaseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactIconBase.mod.IconBaseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactIconBase.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIconBase.mod.IconBaseProps])(children: _*)
  }
  @JSImport("react-icon-base", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

