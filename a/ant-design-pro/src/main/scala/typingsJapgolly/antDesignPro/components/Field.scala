package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.fieldMod.IFieldProps
import typingsJapgolly.antDesignPro.fieldMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Field {
  def apply(
    label: VdomNode = null,
    style: CSSProperties = null,
    value: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IFieldProps, default, Unit, IFieldProps] = {
    val __obj = js.Dynamic.literal()
  
      if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.fieldMod.IFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.fieldMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.fieldMod.IFieldProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Charts/Field", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

