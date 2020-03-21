package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsJapgolly.antDesignPro.tagSelectOptionMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagSelectOption {
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* value */ String | Double, /* state */ Boolean) => Callback = null,
    style: CSSProperties = null,
    value: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TagSelectOptionProps, default, Unit, TagSelectOptionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String | scala.Double, t1: /* state */ scala.Boolean) => onChange(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.tagSelectOptionMod.TagSelectOptionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.tagSelectOptionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.tagSelectOptionMod.TagSelectOptionProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

