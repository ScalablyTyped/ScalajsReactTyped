package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.headerSearchMod.HeaderSearchProps
import typingsJapgolly.antDesignPro.headerSearchMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderSearch {
  def apply(
    className: String = null,
    dataSource: js.Array[String] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Callback = null,
    onPressEnter: /* value */ String => Callback = null,
    onSearch: /* value */ String => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HeaderSearchProps, default, Unit, HeaderSearchProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onPressEnter(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onSearch(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.headerSearchMod.HeaderSearchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.headerSearchMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.headerSearchMod.HeaderSearchProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/HeaderSearch", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

