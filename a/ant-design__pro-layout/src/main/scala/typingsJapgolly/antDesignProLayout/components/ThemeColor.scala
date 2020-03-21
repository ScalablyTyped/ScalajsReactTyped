package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.AnonColor
import typingsJapgolly.antDesignProLayout.AnonDefaultMessage
import typingsJapgolly.antDesignProLayout.themeColorMod.ThemeColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeColor {
  def apply(
    value: String,
    formatMessage: AnonDefaultMessage => CallbackTo[String],
    onChange: String => Callback,
    colors: js.Array[AnonColor] = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ThemeColorProps, 
    MountedWithRawType[ThemeColorProps, js.Object, RawMounted[ThemeColorProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: typingsJapgolly.antDesignProLayout.AnonDefaultMessage) => formatMessage(t0).runNow()))
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.themeColorMod.ThemeColorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.themeColorMod.ThemeColorProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/ThemeColor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

