package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libTypographyEditableMod.EditableProps
import typingsJapgolly.antd.libTypographyEditableMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editable {
  def apply(
    onCancel: Callback,
    onSave: String => Callback,
    `aria-label`: String = null,
    className: String = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EditableProps, default, Unit, EditableProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSave")(js.Any.fromFunction1((t0: java.lang.String) => onSave(t0).runNow()))
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTypographyEditableMod.EditableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTypographyEditableMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTypographyEditableMod.EditableProps])(children: _*)
  }
  @JSImport("antd/lib/typography/Editable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

