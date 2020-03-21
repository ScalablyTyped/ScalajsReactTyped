package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.round
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.elementMod.SkeletonElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Element {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    shape: circle | square | round = null,
    size: large | small | default | Double = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SkeletonElementProps, 
    typingsJapgolly.antd.elementMod.default, 
    Unit, 
    SkeletonElementProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.elementMod.SkeletonElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.elementMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.elementMod.SkeletonElementProps])(children: _*)
  }
  @JSImport("antd/lib/skeleton/Element", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

