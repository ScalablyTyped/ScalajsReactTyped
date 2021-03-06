package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.checkableTagMod.CheckableTagProps
import typingsJapgolly.antd.checkableTagMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckableTag {
  def apply(
    checked: Boolean,
    className: String = null,
    onChange: /* checked */ Boolean => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckableTagProps, default, Unit, CheckableTagProps] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.checkableTagMod.CheckableTagProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.checkableTagMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.checkableTagMod.CheckableTagProps])(children: _*)
  }
  @JSImport("antd/lib/tag/CheckableTag", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

