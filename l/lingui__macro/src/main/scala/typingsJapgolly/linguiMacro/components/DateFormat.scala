package typingsJapgolly.linguiMacro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateFormat {
  def apply(
    value: js.Date,
    className: String = null,
    description: String = null,
    format: DateTimeFormatOptions = null,
    render: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], 
    typingsJapgolly.linguiMacro.mod.DateFormat, 
    Unit, 
    FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiMacro.createFormatMod.FormatPropsWithoutI18n[js.Date, typingsJapgolly.std.Intl.DateTimeFormatOptions], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linguiMacro.mod.DateFormat](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiMacro.createFormatMod.FormatPropsWithoutI18n[js.Date, typingsJapgolly.std.Intl.DateTimeFormatOptions]])(children: _*)
  }
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  object componentImport extends js.Object
  
}

