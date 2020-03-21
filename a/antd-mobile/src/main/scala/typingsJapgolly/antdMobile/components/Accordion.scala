package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.accordionMod.AccordionProps
import typingsJapgolly.antdMobile.accordionMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: String | js.Array[String] = null,
    className: String = null,
    defaultActiveKey: String | js.Array[String] = null,
    onChange: /* x */ js.Any => Callback = null,
    openAnimation: js.Any = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AccordionProps, default, Unit, AccordionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* x */ js.Any) => onChange(t0).runNow()))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.accordionMod.AccordionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.accordionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.accordionMod.AccordionProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

