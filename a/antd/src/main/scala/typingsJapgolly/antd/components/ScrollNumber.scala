package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libBadgeScrollNumberMod.ScrollNumberProps
import typingsJapgolly.antd.libBadgeScrollNumberMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollNumber {
  def apply(
    className: String = null,
    component: String = null,
    count: String | Double = null,
    displayComponent: VdomElement = null,
    onAnimated: js.Function = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollNumberProps, default, Unit, ScrollNumberProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (displayComponent != null) __obj.updateDynamic("displayComponent")(displayComponent.rawElement.asInstanceOf[js.Any])
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libBadgeScrollNumberMod.ScrollNumberProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libBadgeScrollNumberMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libBadgeScrollNumberMod.ScrollNumberProps])(children: _*)
  }
  @JSImport("antd/lib/badge/ScrollNumber", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

