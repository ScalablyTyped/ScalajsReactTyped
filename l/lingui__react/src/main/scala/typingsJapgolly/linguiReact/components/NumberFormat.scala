package typingsJapgolly.linguiReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsJapgolly.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberFormat {
  def apply(
    value: Double,
    className: String = null,
    format: NumberFormatOptions = null,
    render: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FormatPropsWithoutI18n[Double, NumberFormatOptions], 
    typingsJapgolly.linguiReact.mod.NumberFormat, 
    Unit, 
    FormatPropsWithoutI18n[Double, NumberFormatOptions]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiReact.createFormatMod.FormatPropsWithoutI18n[scala.Double, typingsJapgolly.std.Intl.NumberFormatOptions], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linguiReact.mod.NumberFormat](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiReact.createFormatMod.FormatPropsWithoutI18n[scala.Double, typingsJapgolly.std.Intl.NumberFormatOptions]])(children: _*)
  }
  @JSImport("@lingui/react", "NumberFormat")
  @js.native
  object componentImport extends js.Object
  
}

