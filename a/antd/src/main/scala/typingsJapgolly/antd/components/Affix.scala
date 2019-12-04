package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsJapgolly.antd.libAffixMod.AffixProps
import typingsJapgolly.antd.libAffixMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Affix {
  def apply(
    className: String = null,
    offset: Int | Double = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChange: /* affixed */ js.UndefOr[Boolean] => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    target: js.UndefOr[CallbackTo[Window | HTMLElement | Null]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AffixProps, default, Unit, AffixProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* affixed */ js.UndefOr[scala.Boolean]) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    target.foreach(p => __obj.updateDynamic("target")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libAffixMod.AffixProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libAffixMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libAffixMod.AffixProps])(children: _*)
  }
  @JSImport("antd/lib/affix", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

