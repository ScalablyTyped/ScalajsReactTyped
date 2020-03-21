package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.indexDotnativeMod.AccordionStyle
import typingsJapgolly.antdMobileRn.indexNativeMod.AccordionNativeProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply(
    activeKey: String | js.Array[String] = null,
    defaultActiveKey: String | js.Array[String] = null,
    onChange: /* x */ js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: AccordionStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AccordionNativeProps, 
    typingsJapgolly.antdMobileRn.mod.Accordion, 
    Unit, 
    AccordionNativeProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* x */ js.Any) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.indexNativeMod.AccordionNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Accordion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.indexNativeMod.AccordionNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Accordion")
  @js.native
  object componentImport extends js.Object
  
}

